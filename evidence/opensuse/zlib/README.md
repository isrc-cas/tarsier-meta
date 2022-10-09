# OpenSUSE Python3测试

OS: openSUSE-Tumbleweed-RISC-V-JeOS-efi.riscv64-2022.09.29  
VERSION: Zlib 1.2.12  
TIME: 2022/10/09

## 回归测试

> zypper in zlib-testsuite  
> /usr/libexec/zlib/testsuite  

##  结果

> zlib version 1.2.12 = 0x12c0, compile flags = 0xa9  
> uncompress(): hello, hello!  
gzread(): hello, hello!  
> gzgets() after gzseek:  hello!  
> inflate(): hello, hello!  
> large_inflate(): OK  
> after inflateSync(): hello, hello!  
> inflate with dictionary: hello, hello!  
