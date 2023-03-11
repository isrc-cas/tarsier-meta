# 如何测试Redis

## 安装



## 测试

```
redis-benchmark -n 10000 -q

redis-benchmark -t set,get,incr -n 100000 -q

redis-benchmark -t set,get,incr -n 100000 -q -P 10
```
## 随机Key测试
```
redis-cli flushdb

redis-cli keys \*

redis-benchmark -t set -n 10000 -q
```
```

redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 10
```
```

redis-cli keys \*

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 100
```
```

redis-cli flushdb

redis-benchmark -t set -n 10000 -q -r 1000
```
```

redis-cli flushdb

redis-benchmark -t set -n 100000 -q -r 1000000
```