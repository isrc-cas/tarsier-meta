# ubuntu mariadb测试



## 测试环境




硬件环境：Lichee RV Dock

系统：Ubuntu 22.10 (GNU/Linux 5.19.0-1005-allwinner riscv64)

mariadb-server-10.6



### 手动功能性测试


简单测试 添加并发 测试复杂表 重复测试


root@ubuntu:/home/ubuntu# mysqlslap --auto-generate-sql
Benchmark
	Average number of seconds to run all queries: 0.041 seconds
	Minimum number of seconds to run all queries: 0.041 seconds
	Maximum number of seconds to run all queries: 0.041 seconds
	Number of clients running queries: 1
	Average number of queries per client: 0

root@ubuntu:/home/ubuntu# mysqlslap --concurrency=100 --number-of-queries=1000 --auto-generate-sql
Benchmark
	Average number of seconds to run all queries: 6.792 seconds
	Minimum number of seconds to run all queries: 6.792 seconds
	Maximum number of seconds to run all queries: 6.792 seconds
	Number of clients running queries: 100
	Average number of queries per client: 10

root@ubuntu:/home/ubuntu# mysqlslap --number-int-cols=5 --number-char-cols=20 --auto-generate-sql
Benchmark
	Average number of seconds to run all queries: 0.173 seconds
	Minimum number of seconds to run all queries: 0.173 seconds
	Maximum number of seconds to run all queries: 0.173 seconds
	Number of clients running queries: 1
	Average number of queries per client: 0

root@ubuntu:/home/ubuntu# mysqlslap --auto-generate-sql --iterations=10
Benchmark
	Average number of seconds to run all queries: 0.040 seconds
	Minimum number of seconds to run all queries: 0.037 seconds
	Maximum number of seconds to run all queries: 0.046 seconds
	Number of clients running queries: 1
	Average number of queries per client: 0




### 结果

成功