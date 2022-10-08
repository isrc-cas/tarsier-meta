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
| zypper install python310-testsuite      | python3-tests                | 安装失败                      | RPM failed                   | 失败      |
