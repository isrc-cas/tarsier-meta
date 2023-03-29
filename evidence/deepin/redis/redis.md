# deepin redis测试



## 测试环境



硬件环境：visionfive v1

系统：Deepin 23 GNU/Linux



## 安装并启动


```
root@deepin-riscv:~# echo 'redis_enable="YES"' >> /etc/rc.conf

root@deepin-riscv:~# service redis start

root@deepin-riscv:~# redis-server --version

Redis server v=6.0.16 sha=00000000:0 malloc=jemalloc-5.2.1 bits=64 build=7a6668740eaa5b5b

```


## 测试

redis-benchmark -n 10000 -q

```
root@deepin-riscv:~# redis-benchmark -n 10000 -q
PING_INLINE: 14662.76 requests per second
PING_BULK: 14367.82 requests per second
SET: 14598.54 requests per second
GET: 14577.26 requests per second
INCR: 14814.81 requests per second
LPUSH: 15037.59 requests per second
RPUSH: 14684.29 requests per second
LPOP: 14992.50 requests per second
RPOP: 14534.88 requests per second
SADD: 14727.54 requests per second
HSET: 14814.81 requests per second
SPOP: 14367.82 requests per second
ZADD: 14880.95 requests per second
ZPOPMIN: 14619.88 requests per second
LPUSH (needed to benchmark LRANGE): 14771.05 requests per second
LRANGE_100 (first 100 elements): 5595.97 requests per second
LRANGE_300 (first 300 elements): 2016.94 requests per second
LRANGE_500 (first 450 elements): 1259.76 requests per second
LRANGE_600 (first 600 elements): 978.09 requests per second
MSET (10 keys): 9940.36 requests per second


```

redis-benchmark -t set,get,incr -n 100000 -q

```

root@deepin-riscv:~# redis-benchmark -t set,get,incr -n 100000 -q
SET: 14736.22 requests per second
GET: 14747.09 requests per second
INCR: 14725.37 requests per second

```

redis-benchmark -t set,get,incr -n 100000 -q -P 10

```

root@deepin-riscv:~# redis-benchmark -t set,get,incr -n 100000 -q -P 10
SET: 59154.35 requests per second
GET: 74497.39 requests per second
INCR: 69561.89 requests per second



```

## 随机Key测试

redis-cli flushdb

redis-cli keys \*

redis-benchmark -t set -n 10000 -q

```
root@deepin-riscv:~# redis-cli flushdb
OK
root@deepin-riscv:~# redis-cli keys \*
(empty array)
root@deepin-riscv:~# redis-benchmark -t set -n 10000 -q
SET: 14388.49 requests per second

```

redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 10

```
root@deepin-riscv:~# redis-cli keys \*
1) "key:__rand_int__"
root@deepin-riscv:~# redis-cli flushdb
OK
root@deepin-riscv:~# redis-benchmark -t set -n 10000 -q -r 10
SET: 13927.58 requests per second


```


redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 100

```
 root@deepin-riscv:~# redis-cli keys \*
 1) "key:000000000004"
 2) "key:000000000006"
 3) "key:000000000000"
 4) "key:000000000002"
 5) "key:000000000008"
 6) "key:000000000005"
 7) "key:000000000007"
 8) "key:000000000003"
 9) "key:000000000001"
10) "key:000000000009"
root@deepin-riscv:~# redis-cli flushdb
OK
root@deepin-riscv:~# redis-benchmark -t set -n 10000 -q -r 100
SET: 13986.01 requests per second

```


redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 1000

```
root@deepin-riscv:~# redis-cli flushdb
OK
root@deepin-riscv:~# redis-benchmark -t set -n 10000 -q -r 1000
SET: 13908.21 requests per second


```


redis-cli flushdb

redis-benchmark -t set -n 100000 -q -r 1000000

```
root@deepin-riscv:~# redis-cli flushdb
OK
root@deepin-riscv:~# redis-benchmark -t set -n 100000 -q -r 1000000
SET: 14166.31 requests per second


```