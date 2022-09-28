# RISC-V Linux 观测内容

## 流行 Linux 发行版 for RISC-V 的镜像仓库 , 软件包仓库, Wiki 支持页等讯息

| 运行环境    | openEuler              | Arch Linux           | Gentoo | Debian                 | openSUSE                    | Fedora             | Ubuntu                                      | FreeBSD                  | Deepin | Anolis                                     | openKylin                                                              | Alpine                  |
| ----------- | ---------------------- | -------------------- | ------ | ---------------------- | --------------------------- | ------------------ | ------------------------------------------- | ------------------------ | ------ | ------------------------------------------ | ---------------------------------------------------------------------- | ----------------------- |
| 镜像仓库    | [ISCAS 仓库][oerepo]   | [开发者仓库][archrv] |        | [DQIB][debimage]       | [官方仓库][suseimage]       | [官方仓库][fedora] | [Server 22.04.1][ubuntuimage], 另见 Wiki 页 | [官方仓库][freebsdimage] |        | [官方仓库][openanolis image]               | [兰州大学镜像][openkylinlzuimage] <br /> [网易镜像][openkylin163image] | [官方仓库][alpineimage] |
| 软件包仓库  | [openEuler OBS][oeobs] | [GitHub][archrvpkg]  |        | [buildd][debbuildd]    | [OBS][suseobs]              |                    |                                             |                          |        | [OpenAnolis 增补][openanolis]              | [官方仓库][openkylin]                                                  | [官方软件包][alpineapk] |
| Wiki 支持页 | [RISC-V SIG 组][oerv]  |                      |        | [Debian Wiki][debwiki] | [Category:RISC-V][susewiki] |                    | [Wiki 页][ubuntuwiki]                       | [Wiki 页][freebsdwiki]   |        | [OpenAnolis RISC-V SIG 组][openanolis sig] |                                                                        |                         |

潜在对象：

- Manjaro <https://repo-riscv.manjaro.org/README>

[oerepo]: https://mirror.iscas.ac.cn/openeuler-sig-riscv/openEuler-RISC-V/
[archrv]: https://archriscv.felixc.at/
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
[susewiki]: https://en.opensuse.org/Category:RISC-V
[debwiki]: https://wiki.debian.org/RISC-V
[ubuntuwiki]: https://wiki.ubuntu.com/RISC-V
[openanolis]: http://build.openanolis.cn/kojifiles/repos/anolis-riscv64-repo-external
[openanolis image]: http://build.openanolis.cn/kojifiles/rsync/alt/
[openanolis sig]: https://openanolis.cn/sig/RISC-V

## 流行 Linux 发行版 for RISC-V 硬件适配情况（主流 RISC-V 开发板）

使用非发行版软件源中的内核启动（如从厂商源码编译）也视作可以启动

| 运行环境                 | openEuler | Arch Linux | Gentoo | Debian | openSUSE | Fedora | Ubuntu | FreeBSD | Deepin | Anolis | openKylin | Alpine |
| ------------------------ | --------- | ---------- | ------ | ------ | -------- | ------ | ------ | ------- | ------ | ------ | --------- | ------ |
| QEMU                     | √         | √          | √      | √      | √        | √      | √      | √       |        | √      |           |        |
| 全志哪吒 D1              | √         | √          | √      | √      | √        | √      | √      |         |        | √      |           |        |
| 赛昉 VisionFive          | √         | √          | √      | √      | √        | √      | √      |         |        |        | √         |        |
| HiFive Unleashed         |           | √          | √      |        | √        |        |        | √       |        |        |           |        |
| HiFive Unmatched         | √         | √          | √      | √      | √        | √      | √      | √       |        |        | √         |        |
| PolarFire SoC Icicle Kit |           | √          |        |        | √        | √      |        |         |        |        |           |        |

## 流行 Linux 发行版 for RISC-V 的应用支持情况测评和对比

