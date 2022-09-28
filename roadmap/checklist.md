# RISC-V Linux 观测内容

## 流行 Linux 发行版 for RISC-V 的镜像仓库 , 软件包仓库, Wiki 支持页等讯息

| 运行环境 | openEuler               | Arch Linux           | Gentoo | Debian | openSUSE | Fedora             | Ubuntu | FreeBSD             | Deepin | Anolis | openKylin   | Alpine | OpenBSD |
|-| ----------------------- | -------------------- | ------ | ------ | -------- | ------------------ | ------ | ------------------- | ------ | ------ | ----------- | ------ | ------- |
| 镜像仓库 | [ISCAS 仓库][oeRepo] | [开发者仓库][archrv] | [官方镜像仓库][gentoo-mirror], [RISC-V overlay][riscv-overlay] | [DQIB][debImage] | [官方仓库][suseImage] | [官方仓库][fedora] | [Server 22.04.1][ubuntuImage], 另见 Wiki 页 | [官方仓库][freebsdImage] |        | [官方仓库][OpenAnolis Image]       | [兰州大学镜像][openkylinlzuImage] <br /> [网易镜像][openkylin163Image] | [官方仓库][alpineImage] |
| 软件包仓库 | [openEuler OBS][oeOBS] | [GitHub][archrvpkg] |  | [buildd][debBuildD] | [OBS][suseOBS] |  |  |||[OpenAnolis 增补][OpenAnolis]|[官方仓库][openkylin]| [官方软件包][alpineAPK]|
| Wiki 支持页 | [RISC-V SIG 组][oerv] |  | [RISC-V 项目页][gentoo-riscv-proj] | [Debian Wiki][DebWiki] | [Category:RISC-V][susewiki] |  | [Wiki 页][UbuntuWiki] | [Wiki页][freebsdwiki] |  | [OpenAnolis RISC-V SIG 组][OpenAnolis SIG] | | |

潜在对象：

- Manjaro <https://repo-riscv.manjaro.org/README>

[oerepo]: https://mirror.iscas.ac.cn/openeuler-sig-riscv/openEuler-RISC-V/
[archrv]: https://archriscv.felixc.at/
[gentoo-mirror]: https://github.com/gentoo-mirror/gentoo
[riscv-overlay]: https://github.com/gentoo/riscv
[archrvpkg]: https://github.com/felixonmars/archriscv-packages
[suseimage]: https://download.opensuse.org/ports/riscv/tumbleweed/images/
[fedora]: https://fedorapeople.org/groups/risc-v/disk-images/
[ubuntuimage]: https://cdimage.ubuntu.com/releases/22.04.1/release/
[debimage]: https://gitlab.com/api/v4/projects/giomasce%2Fdqib/jobs/artifacts/master/download?job=convert_riscv64-virt
[alpineimage]: https://dl-cdn.alpinelinux.org/alpine/edge/releases/riscv64/
[freebsdimage]: https://download.freebsd.org/ftp/snapshots/VM-IMAGES/14.0-CURRENT/riscv64/Latest/
[freebsdwiki]: https://wiki.freebsd.org/riscv
[openkylin]: http://archive.build.openkylin.top/openkylin
[openkylinlzuimage]: https://mirror.lzu.edu.cn/openkylin-cdimage/
[openkylin163image]: https://mirrors.163.com/openkylin-cd/
[oeobs]: https://build.openeuler.org/project/show/openEuler:Mainline:RISC-V
[debbuildd]: https://buildd.debian.org/status/architecture.php?suite=unstable&a=riscv64&priority=
[suseobs]: https://build.opensuse.org/project/show/openSUSE:Factory:RISCV
[alpineapk]: https://pkgs.alpinelinux.org/packages?arch=riscv64
[oerv]: https://gitee.com/openEuler/RISC-V
[gentoo-riscv-proj]: https://wiki.gentoo.org/wiki/Project:RISC-V
[suseWiki]: https://en.opensuse.org/Category:RISC-V
[DebWiki]: https://wiki.debian.org/RISC-V
[UbuntuWiki]: https://wiki.ubuntu.com/RISC-V
[OpenAnolis]: http://build.openanolis.cn/kojifiles/repos/anolis-riscv64-repo-external
[OpenAnolis Image]: http://build.openanolis.cn/kojifiles/rsync/alt/
[OpenAnolis SIG]: https://openanolis.cn/sig/RISC-V

