# OpenSUSE Python3测试

OS: openSUSE-Tumbleweed-RISC-V-JeOS-efi.riscv64-2022.09.29  
VERSION: Python 3.10.7  
TIME: 2022/10/09

| 操作步骤                                 | 输入数据                     | 预期结果                      | 实际结果                      | 测试结果  |
| --------------------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | -------- |
| zypper install python3                  | python3                      | 安装成功                      | 安装成功                     | 成功      |
| python3 --version                       | --version                    | 正确输出版本 Python 3.10.7    | 正确输出版本 Python 3.10.7    | 成功      |
| python3                                 | print("Hello, World")        | Hello, World                 | Hello, World                 | 成功      |
| pip3 install pip-hello-world            | pip-hello-world              | 安装成功                      | 安装成功                     | 成功      |
| zypper install python310-testsuite      | python310-testsuite          | 安装成功                      | 安装成功                     | 成功      |

## 回归测试

> python3 -m test -uall,-gui,-audio,-largefile --list-tests > tests.txt  
> python3 -m test --matchfile tests.txt | tee py3_testlog.txt

### 结果

> == Tests result: FAILURE ==  
>   
> 401 tests OK.  
>   
> 3 tests failed:  
>     test_distutils test_sysconfig test_zipfile  
>   
> 23 tests skipped:  
>     test_asdl_parser test_check_c_globals test_clinic test_curses  
>     test_devpoll test_gdb test_idle test_kqueue test_msilib  
>     test_ossaudiodev test_smtpnet test_socketserver test_startfile  
>     test_tix test_tk test_ttk_guionly test_urllib2net test_urllibnet  
>     test_winconsoleio test_winreg test_winsound test_xmlrpc_net  
>     test_zipfile64  
>   
> Total duration: 1 hour 36 min  
> Tests result: FAILURE  

具体见[py3_testlog.txt](py3_testlog.txt)
