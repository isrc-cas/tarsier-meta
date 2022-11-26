# FreeBSD MariaDB 测试

## 测试信息

### 被测对象的版本信息

| 版本名称                  | 更新时间 |
| ------------------------- | -------- |
| mariadb105-server-10.5.13 | -        |

### 硬件环境信息

| 版本名称  | 硬件环境                                | 备注       |
| --------- | --------------------------------------- | ---------- |
| RISC-V 64 | CPU核数：4<br>内存：4G<br>硬盘容量：16G | QEMU虚拟机 |

### 操作系统信息

| 版本名称                                                     | 更新时间 |
| ------------------------------------------------------------ | -------- |
| FreeBSD freebsd 14.0-CURRENT FreeBSD 14.0-CURRENT #0 main-n257718-e1963173708 | 2022-9-2 |

## 测试内容

| 操作步骤                     | 预期结果 | 实际结果 | 测试结果 |
| -------------------------- | -------- | -------- | -------- |
| MariaDB 安装      | 安装成功 | 安装成功 | 成功     |
| 简单测试   | 正常 | 正常 | 成功     |
| 输出测试语句           | 正常   | 正常   | 成功     |
| 并发测试            | 正常 | 正常 | 成功     |
| 创建复杂测试并测试 | 正常 | 正常 | 成功     |
| 重复测试 | 正常 | 正常 | 成功 |

## MariaDB 安装

搜索安装包

```bash
# pkg search mariadb
mariadb-connector-c-3.2.4      MariaDB database connector for C
mariadb-connector-odbc-3.1.14  MariaDB database connector for odbc
mariadb103-client-10.3.32      Multithreaded SQL database (client)
mariadb103-server-10.3.32      Multithreaded SQL database (server)
mariadb104-client-10.4.22      Multithreaded SQL database (client)
mariadb104-server-10.4.22      Multithreaded SQL database (server)
mariadb105-client-10.5.13      Multithreaded SQL database (client)
mariadb105-server-10.5.13      Multithreaded SQL database (server)
p5-DBD-MariaDB-1.21            MariaDB driver for the Perl5 Database Interface (DBI)
```

安装最新版本：

```bash
# pkg install mariadb105-server
```

检查安装是否成功

```bash
# mariadb --version
mariadb  Ver 15.1 Distrib 10.5.13-MariaDB, for FreeBSD14.0 (riscv64) using  EditLine wrapper
```

将 MariaDB 设置为开机启动

```bash
# sysrc mysql_enable=YES
```

启动 MariaDB

```bash
# service mysql-server start
```

## MariaDB 测试

使用测试工具mysqlslap。

```bash
# mysqlslap --version
mysqlslap  Ver 1.0 Distrib 10.5.13-MariaDB, for FreeBSD14.0 (riscv64)
```

### 简单测试

```bash
# mysqlslap --auto-generate-sql
Benchmark
        Average number of seconds to run all queries: 0.046 seconds
        Minimum number of seconds to run all queries: 0.046 seconds
        Maximum number of seconds to run all queries: 0.046 seconds
        Number of clients running queries: 1
        Average number of queries per client: 0
```

>- **Average number of seconds to run all queries**：运行所有语句的平均秒数
>- **Minimum number of seconds to run all queries**：运行所有语句的最小秒数
>- **Maximum number of seconds to run all queries**：运行所有语句的最大秒数
>- **Number of clients running queries**：客户端数量
>- **Average number of queries per client**：每个客户端运行查询的平均数

若需查看测试自动生成的语句，可以添加参数 `--only-print`

```mysql
# mysqlslap --auto-generate-sql --only-print
DROP SCHEMA IF EXISTS `mysqlslap`;
CREATE SCHEMA `mysqlslap`;
use mysqlslap;
CREATE TABLE `t1` (intcol1 INT(32) ,charcol1 VARCHAR(128));
INSERT INTO t1 VALUES (1408992891,'WDyckxCt4yWgMlYXjkPKA83YNscbSHIqWHRE6X0AMWqc8E7jyP30Z6Yoq9FBIa1ojKupkuryHZaPnZ8ey3WO134s4K3MmwATHwAtrtr8QHP5iPbZS6pT9tL5DGRrDT');
INSERT INTO t1 VALUES (568249692,'MPMF8Fy8ZFZfpyEMQKBoLx1QAIluNE6dYLkgSipupEZWDftXswJ5tDOwX9qmOoNo9zSWZ9OMOpsdSd8CQKAJZa7wjxazepnfo89LHZbhMJIjxJnNXxawNik7XIy97e');
...

...
INSERT INTO t1 VALUES (942257682,'0jXhLekpRPL1YKMA6EQpTYuWNA5mcYSd7rAKTmAoCXhcrwex2wfYLP2kczW4XqZehcr2M1rQOOu7KZwNLbvi1pQTpoZKe7rBjaE5bxYrLIyarmx5MknFZ6kMuHbPGI');
DROP SCHEMA IF EXISTS `mysqlslap`;
```

可以看到默认是使用mysqlslap，该数据库会自动创建，整个测试完成后会自动删除测试库，不会在数据库中留下痕迹。

### 添加并发

我们可以添加如下两个参数，模拟并发处理查询请求：

- **--concurrency=100**：指定同时有 **100** 个客户端连接
- **--number-of-queries=1000**：指定总的测试查询次数（并发客户端数 * 每个客户端的查询次数），这样本样例平均每个客户端查询 **10** 次

```bash
# mysqlslap --concurrency=100 --number-of-queries=1000 --auto-generate-sql
Benchmark
        Average number of seconds to run all queries: 1.925 seconds
        Minimum number of seconds to run all queries: 1.925 seconds
        Maximum number of seconds to run all queries: 1.925 seconds
        Number of clients running queries: 100
        Average number of queries per client: 10
```

### 测试复杂表

自动测试时，创建的表结构非常简单，只有两列，实际的产品环境肯定会更复杂，我们可以使用参数指定测试表的列的数量和类型：

- **--number-int-cols=5**：指定生成 **5** 个 **int** 类型的列
- **--number-char-cols=20**：指定生成 **20** 个 **char** 类型的列

```bash
# mysqlslap --number-int-cols=5 --number-char-cols=20 --auto-generate-sql
Benchmark
        Average number of seconds to run all queries: 0.135 seconds
        Minimum number of seconds to run all queries: 0.135 seconds
        Maximum number of seconds to run all queries: 0.135 seconds
        Number of clients running queries: 1
        Average number of queries per client: 0
```

### 重复测试

使用 **--iterations** 参数可以设置迭代执行的次数。

```bash
# mysqlslap --auto-generate-sql --iterations=10
Benchmark
        Average number of seconds to run all queries: 0.036 seconds
        Minimum number of seconds to run all queries: 0.035 seconds
        Maximum number of seconds to run all queries: 0.041 seconds
        Number of clients running queries: 1
        Average number of queries per client: 0

# mysqlslap --concurrency=100 --number-of-queries=1000 --auto-generate-sql --iterations=10
Benchmark
        Average number of seconds to run all queries: 1.857 seconds
        Minimum number of seconds to run all queries: 0.489 seconds
        Maximum number of seconds to run all queries: 2.140 seconds
        Number of clients running queries: 100
        Average number of queries per client: 10
```