| 分组            | 测试项        | openEuler | Arch Linux                     | Gentoo | Debian | openSUSE | Fedora          | Ubuntu | FreeBSD | Deepin | Anolis                                         | openKylin            | Alpine |
| --------------- | ------------- | --------- | ------------------------------ | ------ | ------ | -------- | --------------- | ------ | ------- | ------ | ---------------------------------------------- | -------------------- | ------ |
| 编译器工具链    | gcc           |           | ✅ 12.2.0                      |        |        |          | ✅ gcc-12.1.1   |        |         |        | ✅ gcc-12.0.1                                  | ✅ gcc-10            |        |
|                 | gdb           |           | ✅ 12.1                        |        |        |          | ✅ gdb-12.1     |        |         |        | ✅ gdb-11.2                                    | ✅ gdb-9.1           |        |
|                 | llvm          |           | ✅ 14.0.6                      |        |        |          | ✅ llvm-14.0.5  |        |         |        | ✅ llvm-13.0.1                                 | ✅ llvm-10.0.0       |        |
|                 | clang         |           | ✅ 14.0.6                      |        |        |          | ✅ clang-14.0.5 |        |         |        |                                                | ✅ clang-10.0.0      |        |
|                 | cmake         |           | ✅ 3.24.2                      |        |        |          | ✅ cmake-3.24.1 |        |         |        | ✅ cmake-3.22.2                                | ✅ cmake-3.16.3      |        |
| 语言            | perl          |           | ✅ 5.36.0                      |        |        |          |                 |        |         |        | ⚠️ perl-5.34.0                                 | ✅ perl-5.30.0       |        |
|                 | python        |           | ✅ 3.10.7                      |        |        |          | ✅ python-3.9.7 |        |         |        | ✅ python-3.10.2                               | ✅ python-3.8        |        |
|                 | rust          |           | ✅ 1.63.0                      |        |        |          | ✅ rust-1.63.0  |        |         |        | ✅ rust-1.58.1                                 | ✅ rust-1.59.0       |        |
|                 | ruby          |           | ✅ 3.0.4p208                   |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | openJDK       |           | ✅ 11.0.15 (openJDK & Bisheng) |        |        |          | ✅ openjdk-11   |        |         |        | ✅ openjdk-11 (bisheng & dragonwell & OpenJDK) | ✅ openjdk-8         |        |
|                 | Nodejs        |           | ✅ 18.9.1                      |        |        |          | ⚠️              |        |         |        | ✅ nodejs-v16.15.1                             | ✅ nodejs-12.22.9    |        |
|                 | Ocaml         |           |                                |        |        |          |                 |        |         |        | ✅ ocaml-4.12.0-3                              |                      |        |
|                 | golang        |           | ✅ 1.19                        |        |        |          | ✅ golang-1.19  |        |         |        | ✅ golang-1.18.3                               |                      |        |
|                 | erlang        |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| 构建工具        | obs           |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | osc           |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | obs-server    |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| 容器            | runc          |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | docker        |           | ✅ 20.10.17                    |        |        |          |                 |        |         |        |                                                | ✅ docker.io-19.03.8 |        |
| 桌面            | Xfce Desktop  |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | KDE           |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | LXDE          |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | GNOME         |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Deepin        |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | MATE          |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | LXQT          |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Enlightenment |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| 浏览器          | firefox       |           |                                |        |        |          |                 |        |         |        | ✅                                             |                      |        |
|                 | chromium      |           |                                |        |        |          |                 |        |         |        | ✅                                             |                      |        |
| 图像浏览编辑    | GIMP          |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| 多媒体播放器    | VLC           |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| 办公软件        | LibreOffice   |           |                                |        |        |          |                 |        |         |        | ✅                                             |                      |        |
|                 | Thunderbird   |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| IDE             | eclipse       |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | VSCode        |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | PyCharm       |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| DB              | sqlite        |           | ✅ 3.39.1                      |
|                 |               |           |                                |        |        |          | ✅              |        |         |
|                 | Mysql         |           | mariadb-10.9.3                 |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | postgresql    |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | MongoDB       |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| http/web 服务器 | Apache2       |           | ✅ 2.4.54                      |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Nginx         |           | ✅ 1.22.0                      |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | openssl       |           | ✅ 1.1.1.q                     |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | HAProxy       |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Lighttpd      |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Tengine       |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Squid         |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Varnish       |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| web             | flask         |           | ✅                             |        |        |          |                 |        |         |        |                                                |                      |        |
| 大数据          | HBase         |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Hadoop        |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | hive          |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| 中间件          | Redis         |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | MemCache      |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | mybatis       |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | Dubbo         |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | zookeeper     |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | numpy         |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
|                 | scipy         |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| 机器学习        | tensorflow    |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
| ……              |               |           |                                |        |        |          |                 |        |         |        |                                                |                      |        |
