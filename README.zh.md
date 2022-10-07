# TARSIER 项目信息仓库

[English](./README.md)

本仓库包含 Tarsier 项目的相关信息，包括报告、幻灯片、路线图。

## Content

```bash
tarsier-meta
    |-----roadmap                                # 战略、路线图
    |-----standard                               # 规范要求、模板文档等
    |-----manuals                                # 测试说明文档，按照软件包划分（是否需要按照linux发行版划分？）
    |       |-----xfce                           # 软件包的 测试说明、安装说明、使用说明、测试用例等
    |       |-----firefox
    |       |-----chromium
    |       |-----<otherPackages>
    |
    |-----reports                                # 测试报告（按照linux发行版分类）
    |       |-----openEuler                      # 测试报告（按照软件包分类）
    |       |        |-----xfce
    |       |        |-----<otherPackages>
    |       |-----Debian
    |       |        |-----xfce
    |       |        |-----<otherPackages>
    |       |-----<Linux distros>
    |
    |-----evidence                               # 测试中间结果
    |       |-----Fedora
    |       |        |-----xxxxx.md
    |       |        |-----<otherMaterials>
    |       |-----<Linux distros>
    |
    |-----render.py                              # yaml 转换为 Markdown 表格工具
```
