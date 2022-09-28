# RISC-V Linux 观测内容

## 流行 Linux 发行版 for RISC-V 的镜像仓库 , 软件包仓库, Wiki 支持页等讯息

| 运行环境 | openEuler               | Arch Linux           | Gentoo | Debian | openSUSE | Fedora             | Ubuntu | FreeBSD             | Deepin | Anolis | openKylin   | Alpine |
|-| ----------------------- | -------------------- | ------ | ------ | -------- | ------------------ | ------ | ------------------- | ------ | ------ | ----------- | ------ |
| 镜像仓库 | [ISCAS 仓库][oeRepo] | [开发者仓库][archrv] |   | [DQIB][debImage] | [官方仓库][suseImage] | [官方仓库][fedora] | [Server 22.04.1][ubuntuImage], 详见 Wiki 页 | [官方仓库][freebsdImage] |        |        | [兰州大学镜像][openkylinlzuImage] <br /> [网易镜像][openkylin163Image] | [官方仓库][alpineImage] |
| 软件包仓库 | [openEuler OBS][oeOBS] |  |  | [buildd][debBuildD] | [OBS][suseOBS] |  |由 [Ubuntu-ports](ubuntu-ports) 一并提供，无独立仓库。||||[官方仓库][openkylin]| [官方软件包][alpineAPK]|
| Wiki 支持页 | [RISC-V SIG 组][oerv] |  |  | [Debian Wiki][DebWiki] | [Category:RISC-V][susewiki] |  | [Wiki 页][UbuntuWiki] | [Wiki页][freebsdwiki] |  |  | | |

[oeRepo]: https://mirror.iscas.ac.cn/openeuler-sig-riscv/openEuler-RISC-V/
[archrv]: https://archriscv.felixc.at/
[suseimage]: https://download.opensuse.org/ports/riscv/tumbleweed/images/
[fedora]: https://fedorapeople.org/groups/risc-v/disk-images/
[ubuntuImage]: https://cdimage.ubuntu.com/releases/22.04.1/release/
[ubuntu-ports]: http://ports.ubuntu.com/ubuntu-ports/
[debImage]: https://gitlab.com/api/v4/projects/giomasce%2Fdqib/jobs/artifacts/master/download?job=convert_riscv64-virt
[alpineImage]: https://dl-cdn.alpinelinux.org/alpine/edge/releases/riscv64/

[freebsdImage]: https://download.freebsd.org/ftp/snapshots/VM-IMAGES/14.0-CURRENT/riscv64/Latest/
[freebsdwiki]: https://wiki.freebsd.org/riscv

[openkylin]: http://archive.build.openkylin.top/openkylin
[openkylinlzuImage]: https://mirror.lzu.edu.cn/openkylin-cdimage/
[openkylin163Image]: https://mirrors.163.com/openkylin-cd/

[oeOBS]: https://build.openeuler.org/project/show/openEuler:Mainline:RISC-V
[debBuildD]: https://buildd.debian.org/status/architecture.php?suite=unstable&a=riscv64&priority=
[suseOBS]: https://build.opensuse.org/project/show/openSUSE:Factory:RISCV
[alpineAPK]: https://pkgs.alpinelinux.org/packages?arch=riscv64

[oerv]: https://gitee.com/openEuler/RISC-V
[suseWiki]: https://en.opensuse.org/Category:RISC-V
[DebWiki]: https://wiki.debian.org/RISC-V
[UbuntuWiki]: https://wiki.ubuntu.com/RISC-V

## 流行 Linux 发行版 for RISC-V 硬件适配情况（主流 RISC-V 开发板）

| 运行环境                 | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin | Alpine |
| ------------------------ | --------- | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- | ------ |
| QEMU                     | √         | √          | √      | √      | √        | √      | √      | √       |        | √      |           |        |
| 全志哪吒 D1              | √         | √          | √      | √      | √        | √      | √      |         |        | √      |           |        |
| 赛昉 VisionFive          | √         | √          | √      | √      | √        | √      | √      |         |        |        | √         |        |
| HiFive Unleashed         |           | √          | √      |        | √        |        |        | √       |        |        |           |        |
| HiFive Unmatched         | √         | √          | √      | √      | √        | √      | √      | √       |        |        | √         |        |
| PolarFire SoC Icicle Kit |           | √          |        |        | √        | √      |        |         |        |        |           |        |

## 流行 Linux 发行版 for RISC-V 的应用支持情况测评和对比

