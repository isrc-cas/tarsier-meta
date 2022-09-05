# RISC-V Linux观测内容



**流行Linux发行版 for RISC-V的镜像仓库**

| openEuler                                                    | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin |
| ------------------------------------------------------------ | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- |
| [iscas仓库](https://mirror.iscas.ac.cn/openeuler-sig-riscv/openEuler-RISC-V/) |            |        |        |          | [官方仓库](https://fedorapeople.org/groups/risc-v/disk-images/)       |        |         |        |        |   [官方仓库](http://archive.build.openkylin.top/openkylin)        |



**流行Linux发行版 for RISC-V硬件适配情况（主流RISC-V开发板）**

| 运行环境                 | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin |
| ------------------------ | --------- | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- |
| QEMU                     | √         | √          | √      | √      | √        | √      |        |         |        |        |           |
| 全志哪吒D1               | √         |            | √      | √      | √        | √      |        |         |        |        |           |
| 赛昉VisionFive           | √         |            | √      | √      | √        | √      |        |         |        |        | √          |
| HiFive Unleashed         |           | √          | √      |        | √        |        |        |         |        |        |           |
| HiFive Unmatched         | √         | √          | √      | √      | √        | √      |        |         |        |        | √          |
| PolarFire SoC Icicle Kit |           | √          |        |        | √        | √      |        |         |        |        |           |
|                          |           |            |        |        |          |        |        |         |        |        |           |
|                          |           |            |        |        |          |        |        |         |        |        |           |



**流行Linux发行版 for RISC-V的应用支持情况测评和对比**

| 分组           | 测试项        | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin |
| -------------- | ------------- | --------- | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- |
| 编译器工具链   | gcc           |           |            |        |        |          |        |        |         |        |        |           |
|                | gdb           |           |            |        |        |          |        |        |         |        |        |           |
|                | llvm          |           |            |        |        |          |        |        |         |        |        |           |
|                | clang         |           |            |        |        |          |        |        |         |        |        |           |
| 语言           | perl          |           |            |        |        |          |        |        |         |        |        |           |
|                | python        |           |            |        |        |          |        |        |         |        |        |           |
|                | rust          |           |            |        |        |          |        |        |         |        |        |           |
|                | ruby          |           |            |        |        |          |        |        |         |        |        |           |
|                | openJDK       |           |            |        |        |          |        |        |         |        |        |           |
|                | Nodejs        |           |            |        |        |          |        |        |         |        |        |           |
|                | Ocaml         |           |            |        |        |          |        |        |         |        |        |           |
|                | golang        |           |            |        |        |          |        |        |         |        |        |           |
|                | erlang        |           |            |        |        |          |        |        |         |        |        |           |
| 构建工具       | obs           |           |            |        |        |          |        |        |         |        |        |           |
|                | osc           |           |            |        |        |          |        |        |         |        |        |           |
|                | obs-server    |           |            |        |        |          |        |        |         |        |        |           |
| 容器           | runc          |           |            |        |        |          |        |        |         |        |        |           |
|                | docker        |           |            |        |        |          |        |        |         |        |        |           |
| 桌面           | Xfce Desktop  |           |            |        |        |          |        |        |         |        |        |           |
|                | KDE           |           |            |        |        |          |        |        |         |        |        |           |
|                | LXDE          |           |            |        |        |          |        |        |         |        |        |           |
|                | GNOME         |           |            |        |        |          |        |        |         |        |        |           |
|                | Deepin        |           |            |        |        |          |        |        |         |        |        |           |
|                | MATE          |           |            |        |        |          |        |        |         |        |        |           |
|                | LXQT          |           |            |        |        |          |        |        |         |        |        |           |
|                | Enlightenment |           |            |        |        |          |        |        |         |        |        |           |
| 浏览器         | firefox       |           |            |        |        |          |        |        |         |        |        |           |
|                | chromium      |           |            |        |        |          |        |        |         |        |        |           |
| 图像浏览编辑   | GIMP          |           |            |        |        |          |        |        |         |        |        |           |
| 多媒体播放器   | VLC           |           |            |        |        |          |        |        |         |        |        |           |
| 办公软件       | LibreOffice   |           |            |        |        |          |        |        |         |        |        |           |
|                | Thunderbird   |           |            |        |        |          |        |        |         |        |        |           |
| IDE            | eclipse       |           |            |        |        |          |        |        |         |        |        |           |
|                | VSCode        |           |            |        |        |          |        |        |         |        |        |           |
|                | PyCharm       |           |            |        |        |          |        |        |         |        |        |           |
| DB             | sqlite        |           |            |        |        |          |        |        |         |        |        |           |
|                | Mysql         |           |            |        |        |          |        |        |         |        |        |           |
|                | postgresql    |           |            |        |        |          |        |        |         |        |        |           |
|                | MongoDB       |           |            |        |        |          |        |        |         |        |        |           |
| http/web服务器 | Apache2       |           |            |        |        |          |        |        |         |        |        |           |
|                | Nginx         |           |            |        |        |          |        |        |         |        |        |           |
|                | HAProxy       |           |            |        |        |          |        |        |         |        |        |           |
|                | Lighttpd      |           |            |        |        |          |        |        |         |        |        |           |
|                | Tengine       |           |            |        |        |          |        |        |         |        |        |           |
|                | Squid         |           |            |        |        |          |        |        |         |        |        |           |
|                | Varnish       |           |            |        |        |          |        |        |         |        |        |           |
| web            | flask         |           |            |        |        |          |        |        |         |        |        |           |
| 大数据         | HBase         |           |            |        |        |          |        |        |         |        |        |           |
|                | Hadoop        |           |            |        |        |          |        |        |         |        |        |           |
|                | hive          |           |            |        |        |          |        |        |         |        |        |           |
| 中间件         | Redis         |           |            |        |        |          |        |        |         |        |        |           |
|                | MemCache      |           |            |        |        |          |        |        |         |        |        |           |
|                | mybatis       |           |            |        |        |          |        |        |         |        |        |           |
|                | Dubbo         |           |            |        |        |          |        |        |         |        |        |           |
|                | zookeeper     |           |            |        |        |          |        |        |         |        |        |           |
| 机器学习       | tensorflow    |           |            |        |        |          |        |        |         |        |        |           |
| ……             |               |           |            |        |        |          |        |        |         |        |        |           |
