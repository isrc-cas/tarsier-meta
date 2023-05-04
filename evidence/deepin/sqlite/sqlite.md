# deepin sqlite测试



## 测试环境



硬件环境：Visionfive v1

系统： deepin-riscv 6.1.0-rc4-visionfive+



## 安装并启动


```
root@deepin-riscv:~# sqlite3 -version
3.36.0 2021-06-18 18:36:39 5c9a6c06871cb9fe42814af9c039eb6da5427a6ec28f187af7ebfb62eafaalt1
root@deepin-riscv:~# sqlite3 test.db
SQLite version 3.36.0 2021-06-18 18:36:39
Enter ".help" for usage hints.
sqlite> .database
main: /root/test.db r/w
sqlite> create table student(name varchar(10), age smallint);
sqlite> .table
student
sqlite> insert into student values('nico', 21);
sqlite> insert into student values("maki",20);
sqlite> select * from student;
nico|21
maki|20
sqlite> .quit

```


## 结果

成功