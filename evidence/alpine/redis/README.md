# Alpine Redis测试

OS: riscv64/alpine:edge  
VERSION: Redis 7.0.5  
TIME: 2022/11/13  

| 操作步骤               | 附件              | 预期结果 | 实际结果 | 测试结果 |
| ---------------------- | ----------------- | -------- | -------- | -------- |
| apk add redis          | install.png       | 安装成功 | 安装成功 | 成功     |
| redis-server --version | version.png       | 查看成功 | 查看成功 | 成功     |
| redis-server           | server.png        | 成功     | 成功     | 成功     |
| redis-benchmark        | benchmark.txt     | 结果正常 | 结果正常 | 成功     |
| redis-benchmark -P 10  | benchmark_p10.txt | 结果正常 | 结果正常 | 成功     |

## 结果

正常
