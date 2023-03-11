# openEuler redis测试



## 测试环境



硬件环境：Lichee RV Dock

系统：oe2203.riscv64 (6.1.0-0.rc3.8.oe2203.riscv64)

redis-4.0.14-1.oe2203.riscv64

## 安装并启动


```
redis-server --version

Redis server v=4.0.14 sha=00000000:0 malloc=jemalloc-4.0.3 bits=64 build=a490728d326c2dd2


redis-server
```


## 测试

redis-benchmark -n 10000 -q
```
[root@openEuler-riscv64 ~]# redis-benchmark -n 10000 -q
PING_INLINE: 1585.79 requests per second
PING_BULK: 1848.43 requests per second
SET: 1750.09 requests per second
GET: 1794.69 requests per second
INCR: 1696.93 requests per second
LPUSH: 1880.05 requests per second
RPUSH: 1768.97 requests per second
LPOP: 1758.40 requests per second
RPOP: 1712.92 requests per second
SADD: 1770.85 requests per second
HSET: 1824.82 requests per second
SPOP: 1807.01 requests per second
LPUSH (needed to benchmark LRANGE): 1864.98 requests per second
LRANGE_100 (first 100 elements): 1104.85 requests per second
LRANGE_300 (first 300 elements): 589.07 requests per second
LRANGE_500 (first 450 elements): 450.25 requests per second
LRANGE_600 (first 600 elements): 325.52 requests per second
MSET (10 keys): 1785.08 requests per second

```

redis-benchmark -t set,get,incr -n 100000 -q

```
[root@openEuler-riscv64 ~]# redis-benchmark -t set,get,incr -n 100000 -q
SET: 1736.99 requests per second
GET: 1749.41 requests per second
INCR: 1752.42 requests per second

```

redis-benchmark -t set,get,incr -n 100000 -q -P 10

```
[root@openEuler-riscv64 ~]# redis-benchmark -t set,get,incr -n 100000 -q -P 10
SET: 13800.72 requests per second
GET: 16043.64 requests per second
INCR: 15262.52 requests per second

```

## 随机Key测试

redis-cli flushdb

redis-cli keys \*

redis-benchmark -t set -n 10000 -q

```

[root@openEuler-riscv64 ~]# redis-cli flushdb
OK
[root@openEuler-riscv64 ~]# redis-cli keys \*
(empty list or set)
[root@openEuler-riscv64 ~]# redis-benchmark -t set -n 10000 -q
SET: 1544.16 requests per second


```

redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 10

```
[root@openEuler-riscv64 ~]# redis-cli keys \*
1) "key:__rand_int__"
[root@openEuler-riscv64 ~]# redis-cli flushdb
OK
[root@openEuler-riscv64 ~]# redis-benchmark -t set -n 10000 -q -r 10
SET: 1755.62 requests per second


```


redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 100

```
[root@openEuler-riscv64 ~]# redis-cli keys \*
 1) "key:000000000006"
 2) "key:000000000002"
 3) "key:000000000001"
 4) "key:000000000008"
 5) "key:000000000005"
 6) "key:000000000009"
 7) "key:000000000003"
 8) "key:000000000004"
 9) "key:000000000007"
10) "key:000000000000"
[root@openEuler-riscv64 ~]# redis-cli flushdb
OK
[root@openEuler-riscv64 ~]# redis-benchmark -t set -n 10000 -q -r 100
SET: 1738.83 requests per second


```


redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 1000

```
[root@openEuler-riscv64 ~]# redis-cli flushdb
OK
[root@openEuler-riscv64 ~]# redis-benchmark -t set -n 10000 -q -r 1000
SET: 1768.03 requests per second


```


redis-cli flushdb

redis-benchmark -t set -n 100000 -q -r 1000000

```
[root@openEuler-riscv64 ~]# redis-cli flushdb
OK
[root@openEuler-riscv64 ~]# redis-benchmark -t set -n 100000 -q -r 1000000
SET: 1601.46 requests per second


```