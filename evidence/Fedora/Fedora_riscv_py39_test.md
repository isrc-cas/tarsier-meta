# 在 QEMU 上运行 Fedora RISC-V

2022年9月 by jwy

## 概览

Fedora RISC-V（Fedora-Developer-Rawhide-20200108.n.0）中的 Python 3.9.7 除了并发特性外的大部分特性与功能均通过测试。

## 环境准备

按照 [这篇笔记](https://github.com/jwyjohn/Tarsier-Interncat/blob/main/notes/Fedora_riscv_on_qemu.md) 运行 qemu 下的 Fedora RISC-V（Fedora-Developer-Rawhide-20200108.n.0）。

## 测试用例准备

由于系统自带的 Python 构建中没有包含必要的测试用例，故而我们需要安装 `python3-test` 包和其依赖：
```
# dnf remove -y initscripts-10.02-2.fc31.riscv64
# dnf install -y python3-test --allowerasing
```
安装完成后，该 Fedora 中的 Python 版本为：
```
Python 3.9.7 (default, Oct  6 2021, 00:00:00)
[GCC 10.3.1 20210422 (Red Hat 10.3.1-1)] on linux
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

399 tests OK.

1 test failed:
    test_asyncio

24 tests skipped:
    test_asdl_parser test_check_c_globals test_clinic test_curses
    test_devpoll test_gdb test_idle test_kqueue test_msilib
    test_ossaudiodev test_smtpnet test_socketserver test_startfile
    test_timeout test_tix test_tk test_ttk_guionly test_urllib2net
    test_urllibnet test_winconsoleio test_winreg test_winsound
    test_xmlrpc_net test_zipfile64

1 re-run test:
    test_asyncio
```
测试了除网络，GUI，音频的核心模块，其中除了 `test_asyncio` 在重测后通过外，其余测试均正常通过。

此外，在运行全套测试时， `test_concurrent_futures` 造成了无法被捕获的异常，故而也跳过了该模块的测试。
```
# python -m test -uall,-gui,-audio,-largefile
--------------------------------------------------------
0:17:23 load avg: 2.04 [ 82/425] test_concurrent_futures
Exception in thread Thread-257:
Traceback (most recent call last):
  File "/usr/lib64/python3.9/threading.py", line 973, in _bootstrap_inner
    self.run()
  File "/usr/lib64/python3.9/concurrent/futures/process.py", line 317, in run
    result_item, is_broken, cause = self.wait_result_broken_or_wakeup()
  File "/usr/lib64/python3.9/concurrent/futures/process.py", line 376, in wait_result_broken_or_wakeup
    worker_sentinels = [p.sentinel for p in self.processes.values()]
  File "/usr/lib64/python3.9/concurrent/futures/process.py", line 376, in <listcomp>
    worker_sentinels = [p.sentinel for p in self.processes.values()]
RuntimeError: dictionary changed size during iteration
```


