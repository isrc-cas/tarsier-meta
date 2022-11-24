# openkylin Mysql8.0测试



## 测试环境



硬件环境：Visionfive v1 开发板

系统：openkylin RISC-V 0.9

软件：Mysql 8.0

时间：2022.11.24



### 自动模块测试

创建及执行测试

```
root@openkylin:/usr/lib/mysql-test# ./mysql-test-run.pl --force

```

结果

Logging: ./mysql-test-run.pl  --force
MySQL Version 8.0.28
Checking supported features
Using suite(s): auth_sec,binlog,binlog_gtid,binlog_nogtid,clone,collations,component_keyring_file,connection_control,encryption,federated,funcs_2,gcol,gis,information_schema,innodb,innodb_fts,innodb_gis,innodb_undo,innodb_zip,interactive_utilities,json,main,opt_trace,parts,perfschema,query_rewrite_plugins,rpl,rpl_gtid,rpl_nogtid,secondary_engine,service_status_var_registration,service_sys_var_registration,service_udf_registration,sys_vars,sysschema,test_service_sql_api,test_services,x
Collecting tests
 - Adding combinations for binlog
 - Adding combinations for binlog_gtid
 - Adding combinations for binlog_nogtid
 - Adding combinations for rpl
 - Adding combinations for rpl_gtid
 - Adding combinations for rpl_nogtid
Checking leftover processes
Removing old var directory
Creating var directory '/usr/lib/mysql-test/var'
Installing system database
Using parallel: 1
mysql-test-run: *** ERROR: Could not create testcase server port: Invalid argument


无法建立端口 同时进行了对照组测试 对照组正常输出并完成测试

对照组测试结果见附属Log

### 结果

失败