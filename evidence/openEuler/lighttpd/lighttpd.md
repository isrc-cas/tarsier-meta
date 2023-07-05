# openeuler lighttpd测试



## 测试环境

硬件环境：visionfive v1

系统：oe2303.riscv64

lighttpd/1.4.67 (ssl) - a light and fast webserver

### 测试


使用包管理系统安装完成后



修改配置文件 /etc/lighttpd/lighttpd.conf 配置IP端口绑定信息



lighttpd -f /etc/lighttpd/lighttpd.conf



可以从80端口访问到网页



### 结果

成功

