# RISC-V Linux 观测内容

## 流行 Linux 发行版 for RISC-V 的镜像仓库 , 软件包仓库, Wiki 支持页等讯息

| openEuler               | Arch Linux           | Gentoo | Debian | openSUSE | Fedora             | Ubuntu | FreeBSD             | Deepin | Anolis | openKylin   |
| ----------------------- | -------------------- | ------ | ------ | -------- | ------------------ | ------ | ------------------- | ------ | ------ | ----------- |
| [ISCAS 仓库][oeRepo] | [开发者仓库][archrv] |   | [DQIB][debImage] | [官方仓库][suseImage] | [官方仓库][fedora] | [Server 22.04.1][ubuntuImage], 另见 Wiki 页 | [官方仓库][freebsd] |        |        | [官方仓库][openkylin] |
| [openEuler OBS][oeOBS] |  |  | [buildd][debBuildD] | [OBS][suseOBS] |  |  |
| [RISC-V SIG 组][oerv] |  |  | [Debian Wiki][DebWiki] | [Category:RISC-V][susewiki] |  | [Wiki 页][UbuntuWiki] |  |  |  | |

[oeRepo]: https://mirror.iscas.ac.cn/openeuler-sig-riscv/openEuler-RISC-V/
[archrv]: https://archriscv.felixc.at/
[suseimage]: https://download.opensuse.org/ports/riscv/tumbleweed/images/
[fedora]: https://fedorapeople.org/groups/risc-v/disk-images/
[ubuntuImage]: https://cdimage.ubuntu.com/releases/22.04.1/release/
[debImage]: https://gitlab.com/api/v4/projects/giomasce%2Fdqib/jobs/artifacts/master/download?job=convert_riscv64-virt
[freebsd]: http://pkgmir.geo.freebsd.org/FreeBSD:14:riscv64/
[openkylin]: http://archive.build.openkylin.top/openkylin

[oeOBS]: https://build.openeuler.org/project/show/openEuler:Mainline:RISC-V
[debBuildD]: https://buildd.debian.org/status/architecture.php?suite=unstable&a=riscv64&priority=
[suseOBS]: https://build.opensuse.org/project/show/openSUSE:Factory:RISCV

[oerv]: https://gitee.com/openEuler/RISC-V
[suseWiki]: https://en.opensuse.org/Category:RISC-V
[DebWiki]: https://wiki.debian.org/RISC-V
[UbuntuWiki]: https://wiki.ubuntu.com/RISC-V


## 流行 Linux 发行版 for RISC-V 硬件适配情况（主流 RISC-V 开发板）

| 运行环境                 | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin |
| ------------------------ | --------- | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- |
| QEMU                     | √         | √          | √      | √      | √        | √      | √      | √       |        | √      |           |
| 全志哪吒 D1              | √         | √          | √      | √      | √        | √      |  √     |         |        | √      |           |
| 赛昉 VisionFive          | √         | √          | √      | √      | √        | √      | √      |         |        |        | √         |
| HiFive Unleashed         |           | √          | √      |        | √        |        |        |         |        |        |           |
| HiFive Unmatched         | √         | √          | √      | √      | √        | √      | √      |         |        |        | √         |
| PolarFire SoC Icicle Kit |           | √          |        |        | √        | √      |        |         |        |        |           |


## 流行 Linux 发行版 for RISC-V 的应用支持情况测评和对比

