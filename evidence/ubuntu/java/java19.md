
# ubuntu java测试



## 测试环境



硬件环境：Lichee RV Dock

系统：Ubuntu 22.10 (GNU/Linux 5.19.0-1005-allwinner riscv64)

openjdk version "19.0.1" 2022-10-18
OpenJDK Runtime Environment (build 19.0.1+10-Ubuntu-1)
OpenJDK 64-Bit Server VM (build 19.0.1+10-Ubuntu-1, mixed mode, sharing)



### 手动功能性测试

使用manuals下的测试用例


```
root@ubuntu:/home/ubuntu/java# ls
hello.java  mergesort.java  primetest.java
root@ubuntu:/home/ubuntu/java# java hello.java
Hello, RISC-V!
root@ubuntu:/home/ubuntu/java# java mergesort.java
Original:
11 45 14 19 19 8 10 
Sorted:
8 10 11 14 19 19 45 
root@ubuntu:/home/ubuntu/java# java primetest.java
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 

```


### 结果

成功






