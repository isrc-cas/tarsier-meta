# ubuntu redis测试



## 测试环境



硬件环境：Lichee RV Dock

系统：Ubuntu 22.10 (GNU/Linux 5.19.0-1005-allwinner riscv64)



## 安装并启动


```
root@ubuntu:/home/ubuntu# redis-server --version

Redis server v=7.0.4 sha=00000000:0 malloc=jemalloc-5.2.1 bits=64 build=58fea801f69a84ba

root@ubuntu:/home/ubuntu# echo 'redis_enable="YES"' >> /etc/rc.conf

root@ubuntu:/home/ubuntu# service redis start
```


## 测试

redis-benchmark -n 10000 -q
```
PING_INLINE: 1009.90 requests per second, p50=25.023 msec                   
PING_MBULK: 1023.65 requests per second, p50=24.703 msec                   
SET: 1001.40 requests per second, p50=25.359 msec                   
GET: 1000.60 requests per second, p50=25.247 msec                   
INCR: 1000.60 requests per second, p50=25.247 msec                   
LPUSH: 1020.72 requests per second, p50=25.231 msec                   
RPUSH: 999.10 requests per second, p50=25.407 msec                    
LPOP: 989.22 requests per second, p50=25.775 msec                    
RPOP: 1015.54 requests per second, p50=25.407 msec                   
SADD: 1001.50 requests per second, p50=25.263 msec                   
HSET: 1012.45 requests per second, p50=25.343 msec                   
SPOP: 1031.14 requests per second, p50=24.735 msec                   
ZADD: 995.22 requests per second, p50=25.519 msec                    
ZPOPMIN: 1019.47 requests per second, p50=24.975 msec                   
LPUSH (needed to benchmark LRANGE): 998.20 requests per second, p50=25.487 msec                    
LRANGE_100 (first 100 elements): 875.50 requests per second, p50=28.767 msec                  
LRANGE_300 (first 300 elements): 510.96 requests per second, p50=48.543 msec                  
LRANGE_500 (first 500 elements): 378.06 requests per second, p50=65.343 msec                  
LRANGE_600 (first 600 elements): 336.11 requests per second, p50=73.471 msec                  
MSET (10 keys): 1275.51 requests per second, p50=35.007 msec 
```

redis-benchmark -t set,get,incr -n 100000 -q

```
SET: 999.56 requests per second, p50=25.279 msec                    
GET: 998.53 requests per second, p50=25.087 msec                    
INCR: 1010.39 requests per second, p50=25.023 msec
```

redis-benchmark -t set,get,incr -n 100000 -q -P 10

```
SET: 9087.60 requests per second, p50=49.375 msec                    
GET: 9601.54 requests per second, p50=46.431 msec                    
INCR: 9580.38 requests per second, p50=46.911 msec
```

## 随机Key测试

redis-cli flushdb

redis-cli keys \*

redis-benchmark -t set -n 10000 -q

```
root@ubuntu:/home/ubuntu# redis-cli flushdb
OK
root@ubuntu:/home/ubuntu# redis-cli keys \*
(empty array)
root@ubuntu:/home/ubuntu# redis-benchmark -t set -n 10000 -q
SET: 994.33 requests per second, p50=25.455 msec
```

redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 10

```
root@ubuntu:/home/ubuntu# redis-cli keys \*
1) "key:__rand_int__"
root@ubuntu:/home/ubuntu# redis-cli flushdb
OK
root@ubuntu:/home/ubuntu# redis-benchmark -t set -n 10000 -q -r 10
SET: 990.20 requests per second, p50=25.583 msec  

```


redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 100

```
root@ubuntu:/home/ubuntu# redis-cli keys \*
 1) "key:000000000000"
 2) "key:000000000009"
 3) "key:000000000006"
 4) "key:000000000008"
 5) "key:000000000003"
 6) "key:000000000001"
 7) "key:000000000002"
 8) "key:000000000005"
 9) "key:000000000007"
10) "key:000000000004"
root@ubuntu:/home/ubuntu# redis-cli flushdb
OK
root@ubuntu:/home/ubuntu# redis-benchmark -t set -n 10000 -q -r 100
SET: 992.46 requests per second, p50=25.551 msec  
```


redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 1000

```
root@ubuntu:/home/ubuntu# redis-cli flushdb
OK
root@ubuntu:/home/ubuntu# redis-benchmark -t set -n 10000 -q -r 1000
SET: 986.39 requests per second, p50=25.631 msec 

```


redis-cli flushdb

redis-benchmark -t set -n 100000 -q -r 1000000

```
root@ubuntu:/home/ubuntu# redis-cli flushdb
OK
root@ubuntu:/home/ubuntu# redis-benchmark -t set -n 100000 -q -r 1000000
SET: 974.72 requests per second, p50=25.775 msec 

```