# Redis 测试

## Redis 安装

进行安装：

```bash
# pkg install redis
```

检查安装是否成功

```bash
# redis-server --version
Redis server v=6.2.6 sha=00000000:0 malloc=libc bits=64 build=ebffcfe26ea49fe
```

注册redis为系统服务，使用service命令管理redis

```bash
# echo 'redis_enable="YES"' >> /etc/rc.conf
```

启动redis-server

```bash
# service redis start
redis is running as pid 1071.
```

## Redis 测试

查看测试帮助

```bash
# redis-benchmark --help
Usage: redis-benchmark [-h <host>] [-p <port>] [-c <clients>] [-n <requests>] [-k <boolean>]

 -h <hostname>      Server hostname (default 127.0.0.1)
 -p <port>          Server port (default 6379)
 -s <socket>        Server socket (overrides host and port)
 -a <password>      Password for Redis Auth
 --user <username>  Used to send ACL style 'AUTH username pass'. Needs -a.
 -c <clients>       Number of parallel connections (default 50)
 -n <requests>      Total number of requests (default 100000)
 -d <size>          Data size of SET/GET value in bytes (default 3)
 --dbnum <db>       SELECT the specified db number (default 0)
 --threads <num>    Enable multi-thread mode.
 --cluster          Enable cluster mode.
 --enable-tracking  Send CLIENT TRACKING on before starting benchmark.
 -k <boolean>       1=keep alive 0=reconnect (default 1)
 -r <keyspacelen>   Use random keys for SET/GET/INCR, random values for SADD,
                    random members and scores for ZADD.
  Using this option the benchmark will expand the string __rand_int__
  inside an argument with a 12 digits number in the specified range
  from 0 to keyspacelen-1. The substitution changes every time a command
  is executed. Default tests use this to hit random keys in the
  specified range.
 -P <numreq>        Pipeline <numreq> requests. Default 1 (no pipeline).
 -q                 Quiet. Just show query/sec values
 --precision        Number of decimal places to display in latency output (default 0)
 --csv              Output in CSV format
 -l                 Loop. Run the tests forever
 -t <tests>         Only run the comma separated list of tests. The test
                    names are the same as the ones produced as output.
 -I                 Idle mode. Just open N idle connections and wait.
 --help             Output this help and exit.
 --version          Output version and exit.

Examples:

 Run the benchmark with the default configuration against 127.0.0.1:6379:
   $ redis-benchmark

 Use 20 parallel clients, for a total of 100k requests, against 192.168.1.1:
   $ redis-benchmark -h 192.168.1.1 -p 6379 -n 100000 -c 20

 Fill 127.0.0.1:6379 with about 1 million keys only using the SET test:
   $ redis-benchmark -t set -n 1000000 -r 100000000

 Benchmark 127.0.0.1:6379 for a few commands producing CSV output:
   $ redis-benchmark -t ping,set,get -n 100000 --csv

 Benchmark a specific command line:
   $ redis-benchmark -r 10000 -n 10000 eval 'return redis.call("ping")' 0

 Fill a list with 10000 random elements:
   $ redis-benchmark -r 10000 -n 10000 lpush mylist __rand_int__

 On user specified command lines __rand_int__ is replaced with a random integer
 with a range of values selected by the -r option.
```

### 快速测试

```bash
# redis-benchmark
```

在测试的过程中，我们发现仅仅只有1500左右的QPS，非常缓慢。为了避免浪费大量时间，于是主动设置测试总数为10000，而非默认的100000

```bash
# redis-benchmark -n 10000
# 输出太长下略
```

可以看到输出了非常多的东西。那接下来添加精简参数命令。

```bash
# redis-benchmark -n 10000 -q
PING_INLINE: 1577.54 requests per second, p50=15.903 msec
PING_MBULK: 1593.63 requests per second, p50=15.879 msec
SET: 1590.08 requests per second, p50=15.783 msec
GET: 1577.78 requests per second, p50=15.943 msec
INCR: 1495.66 requests per second, p50=16.543 msec
LPUSH: 1522.77 requests per second, p50=16.607 msec
RPUSH: 1528.35 requests per second, p50=16.591 msec
LPOP: 1537.04 requests per second, p50=16.511 msec
RPOP: 1539.88 requests per second, p50=16.431 msec
SADD: 1552.07 requests per second, p50=16.375 msec
HSET: 1559.58 requests per second, p50=16.223 msec
SPOP: 1517.68 requests per second, p50=16.607 msec
ZADD: 1440.71 requests per second, p50=17.519 msec
ZPOPMIN: 1477.76 requests per second, p50=17.071 msec
LPUSH (needed to benchmark LRANGE): 1448.65 requests per second, p50=17.007 msec
LRANGE_100 (first 100 elements): 829.12 requests per second, p50=30.063 msec
LRANGE_300 (first 300 elements): 454.86 requests per second, p50=54.431 msec
LRANGE_500 (first 500 elements): 317.11 requests per second, p50=77.567 msec
LRANGE_600 (first 600 elements): 277.41 requests per second, p50=88.895 msec
MSET (10 keys): 1499.48 requests per second, p50=16.671 msec
```

### 精简测试

加大测试量，减小测试项。通过-t参数设置测试项

```bash
# redis-benchmark -t set,get,incr -n 100000 -q
SET: 1563.48 requests per second, p50=15.935 msec
GET: 1477.21 requests per second, p50=16.863 msec
INCR: 1493.83 requests per second, p50=16.703 msec
```

### pipeline 测试

通过 -p 参数，设置每个 pipeline 执行 10 次 Redis 命令。

```bash
# redis-benchmark -t set,get,incr -n 100000 -q -P 10
SET: 14025.25 requests per second, p50=17.855 msec
GET: 13927.58 requests per second, p50=17.983 msec
INCR: 14568.76 requests per second, p50=17.487 msec
```

对比上面精简测试，确实提升了8-10倍的速度	

### 随机key测试

```bash
# redis-cli flushdb
OK
# redis-cli keys \*
(empty array)
# redis-benchmark -t set -n 10000 -q
SET: 1537.04 requests per second, p50=15.935 msec

# redis-cli keys \*
1) "key:__rand_int__"
# redis-cli flushdb
OK
# redis-benchmark -t set -n 10000 -q -r 10
SET: 1589.57 requests per second, p50=15.847 msec

# redis-cli keys \*
 1) "key:000000000007"
 2) "key:000000000001"
 3) "key:000000000005"
 4) "key:000000000003"
 5) "key:000000000002"
 6) "key:000000000009"
 7) "key:000000000008"
 8) "key:000000000006"
 9) "key:000000000000"
10) "key:000000000004"
# redis-cli flushdb
OK
# redis-benchmark -t set -n 10000 -q -r 100
SET: 1623.90 requests per second, p50=15.551 msec

# redis-cli flushdb
OK
# redis-benchmark -t set -n 10000 -q -r 1000
SET: 1627.07 requests per second, p50=15.479 msec

# redis-cli flushdb
OK
root@freebsd:~ # redis-benchmark -t set -n 100000 -q -r 1000000
SET: 1580.73 requests per second, p50=15.895 msec
```

发现随机key对速度影响不是很大。