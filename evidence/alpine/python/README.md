# Alpine Python3测试

OS: riscv64/alpine:edge  
VERSION: Python 3.10.7  
TIME: 2022/10/07  

| 操作步骤                       | 输入数据                     | 预期结果                      | 实际结果                      | 测试结果  |
| ----------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | -------- |
| apk add python3               | python3                      | 安装成功                      | 安装成功                     | 成功      |
| python3 --version             | --version                    | 正确输出版本 Python 3.10.7    | 正确输出版本 Python 3.10.7    | 成功      |
| python3                       | print("Hello, World")        | Hello, World                 | Hello, World                 | 成功      |
| apk add py3-pip               | py3-pip                      | 安装成功                      | 安装成功                     | 成功      |
| pip3 install pip-hello-world  | pip-hello-world              | 安装成功                      | 安装成功                     | 成功      |
| apk add python3-tests         | python3-tests                | 安装成功                      | 安装成功                     | 成功      |

## 回归测试

> python3 -m test -uall,-gui,-audio,-largefile --list-tests > tests.txt  
> python3 -m test --matchfile tests.txt | tee py3_testlog.txt

### 结果

> == Tests result: FAILURE ==  
>   
> 390 tests OK.  
>   
> 9 tests failed:  
>     test__locale test_c_locale_coercion test_cmd_line test_locale  
>     test_os test_posix test_re test_socket test_subprocess  
>   
> 28 tests skipped:  
>     test_asdl_parser test_check_c_globals test_clinic test_curses  
>     test_dbm_gnu test_devpoll test_gdb test_idle test_kqueue  
>     test_msilib test_nis test_ossaudiodev test_smtpnet  
>     test_socketserver test_startfile test_tcl test_tix test_tk  
>     test_ttk_guionly test_ttk_textonly test_turtle test_urllib2net  
>     test_urllibnet test_winconsoleio test_winreg test_winsound  
>     test_xmlrpc_net test_zipfile64  
>   
> Total duration: 58 min 28 sec  
> Tests result: FAILURE  

具体见[py3_testlog.txt](py3_testlog.txt)