| 分组            | 测试项        | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin |
| --------------- | ------------- | --------- | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- |
| 编译器工具链    | gcc           |           |            |        |        |          |        |        |         |        |        |           |
|                 | gdb           |           |            |        |        |          |        |        |         |        |        |           |
|                 | llvm          |           |            |        |        |          |        |        |         |        |        |           |
|                 | clang         |           |            |        |        |          |        |        |         |        |        |           |
|                 | cmake         |           |            |        |        |          |        |        |         |        |        |           |
| 语言            | perl          |           |            |        |        |          |        |        |         |        |        |           |
|                 | python        |           |            |        |        |          |        |        |         |        |        |           |
|                 | rust          |           |            |        |        |          |        |        |         |        |        |           |
|                 | ruby          |           |            |        |        |          |        |        |         |        |        |           |
|                 | openJDK       |           |            |        |        |          |        |        |         |        |        |           |
|                 | Nodejs        |           |            |        |        |          |        |        |         |        |        |           |
|                 | Ocaml         |           |            |        |        |          |        |        |         |        |        |           |
|                 | golang        |           |            |        |        |          |        |        |         |        |        |           |
|                 | erlang        |           |            |        |        |          |        |        |         |        |        |           |
| 构建工具        | obs           |           |            |        |        |          |        |        |         |        |        |           |
|                 | osc           |           |            |        |        |          |        |        |         |        |        |           |
|                 | obs-server    |           |            |        |        |          |        |        |         |        |        |           |
| 容器            | runc          |           |            |        |        |          |        |        |         |        |        |           |
|                 | docker        |           |            |        |        |          |        |        |         |        |        |           |
| 桌面            | Xfce Desktop  |           |            |        |        |          |        |        |         |        |        |           |
|                 | KDE           |           |            |        |        |          |        |        |         |        |        |           |
|                 | LXDE          |           |            |        |        |          |        |        |         |        |        |           |
|                 | GNOME         |           |            |        |        |          |        |        |         |        |        |           |
|                 | Deepin        |           |            |        |        |          |        |        |         |        |        |           |
|                 | MATE          |           |            |        |        |          |        |        |         |        |        |           |
|                 | LXQT          |           |            |        |        |          |        |        |         |        |        |           |
|                 | Enlightenment |           |            |        |        |          |        |        |         |        |        |           |
| 浏览器          | firefox       |           |            |        |        |          |        |        |         |        |        |           |
|                 | chromium      |           |            |        |        |          |        |        |         |        |        |           |
| 图像浏览编辑    | GIMP          |           |            |        |        |          |        |        |         |        |        |           |
| 多媒体播放器    | VLC           |           |            |        |        |          |        |        |         |        |        |           |
| 办公软件        | LibreOffice   |           |            |        |        |          |        |        |         |        |        |           |
|                 | Thunderbird   |           |            |        |        |          |        |        |         |        |        |           |
| IDE             | eclipse       |           |            |        |        |          |        |        |         |        |        |           |
|                 | VSCode        |           |            |        |        |          |        |        |         |        |        |           |
|                 | PyCharm       |           |            |        |        |          |        |        |         |        |        |           |
| DB              | sqlite        |           |            |        |        |          |        |        |         |        |        |           |
|                 | Mysql         |           |            |        |        |          |        |        |         |        |        |           |
|                 | postgresql    |           |            |        |        |          |        |        |         |        |        |           |
|                 | MongoDB       |           |            |        |        |          |        |        |         |        |        |           |
| http/web 服务器 | Apache2       |           |            |        |        |          |        |        |         |        |        |           |
|                 | Nginx         |           |            |        |        |          |        |        |         |        |        |           |
|                 | HAProxy       |           |            |        |        |          |        |        |         |        |        |           |
|                 | Lighttpd      |           |            |        |        |          |        |        |         |        |        |           |
|                 | Tengine       |           |            |        |        |          |        |        |         |        |        |           |
|                 | Squid         |           |            |        |        |          |        |        |         |        |        |           |
|                 | Varnish       |           |            |        |        |          |        |        |         |        |        |           |
| web             | flask         |           |            |        |        |          |        |        |         |        |        |           |
| 大数据          | HBase         |           |            |        |        |          |        |        |         |        |        |           |
|                 | Hadoop        |           |            |        |        |          |        |        |         |        |        |           |
|                 | hive          |           |            |        |        |          |        |        |         |        |        |           |
| 中间件          | Redis         |           |            |        |        |          |        |        |         |        |        |           |
|                 | MemCache      |           |            |        |        |          |        |        |         |        |        |           |
|                 | mybatis       |           |            |        |        |          |        |        |         |        |        |           |
|                 | Dubbo         |           |            |        |        |          |        |        |         |        |        |           |
|                 | zookeeper     |           |            |        |        |          |        |        |         |        |        |           |
|                 | numpy         |           |            |        |        |          |        |        |         |        |        |           |
|                 | scipy         |           |            |        |        |          |        |        |         |        |        |           |
| 机器学习        | tensorflow    |           |            |        |        |          |        |        |         |        |        |           |
| ……              |               |           |            |        |        |          |        |        |         |        |        |           |
