# RISC-V Linux 观测内容

## 流行 Linux 发行版 for RISC-V 的镜像仓库 , 软件包仓库, Wiki 支持页等讯息

| 运行环境 | openEuler               | Arch Linux           | Gentoo | Debian | openSUSE | Fedora             | Ubuntu | FreeBSD             | Deepin | Anolis | openKylin   | Alpine |
|-| ----------------------- | -------------------- | ------ | ------ | -------- | ------------------ | ------ | ------------------- | ------ | ------ | ----------- | ------ |
| 镜像仓库 | [ISCAS 仓库][oeRepo] | [开发者仓库][archrv] |   | [DQIB][debImage] | [官方仓库][suseImage] | [官方仓库][fedora] | [Server 22.04.1][ubuntuImage], 另见 Wiki 页 | [官方仓库][freebsdImage] |        | [官方仓库][OpenAnolis Image]       | [兰州大学镜像][openkylinlzuImage] <br /> [网易镜像][openkylin163Image] | [官方仓库][alpineImage] |
| 软件包仓库 | [openEuler OBS][oeOBS] |  |  | [buildd][debBuildD] | [OBS][suseOBS] |  |  |||[OpenAnolis 增补][OpenAnolis]|[官方仓库][openkylin]| [官方软件包][alpineAPK]|
| Wiki 支持页 | [RISC-V SIG 组][oerv] |  |  | [Debian Wiki][DebWiki] | [Category:RISC-V][susewiki] |  | [Wiki 页][UbuntuWiki] | [Wiki页][freebsdwiki] |  | [OpenAnolis RISC-V SIG 组][OpenAnolis SIG] | | |

[oeRepo]: https://mirror.iscas.ac.cn/openeuler-sig-riscv/openEuler-RISC-V/
[archrv]: https://archriscv.felixc.at/
[suseimage]: https://download.opensuse.org/ports/riscv/tumbleweed/images/
[fedora]: https://fedorapeople.org/groups/risc-v/disk-images/
[ubuntuImage]: https://cdimage.ubuntu.com/releases/22.04.1/release/
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

[OpenAnolis]: http://build.openanolis.cn/kojifiles/repos/anolis-riscv64-repo-external
[OpenAnolis Image]: http://build.openanolis.cn/kojifiles/rsync/alt/
[OpenAnolis SIG]: https://openanolis.cn/sig/RISC-V

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

