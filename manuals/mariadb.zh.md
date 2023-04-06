# 如何测试mariadb
## 安装



## 测试


简单测试 添加并发 测试复杂表 重复测试


mysqlslap --auto-generate-sql

mysqlslap --concurrency=100 --number-of-queries=1000 --auto-generate-sql

mysqlslap --number-int-cols=5 --number-char-cols=20 --auto-generate-sql

mysqlslap --auto-generate-sql --iterations=10


