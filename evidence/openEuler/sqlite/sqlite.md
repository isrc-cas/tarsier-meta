# openEuler sqlite测试



## 测试环境



硬件环境：Visionfive v1

系统：oe2203.riscv64 (6.1.0-0.rc3.8.oe2203.riscv64)



## 安装并启动


```
[root@openeuler-riscv64 ~]# sqlite3 -version
3.37.2 2022-01-06 13:25:41 872ba256cbf61d9290b571c0e6d82a20c224ca3ad82971edc46b29818d5dalt1
[root@openeuler-riscv64 ~]# sqlite3 test.db
SQLite version 3.37.2 2022-01-06 13:25:41
Enter ".help" for usage hints.
sqlite> .database
main: /root/test.db r/w
sqlite>  create table student(name varchar(10), age smallint);
sqlite> .table
student
sqlite> insert into student values('nico', 21);
sqlite> insert into student values("maki",20);
sqlite> select * from student;
nico|21
maki|20
sqlite> .quit
[root@openeuler-riscv64 ~]# 
```


## 结果

成功