# FreeBSD RISC-V 执行 Python 回归测试

## 概览

FreeBSD RISC-V（FreeBSD 14.0-CURRENT #0 main-n257718-e1963173708）中的 Python 3.8.12 大部分特性与功能均通过测试，少数功能未通过测试。

## 环境准备

按照 [这篇笔记](../week5/WSL2上通过qemu虚拟机运行FreeBSD.md) 运行 qemu 下的 FreeBSD RISC-V（FreeBSD 14.0-CURRENT #0 main-n257718-e1963173708）。

## 测试用例准备

该 Fedora 中的 Python 版本为：
```
Python 3.8.12 (default, Nov  9 2021, 15:42:01)
[Clang 12.0.1 (git@github.com:llvm/llvm-project.git llvmorg-12.0.1-0-gfed41342a on freebsd14
```

## 执行测试

使用下面的命令执行回归测试，并将测试日志保存到文件中：
```
# python -m test -uall,-gui,-audio,-largefile --list-tests > tests.txt
# python -m test --matchfile tests.txt | tee py38_testlog.txt
```

## 测试结果

总体测试结果：
```
== Tests result: FAILURE ==

385 tests OK.

9 tests failed:
    test_asyncio test_bdb test_capi test_ctypes test_dtrace test_os test_shutil test_ssl test_venv

29 tests skipped:
    test_asdl_parser test_clinic test_curses test_dbm_gnu test_devpoll
    test_epoll test_gdb test_idle test_msilib test_ossaudiodev
    test_smtpnet test_socketserver test_spwd test_sqlite
    test_startfile test_tcl test_timeout test_tix test_tk
    test_ttk_guionly test_ttk_textonly test_turtle test_urllib2net
    test_urllibnet test_winconsoleio test_winreg test_winsound
    test_xmlrpc_net test_zipfile64

2 re-run test:
    test_asyncio test_ssl
```
测试了除网络，GUI，音频的核心模块，其中除了 `test_asyncio` 和 `test_ssl` 在重测后通过外，仍有部分测试未能通过，其余测试均正常通过。