| 分组            | 测试项        | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin | Alpine |
| --------------- | ------------- | --------- | ---------- | ------ | ------ | -------- | -------------- | ------ | ------- | ------ | ------ | --------- | ------ |
| 编译器工具链    | gcc           |           |            |        |        |            | ✅ gcc-12.1.1  |✔️ gcc-12.1.1|         |        | ✅ gcc-12.0.1 | ✅ gcc-10 |        |
|                 | gdb           |           |            |        |        |          | ✅ gdb-12.1  |✔️ gdb-12.0.90|         |        | ✅ gdb-11.2 | ✅ gdb-9.1 |        |
|                 | llvm          |           |            |        |        |          | ✅ llvm-14.0.5 |✔️ llvm-14.0.0|         |        | ✅ llvm-13.0.1 | ✅ llvm-10.0.0 |        |
|                 | clang         |           |            |        |        |          | ✅ clang-14.0.5 |✔️ clang-14.0.0|         |        |        | ✅ clang-10.0.0 |        |
|                 | cmake         |           |            |        |        |  | ✅ cmake-3.24.1   |        |✔️ cmake-3.22.1|        | ✅ cmake-3.22.2 | ✅ cmake-3.16.3 |        |
| 语言            | perl          |           |            |        |        |          |                 |✔️ perl-5.34.0|         |        | ⚠️ perl-5.34.0 | ✅ perl-5.30.0 |        |
|                 | python        |           |            |        |        |          | ✅ python-3.9.7 |✔️ python3-3.10.6|         |        | ✅ python-3.10.2       | ✅ python-3.8 |        |
|                 | rust          |           |            |        |        |          | ✅ rust-1.63.0  |✔️ rust-1.59.0|         |        | ✅ rust-1.58.1       | ✅ rust-1.59.0 |        |
|                 | ruby          |           |            |        |        |          |                 |✔️ ruby3.0-3.0.2|         |        |        |           |        |
|                 | openJDK       |           |            |        |        |          | ✅ openjdk-11 |✔️ OpenJDK-18.0.2|         |        | ✅ openjdk-11 (bisheng & dragonwell & OpenJDK) | ✅ openjdk-8 |        |
|                 | Nodejs        |           |            |        |        |          | ⚠️             |❌|         |        |        | ✅ nodejs-12.22.9 |  |
|                 | Ocaml         |           |            |        |        |          |                |✔️ ocaml-4.13.1-3|         |        | ✅ ocaml-4.12.0-3       |           |        |
|                 | golang        |           |            |        |        |          | ✅ golang-1.19 |✔️ golang-go-1.18|         |        |        |           |        |
|                 | erlang        |           |            |        |        |          |        |        |✔️ erlang-24.2.1|        |        |           |        |
| 构建工具        | obs           |           |            |        |        |          |        |        |✔️ obs-build-20210120-1|        |        |           |        |
|                 | osc           |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | obs-server    |           |            |        |        |          |        |        |❌|        |        |           |        |
| 容器            | runc          |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | docker        |           |            |        |        |          |        |        |⚠️ 非官方支持|        |        | ✅ docker.io-19.03.8 |        |
| 桌面            | Xfce Desktop  |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | KDE           |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | LXDE          |           |            |        |        |          |        |        |✔️ lubuntu-desktop-22.04.3|        |        |           |        |
|                 | GNOME         |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | Deepin        |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | MATE          |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | LXQT          |           |            |        |        |          |        |        |✔️ lubuntu-desktop-22.04.3|        |        |           |        |
|                 | Enlightenment |           |            |        |        |          |        |        |✔️ enlightenment-0.25.3-1         |        |        |           |        |
| 浏览器          | firefox       |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | chromium      |           |            |        |        |          |        |        |❌|        |        |           |        |
| 图像浏览编辑    | GIMP          |           |            |        |        |          |        |        |✔️ gimp-2.10.30-1build1|        |        |           |        |
| 多媒体播放器    | VLC           |           |            |        |        |          |        |        |✔️ vlc-3.0.16-1build7|        |        |           |        |
| 办公软件        | LibreOffice   |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | Thunderbird   |           |            |        |        |          |        |        |❌|        |        |           |        |
| IDE             | eclipse       |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | VSCode        |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | PyCharm       |           |            |        |        |          |        |        |❌|        |        |           |        |
| DataBase              | sqlite        |           |            |        |        |          |        |✔️ sqlite3/jammy 3.37.2-2|         |        |        |           |        |
|                 | Mysql         |           |            |        |        |          |        |        |✔️ mysql-server-8.0.30-0ubuntu0.22.04.1|        |        |           |        |
|                 | postgresql    |           |            |        |        |          |        |        |✔️ postgresql-14+238 all|        |        |           |        |
|                 | MongoDB       |           |            |        |        |          |        |        |❌|        |        |           |        |
| http/web 服务器 | Apache2       |           |            |        |        |          |        |        |✔️ apache2-2.4.52-1ubuntu4.1|        |        |           |        |
|                 | Nginx         |           |            |        |        |          |        |        |✔️ nginx-1.18.0-6ubuntu14.2|        |        |           |        |
|                 | HAProxy       |           |            |        |        |          |        |        |✔️ haproxy 2.4.18-0ubuntu1|        |        |           |        |
|                 | Lighttpd      |           |            |        |        |          |        |        |✔️ lighttpd 1.4.63-1ubuntu3|        |        |           |        |
|                 | Tengine       |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | Squid         |           |            |        |        |          |        |        |✔️ squid-5.2-1ubuntu4.1|        |        |           |        |
|                 | Varnish       |           |            |        |        |          |        |        |✔️ varnish 6.6.1-1ubuntu0.2|        |        |           |        |
| web             | flask         |           |            |        |        |          |        |        |❌|        |        |           |        |
| 大数据          | HBase         |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | Hadoop        |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | hive          |           |            |        |        |          |        |        |❌|        |        |           |        |
| 中间件          | Redis         |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | MemCache      |           |            |        |        |          |        |        |memcached-1.6.14-1|        |        |           |        |
|                 | mybatis       |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | Dubbo         |           |            |        |        |          |        |        |❌|        |        |           |        |
|                 | zookeeper     |           |            |        |        |          |        |        |✔️ zookeeper-bin-3.4.13-6ubuntu4|        |        |           |        |
|                 | numpy         |           |            |        |        |          |        |        |✔️ python3-numpy-1.21.5-1build2|        |        |           |        |
|                 | scipy         |           |            |        |        |          |        |        |✔️ python3-scipy-1.8.0-1exp2ubuntu1|        |        |           |        |
| 机器学习        | tensorflow    |           |            |        |        |          |        |        |❌|        |        |           |        |
| ……              |               |           |            |        |        |          |        |        |         |        |        |           |        |
