# ubuntu Python测试



## 测试环境



硬件环境：Lichee RV Dock

系统：Ubuntu 22.10 (GNU/Linux 5.19.0-1005-allwinner riscv64)


python 3.10



### 自动模块测试

创建及执行测试

```
# python3 -m test -uall,-gui,-audio,-largefile --list-tests > tests.txt
# python3 -m test --matchfile tests.txt | tee py38_testlog.txt
```

结果

== Tests result: FAILURE ==

1 test OK.

9 tests failed:
    test_builtin test_dict test_doctest test_doctest2 test_exceptions
    test_grammar test_opcodes test_types test_unittest

Total duration: 56.1 sec
Tests result: FAILURE