| 分组            | 测试项        | openEuler | Arch Linux | Gentoo | Debian |                  openSUSE|                          Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin | Alpine |
| --------------- | ------------- | --------- | ---------- | ------ | ------ | ------------------------ | ------------------------ | ------ | ------- | ------ | ------ | --------- | ------ |
| 编译器工具链    | gcc           |           |            |        |        | ✅ gcc-12.2.1           | ✅ gcc-12.1.1           |        |         |        | ✅ gcc-12.0.1 | ✅ gcc-10 | ✅ gcc-12.1.1  |
|                 | gdb           |           |            |        |        | ✅ gdb-12.1             | ✅ gdb-12.1             |        |         |        | ✅ gdb-11.2 | ✅ gdb-9.1 |✅ gdb-12.1 |
|                 | llvm          |           |            |        |        | ✅ llvm-14.0.6          | ✅ llvm-14.0.5          |        |         |        | ✅ llvm-13.0.1 | ✅ llvm-10.0.0 | ✅ llvm-14.0.6   |
|                 | clang         |           |            |        |        | ✅ clang-14.0.6         | ✅ clang-14.0.5         |        |         |        |        | ✅ clang-10.0.0 | ✅ clang-14.0.6 |
|                 | cmake         |           |            |        |        | ✅ cmake-3.24.2         | ✅ cmake-3.24.1         |        |         |        | ✅ cmake-3.22.2 | ✅ cmake-3.16.3 | ✅ cmake-3.24.2 |
| 语言            | perl          |           |            |        |        | ✅ perl-5.36.0          |                          |        |         |        | ⚠️ perl-5.34.0 | ✅ perl-5.30.0 | ✅ perl-5.36.0 |
|                 | python        |           |            |        |        | ✅ python-3.10.7        | ✅ python-3.9.7         |        |         |        | ✅	python-3.10.2       | ✅ python-3.8 | ✅ python-3.10.7 |
|                 | rust          |           |            |        |        | ✅ rust-1.63.0          | ✅ rust-1.63.0          |        |         |        | ✅ rust-1.58.1       | ✅ rust-1.59.0 |         |
|                 | ruby          |           |            |        |        | ✅ ruby-3.1             |                          |        |         |        |        |           | ✅ ruby-3.1.2  |
|                 | openJDK       |           |            |        |        | ✅ openjdk-1.8/11/17/18 | ✅ openjdk-11           |        |         |        | ✅ openjdk-11 (bisheng & dragonwell & OpenJDK) | ✅ openjdk-8 |         |
|                 | Nodejs        |           |            |        |        | ✅ nodejs-18.9.0        | ⚠️                       |        |         |        | ✅ nodejs-v16.15.1 | ✅ nodejs-12.22.9 | ✅ nodejs-16.17.0   |
|                 | Ocaml         |           |            |        |        | ✅ ocaml-4.14.0         |                          |        |         |        | ✅ ocaml-4.12.0-3       |           |        | 
|                 | golang        |           |            |        |        | ✅ go-1.19              | ✅ golang-1.19          |        |         |        | ✅ golang-1.18.3       |           |        |
|                 | erlang        |           |            |        |        | ✅ erlang-25.0.4        |                          |        |         |        |        |           | ✅ erlang-25.0.3 |
| 构建工具        | obs           |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | osc           |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | obs-server    |           |            |        |        |                          |                          |        |         |        |        |           |        |
| 容器            | runc          |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | docker        |           |            |        |        | ✅ docker-20.10.17      |                          |        |         |        |        | ✅ docker.io-19.03.8 | ✅ docker-20.10.18  |
| 桌面            | Xfce Desktop  |           |            |        |        |                          |                          |        |         |        |        |           |        | 
|                 | KDE           |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | LXDE          |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | GNOME         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Deepin        |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | MATE          |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | LXQT          |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Enlightenment |           |            |        |        |                          |                          |        |         |        |        |           |        |
| 浏览器          | firefox       |           |            |        |        |                          |                          |        |         |        |  ✅      |           |        |
|                 | chromium      |           |            |        |        |                          |                          |        |         |        |  ✅      |           |        |
| 图像浏览编辑    | GIMP          |           |            |        |        |                          |                          |        |         |        |        |           |        |
| 多媒体播放器    | VLC           |           |            |        |        |                          |                          |        |         |        |        |           |        |
| 办公软件        | LibreOffice   |           |            |        |        |                          |                          |        |         |        | ✅       |           |        |
|                 | Thunderbird   |           |            |        |        |                          |                          |        |         |        |        |           |        |
| IDE             | eclipse       |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | VSCode        |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | PyCharm       |           |            |        |        |                          |                          |        |         |        |        |           |        |
| DB              | sqlite        |           |            |        |        |                          |                          |        |         |        |  ✅      |           |        |
|                 | Mysql         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | postgresql    |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | MongoDB       |           |            |        |        |                          |                          |        |         |        |        |           |        |
| http/web 服务器 | Apache2       |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Nginx         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | HAProxy       |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Lighttpd      |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Tengine       |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Squid         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Varnish       |           |            |        |        |                          |                          |        |         |        |        |           |        |
| web             | flask         |           |            |        |        |                          |                          |        |         |        |        |           |        |
| 大数据          | HBase         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Hadoop        |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | hive          |           |            |        |        |                          |                          |        |         |        |        |           |        |
| 中间件          | Redis         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | MemCache      |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | mybatis       |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | Dubbo         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | zookeeper     |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | numpy         |           |            |        |        |                          |                          |        |         |        |        |           |        |
|                 | scipy         |           |            |        |        |                          |                          |        |         |        |        |           |        |
| 机器学习        | tensorflow    |           |            |        |        |                          |                          |        |         |        |        |           |        |
| ……              |               |           |            |        |        |          |        |        |         |        |        |           |        |
