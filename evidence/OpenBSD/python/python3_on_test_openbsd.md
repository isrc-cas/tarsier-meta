# OpenBSD RISC-V 执行 Python 回归测试

## 概览

OpenBSD/riscv64（OpenBSD 7.2 Snapshot）中的 Python 3.9.14 仍在测试中，直到目前，大部分特性与功能均通过测试，少数功能未通过测试。

## 环境准备

在 QEMU 上启动 OpenBSD，然后安装 `python3` 以及相应版本的 `python-tests` 。例如，我安装的 python 版本是 3.9.14，则需要安装 `python-tests-3.9.14` 软件包。


## 测试用例准备

该 OpenBSD 中的 Python 版本为

```
Python 3.9.14 (main, Sep 13 2022, 20:09:29)
[Clang 13.0.0 ] on openbsd7
```

## 执行测试

使用下面的命令执行回归测试：

```
# python3 -m test -uall,-gui,-audio,-largefile --list-tests > tests.txt
# python3 -m test --matchfile tests.txt
```

## 测试结果

## 测试结果

```
== Tests result: FAILURE ==

383 tests OK.

14 tests failed:
    test__locale test_bdb test_c_locale_coercion
    test_concurrent_futures test_crypt test_ctypes test_idle
    test_locale test_poplib test_socket test_ssl test_strptime
    test_uuid test_venv

27 tests skipped:
    test_asdl_parser test_check_c_globals test_clinic test_curses
    test_dbm_gnu test_devpoll test_epoll test_gdb test_msilib
    test_ossaudiodev test_smtpnet test_socketserver test_spwd
    test_startfile test_tcl test_tix test_tk test_ttk_guionly
    test_ttk_textonly test_turtle test_urllib2net test_urllibnet
    test_winconsoleio test_winreg test_winsound test_xmlrpc_net
    test_zipfile64

1 test run no tests:
    test_sqlite

Total duration: 3 hour 43 min
Tests result: FAILURE
```

## 参考文献

https://github.com/isrc-cas/tarsier-meta/blob/main/evidence/freebsd/python/FreeBSD%20RISC-V%20%E6%89%A7%E8%A1%8C%20Python%20%E5%9B%9E%E5%BD%92%E6%B5%8B%E8%AF%95.md
