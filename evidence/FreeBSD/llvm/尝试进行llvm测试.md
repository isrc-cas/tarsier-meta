# 尝试对llvm执行测试

前情提要：在wsl2上通过qemu成功运行起FreeBSD-riscv64之后，开始尝试进行llvm的测试。

测试指南：https://llvm.org/docs/TestSuiteGuide.html

## 环境准备

1. 检查 lit 测试运行器状态
   在FreeBSD中执行以下命令，顺利的话产生如下输出：

```bash
root@freebsd:~ # llvm-lit --version
lit 0.9.1dev
```

2. 从GitHub中`test-suite`

```bash
root@freebsd:~ # git clone https://github.com/llvm/llvm-test-suite.git test-suite
```

3. 创建一个构建目录并使用 CMake 来配置套件。使用该 `CMAKE_C_COMPILER`选项指定要测试的编译器。使用缓存文件选择典型的构建配置

```bash
root@freebsd:~ # mkdir test-suite-build
root@freebsd:~ # cd test-suite-build
root@freebsd:~/test-suite-build # cmake -DCMAKE_C_COMPILER=clang \
        -C../test-suite/cmake/caches/O3.cmake \
        ../test-suite
```

顺利的话，应该构建成功，并有相应输出

## 进行测试

使用lit进行测试

```bash
root@freebsd:~/test-suite-build # llvm-lit -v -j 1 -o results.json .

Traceback (most recent call last):
  File "/usr/local/bin/llvm-lit", line 7, in <module>
    main()
  File "/usr/local/lib/python3.8/site-packages/lit90/main.py", line 194, in main
    main_with_tmp(builtinParameters)
  File "/usr/local/lib/python3.8/site-packages/lit90/main.py", line 388, in main_with_tmp
    lit90.discovery.find_tests_for_inputs(litConfig, inputs))
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 241, in find_tests_for_inputs
    tests.extend(getTests(input, lit_config,
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 206, in getTestsInSuite
    for res in subiter:
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 206, in getTestsInSuite
    for res in subiter:
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 206, in getTestsInSuite
    for res in subiter:
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 163, in getTestsInSuite
    for res in lc.test_format.getTestsInDirectory(ts, path_in_suite,
  File "/usr/local/lib/python3.8/site-packages/lit/formats/base.py", line 26, in getTestsInDirectory
    yield lit.Test.Test(testSuite, path_in_suite + (filename,),
  File "/usr/local/lib/python3.8/site-packages/lit/Test.py", line 261, in __init__
    if '/'.join(path_in_suite) in suite.test_times:
AttributeError: 'TestSuite' object has no attribute 'test_times'
```

产生报错，测试无法进行

进入目录下的任意文件夹，尝试对单个模块进行测试

```bash
root@freebsd:~/test-suite-build # cd SingleSource/
root@freebsd:~/test-suite-build/SingleSource # llvm-lit -v -j 1 -o results.json .

Traceback (most recent call last):
  File "/usr/local/bin/llvm-lit", line 7, in <module>
    main()
  File "/usr/local/lib/python3.8/site-packages/lit90/main.py", line 194, in main
    main_with_tmp(builtinParameters)
  File "/usr/local/lib/python3.8/site-packages/lit90/main.py", line 388, in main_with_tmp
    lit90.discovery.find_tests_for_inputs(litConfig, inputs))
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 241, in find_tests_for_inputs
    tests.extend(getTests(input, lit_config,
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 206, in getTestsInSuite
    for res in subiter:
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 206, in getTestsInSuite
    for res in subiter:
  File "/usr/local/lib/python3.8/site-packages/lit90/discovery.py", line 163, in getTestsInSuite
    for res in lc.test_format.getTestsInDirectory(ts, path_in_suite,
  File "/usr/local/lib/python3.8/site-packages/lit/formats/base.py", line 26, in getTestsInDirectory
    yield lit.Test.Test(testSuite, path_in_suite + (filename,),
  File "/usr/local/lib/python3.8/site-packages/lit/Test.py", line 261, in __init__
    if '/'.join(path_in_suite) in suite.test_times:
AttributeError: 'TestSuite' object has no attribute 'test_times'
```

仍然失败，原因不明