## 流行 Linux 发行版 for RISC-V 硬件适配情况（主流 RISC-V 开发板）

使用非发行版软件源中的内核启动（如从厂商源码编译）也视作可以启动
| 运行环境                 | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin | Alpine | OpenBSD |
| ------------------------ | --------- | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- | ------ | ------- |
| QEMU                     | √         | √          | √      | √      | √        | √      | √      | √       |        | √      |           |        |
| 全志哪吒 D1              | √         | √          | √      | √      | √        | √      | √      |         |        | √      |           |        |
| 赛昉 VisionFive          | √         | √          | √      | √      | √        | √      | √      |         |        |        | √         |        |
| HiFive Unleashed         |           | √          | √      |        | √        |        |        | √       |        |        |           |        |
| HiFive Unmatched         | √         | √          | √      | √      | √        | √      | √      | √       |        |        | √         |        |
| PolarFire SoC Icicle Kit |           | √          |        |        | √        | √      |        |         |        |        |           |        |


## 流行 Linux 发行版 for RISC-V 的应用支持情况测评和对比

| 分组            | 测试项        | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin | Alpine | OpenBSD |
| --------------- | ------------- | --------- | ---------- | ------ | ------ | -------- | -------------- | ------ | ------- | ------ | ------ | --------- | ------ | ------- |
| 编译器工具链    | gcc           |           | ✅ gcc-12.2.0 | ✅ gcc-12.1.1 | ✅ gcc-12.2.0 | ✅ gcc-12.2.1 | ✅ gcc-12.1.1  |        | ✅gcc-9.3.0 |        | ✅ gcc-12.0.1 | ✅ gcc-10 | ✅ gcc-12.1.1  ||
|                 | gdb           |           | ✅ gdb-12.1 | ✅ gdb-12.1 | ✅ gdb-12.1 | ✅ gdb-12.1 | ✅ gdb-12.1  |        | ✅ gdb-11.1 |        | ✅ gdb-11.2 | ✅ gdb-9.1 |✅ gdb-12.1 ||
|                 | llvm          |           | ✅ llvm-14.0.6 | ✅ llvm-15.0.1 | ✅ llvm-14.0.6 | ✅ llvm-14.0.6 | ✅ llvm-14.0.5 |        | ✅ llvm-9.0.1 |        | ✅ llvm-13.0.1 | ✅ llvm-10.0.0 | ✅ llvm-14.0.6   ||
|                 | clang         |           | ✅ clang-14.0.6 | ✅ clang-15.0.1 |  ✅ clang-14.0.6 | ✅ clang-14.0.6 | ✅ clang-14.0.5 |        | ✅ clang-14.0.5 |        |        | ✅ clang-10.0.0 | ✅ clang-14.0.6 ||
|                 | cmake         |           | ✅ cmake-3.24.2 | ✅ cmake-3.24.2 | ✅ cmake-3.24.2 | ✅ cmake-3.24.2 | ✅ cmake-3.24.1   |        | ✅ cmake-3.21.4 |        | ✅ cmake-3.22.2 | ✅ cmake-3.16.3 | ✅ cmake-3.24.2 ||
| 语言            | perl          |           | ✅ perl-5.36.0 | ✅ perl-5.36.0 | ✅ perl-5.34.0 | ✅ perl-5.36.0  |                 |        | ✅ perl-5.32.1 |        | ⚠️ perl-5.34.0 | ✅ perl-5.30.0 | ✅ perl-5.36.0 ||
|                 | python        |           | ✅ python-3.10.7 | ✅ python-3.11.0 | ✅ python-3.10.6 | ✅ python-3.10.7 | ✅ python-3.9.7 |        | ✅python-3.8.12 |        | ✅	python-3.10.2       | ✅ python-3.8 | ✅ python-3.10.7 ||
|                 | rust          |           | ✅ rust-1.63.0 | ✅ rust-1.64.0 | ✅ rust-1.61 | ✅ rust-1.63.0 | ✅ rust-1.63.0  |        | ⚠️ |        | ✅ rust-1.58.1       | ✅ rust-1.59.0 |         ||
|                 | ruby          |           | ✅ ruby-3.0.4p208 | ✅ ruby-3.1.2 | ✅ ruby-1:3.0 | ✅ ruby-3.1 |                 |        | ✅ ruby-2.7.4 |        |        |           | ✅ ruby-3.1.2  ||
|                 | openJDK       |           | ✅ openJDK-17.0.1, 11.0.15 (openJDK & Bisheng) | ✅ openjdk-17.0.5 | ✅ openjdk-19 | ✅ openjdk-1.8/11/17/18 | ✅ openjdk-11 |        | ⚠️ |        | ✅ openjdk-11 (bisheng & dragonwell & OpenJDK) | ✅ openjdk-8 |         ||
|                 | Nodejs        |           | ✅ Nodejs-18.9.1 | ✅ nodejs-18.9.1 | ✅ nodejs-18.7.0 | ✅ nodejs-18.9.0 | ⚠️             |        | ⚠️ |        | ✅ nodejs-v16.15.1 | ✅ nodejs-12.22.9 | ✅ nodejs-16.17.0   ||
|                 | Ocaml         |           |  | ✅ ocaml-4.14.0 | ✅ ocaml-4.13.1 | ✅ ocaml-4.14.0 |                |        |         |        | ✅ ocaml-4.12.0-3       |           |        ||
|                 | golang        |           | ✅ golang-1.19 |  ✅ golang-1.19.1 | ✅ golang-1.19 | ✅ golang-1.19 | ✅ golang-1.19 |        | ⚠️ |        | ✅ golang-1.18.3       |           |        ||
|                 | erlang        |           |            | ✅ erlang-25.0.4 | ✅ erlang-1:24.3.4.5 | ✅ erlang-25.0.4 |        |        |         |        |        |           | ✅ erlang-25.0.3 ||
| 构建工具        | obs           |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | osc           |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | obs-server    |           |            |        |        |          |        |        |         |        |        |           |        ||
| 容器            | runc          |           |            | ✅ runc-1.1.3 |        |          |        |        |         |        |        |           |        ||
|                 | docker        |           | ✅ docker-20.10.17 | ✅ docker-20.10.17 |        | ✅ docker-20.10.17 |        |        |  |        |        | ✅ docker.io-19.03.8 | ✅ docker-20.10.18  ||
| 桌面            | Xfce Desktop  |           |            | ✅ xfce4-meta-4.16 | ✅ xfce4-4.16 |  |        |        |         |        |        |           |        ||
|                 | KDE           |           |            | ✅ plasma-meta-5.25.5 | ✅ kde-5:129 |  |        |        |         |        |        |           |        ||
|                 | LXDE          |           |            | ✅ lxde-meta-0.5.5 | ✅ lxde-11 |  |        |        |         |        |        |           |        ||
|                 | GNOME         |           |            | ✅ gnome-40.0 | ✅ gnome-1:42 |  |        |        |         |        |        |           |        ||
|                 | Deepin        |           |            | ✅ dde-meta-20.0 [^1] |        | ] |        |        |         |        |        |           |        ||
|                 | MATE          |           |            | ✅ mate-1.24 |        |  |        |        |         |        |        |           |        ||
|                 | LXQT          |           |            | ✅ lxqt-meta-1.1.0 | ✅ lxqt-30 |  |        |        |         |        |        |           |        ||
|                 | Enlightenment |           |            | ✅ enlightenment-0.25.4 |        |  |        |        |         |        |        |           |        ||
| 浏览器          | firefox       |           |            | ✅ firefox-103.0.1 | ⚠️ |  |        |        | ⚠️ |        |  ✅      |           |        ||
|                 | chromium      |           |            | ✅ chromium-98.0.4750.0 | ⚠️ |  |        |        | ✅ |        |  ✅      |           |        ||
| 图像浏览编辑    | GIMP          |           |            | ✅ gimp-2.10.32 |        |  |        |        |         |        |        |           |        ||
| 多媒体播放器    | VLC           |           |            | ✅ vlc-3.0.17 |        ||        |        |         |        |        |           |        ||
| 办公软件        | LibreOffice   |           |            | ✅ |        |          |        |        | ⚠️ |        | ✅       |           |        ||
|                 | Thunderbird   |           |            | ✅ thunderbird-94.0-beta1 |        |  |        |        |         |        |        |           |        ||
| IDE             | eclipse       |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | VSCode        |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | PyCharm       |           |            |        |        |          |        |        |         |        |        |           |        ||
| DB              | sqlite        |           | ✅ sqlite-3.39.1 | ✅ sqlite-3.39.3 | ✅ sqlite-2.8.17 | ✅ sqlite-3.39.3 |        |        |         |        |  ✅      |           |        ||
|                 | mariadb(Mysql) |           | ✅ mariadb-10.9.3 | ✅ mysql-8.0.27 | ✅ mariadb-1:10.6.8 | ⚠️ |        |        |         |        |        |           |        ||
|                 | postgresql    |           |            | ✅ postgresql-14.5 | ✅ postgresql-243 | ✅ postgresql-14.5 |        |        |         |        |        |           |        ||
|                 | MongoDB       |           |            |        | ⚠️ | ⚠️ |        |        |         |        |        |           |        ||
| http/web 服务器 | Apache2       |           | ✅ apache-2.4.54 | ✅ apache-2.4.54 | ✅ apache-2.4.54 | ✅ apache-22.4.54 |        |        |         |        |        |           |        ||
|                 | Nginx         |           | ✅ nginx-1.22.0 |        | ⚠️  | ✅ nginx-1.23.1 | ✅ nginx-1.23.1 |        |         |        |        |           |        ||
|                 | HAProxy       |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | Lighttpd      |           |            | ✅ lighttpd-1.4.67 | ✅ lighttpd-1.4.67 | ✅ lighttpd-1.4.66 |        |        |         |        |        |           |        ||
|                 | Tengine       |           |            |        | ⚠️ |          |        |        |         |        |        |           |        ||
|                 | Squid         |           |            | ✅ squid-5.4.1 | ✅ squid-5.6 | ✅ squid-5.7 |        |        |         |        |        |           |        ||
|                 | Varnish       |           |            |        | ✅ varnish-7.1.1 |          |        |        |         |        |        |           |        ||
| web             | flask         |           | ✅ |        |        |          |        |        |         |        |        |           |        ||
| 大数据          | HBase         |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | Hadoop        |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | hive          |           |            |        |        |          |        |        |         |        |        |           |        ||
| 中间件          | Redis         |           |            | ✅ redis-7.0.5 | ✅ redis-7.0.5 | ✅ redis-7.0.5 |        |        |         |        |        |           |        ||
|                 | MemCache      |           |            | ✅ memcached-1.6.17 | ✅ libmemcached-1.0.18 |  |        |        |         |        |        |           |        ||
|                 | mybatis       |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | Dubbo         |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | zookeeper     |           |            |        | ✅ zookeeper-3.8.0 |          |        |        |         |        |        |           |        ||
|                 | numpy         |           |            | ✅ numpy-1.23.3 | ✅ numpy-1:1.21.5 |  |        |        |         |        |        |           |        ||
|                 | scipy         |           |            | ✅ scipy-1.9.1 | ✅ scipy-1.8.1 |   |        |        |         |        |        |           |        ||
| 机器学习        | tensorflow    |           |            |        |        |          |        |        |         |        |        |           |        ||
|                 | openssl       |           | ✅ 1.1.1.q                             |        |        |          |                 |        |         |        |                                                |                      |        |
[^1]: 在 deepin-overlay 中，https://github.com/deepin-community/deepin-overlay
