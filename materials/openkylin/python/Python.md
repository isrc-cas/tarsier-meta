# openkylin Python测试



## 测试环境



硬件环境：Visionfive v1 开发板

系统：openkylin RISC-V 0.7.5



### 手动功能性测试



| 操作步骤                                                     | 输入数据                                                     | 预期结果                     | 实际结果                     | 测试结果 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------------------- | ---------------------------- | -------- |
| 1.插入openkylin系统的SD卡   <br>2.插入电源线 启动开发板      | 无                                                           | 设备正常启动                 | 设备正常启动                 | 通过     |
| 1. 使用SSH  进入openkylin系统终端     <br/>2. 输入apt update | sudo apt  update                                             | 成功执行仓库列表更新         | 成功执行仓库列表更新         | 通过     |
| 1. 使用SSH  进入openkylin系统终端     <br/>2. 进入python3终端     <br/>3.使用python3终端打出hello world    <br/> 4.退出python3终端 | 1.python3     <br/>2.print('Hello World!')     <br/>3.exit() | 成功执行并打印出hello  world | 成功执行并打印出hello  world | 通过     |
| 1. 使用SSH  进入openkylin系统终端     <br/>2. 安装pip        | sudo apt  install python3-pip                                | 成功安装pip                  | 成功安装pip                  | 通过     |
| 1.  使用SSH 进入openkylin系统终端    <br/> 2. 使用pip安装numpy（可使用镜像源） | sudo  pip3 install -i https://pypi.tuna.tsinghua.edu.cn/simple numpy | 成功安装numpy                | 安装失败                     | 不通过   |
|                                                              |                                                              |                              |                              |          |
|                                                              |                                                              |                              |                              |          |
|                                                              |                                                              |                              |                              |          |
|                                                              |                                                              |                              |                              |          |







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

Total duration: 1 min 2 sec
Tests result: FAILURE



具体Log详见附属文档