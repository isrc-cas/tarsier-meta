# OpenSUSE Busybox测试

OS: openSUSE-Tumbleweed-RISC-V-JeOS-efi.riscv64-2022.09.29  
VERSION: Python 3.10.7  
TIME: 2022/10/09

## 测试

> zypper in busybox-testsuite  
> cd /usr/share/busybox/testsuite  
> PATH=/usr/share/busybox:$PATH SKIP_KNOWN_BUGS=1 ./runtest  

### 结果

> 1 failure(s) detected; running with -v (verbose) will give more info  

具体见[busybox_testlog.txt](busybox_testlog.txt)
