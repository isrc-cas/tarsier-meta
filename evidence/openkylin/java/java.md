# openkylin java测试



## 测试环境



硬件环境：visionfive v1

系统：openkylin 1.0 beta




### 手动功能性测试

无法执行到功能性测试阶段 

'''
root@openkylin:/etc/apt# apt install openjdk-19-jdk openjdk-19-jre openjdk-19-jdk-headless openjdk-19-jre-headless akonadi-contacts-data ca-certificates-java java-common
正在读取软件包列表... 完成
正在分析软件包的依赖关系树... 完成
正在读取状态信息... 完成                 
建议安装：
  default-jre openjdk-19-demo openjdk-19-source visualvm libnss-mdns fonts-ipafont-gothic fonts-ipafont-mincho fonts-wqy-microhei | fonts-wqy-zenhei fonts-indic
推荐安装：
  libxt-dev libatk-wrapper-java-jni
下列【新】软件包将被安装：
  akonadi-contacts-data ca-certificates-java java-common openjdk-19-jdk openjdk-19-jdk-headless openjdk-19-jre openjdk-19-jre-headless
升级了 0 个软件包，新安装了 7 个软件包，要卸载 0 个软件包，有 152 个软件包未被升级。
有 364 个软件包没有被完全安装或卸载。
需要下载 265 MB/266 MB 的归档。
解压缩后会消耗 419 MB 的额外空间。
获取:1 http://archive.build.openkylin.top/openkylin yangtze/main riscv64 java-common all 0.72-ok2 [5,932 B]
获取:2 http://archive.build.openkylin.top/openkylin yangtze-proposed/main riscv64 openjdk-19-jre-headless riscv64 19+36-ok1 [48.0 MB]
获取:3 http://archive.build.openkylin.top/openkylin yangtze-proposed/main riscv64 ca-certificates-java all 20190909-ok6 [10.1 kB]                                                                                                 
获取:4 http://archive.build.openkylin.top/openkylin yangtze-proposed/main riscv64 openjdk-19-jre riscv64 19+36-ok1 [160 kB]                                                                                                       
获取:5 http://archive.build.openkylin.top/openkylin yangtze-proposed/main riscv64 openjdk-19-jdk-headless riscv64 19+36-ok1 [217 MB]                                                                                              
获取:6 http://archive.build.openkylin.top/openkylin yangtze-proposed/main riscv64 openjdk-19-jdk riscv64 19+36-ok1 [10.4 kB]                                                                                                      
已下载 265 MB，耗时 3分 29秒 (1,270 kB/s)                                                                                                                                                                                   
dpkg: 警告: 无法找到软件包 libfprint0:riscv64 的文件列表，现假定目前该软件包没有任何文件被安装在系统里。
(正在读取数据库 ... 系统当前共安装有 201900 个文件和目录。)
准备解压 .../0-akonadi-contacts-data_4%3a22.12.3-ok1_all.deb  ...
正在解压 akonadi-contacts-data (4:22.12.3-ok1) ...
dpkg: 处理归档 /tmp/apt-dpkg-install-ladVDg/0-akonadi-contacts-data_4%3a22.12.3-ok1_all.deb (--unpack)时出错：
 正试图覆盖 /usr/share/akonadi/plugins/serializer/akonadi_serializer_addressee.desktop，它同时被包含于软件包 libkf5akonadicontact-data 4:19.12.3-0ubuntu1
dpkg-deb: 错误: 粘贴 子进程被信号(断开的管道) 终止了
正在选中未选择的软件包 java-common。
准备解压 .../1-java-common_0.72-ok2_all.deb  ...
正在解压 java-common (0.72-ok2) ...
正在选中未选择的软件包 openjdk-19-jre-headless:riscv64。
准备解压 .../2-openjdk-19-jre-headless_19+36-ok1_riscv64.deb  ...
正在解压 openjdk-19-jre-headless:riscv64 (19+36-ok1) ...
正在选中未选择的软件包 ca-certificates-java。
准备解压 .../3-ca-certificates-java_20190909-ok6_all.deb  ...
正在解压 ca-certificates-java (20190909-ok6) ...
正在选中未选择的软件包 openjdk-19-jre:riscv64。
准备解压 .../4-openjdk-19-jre_19+36-ok1_riscv64.deb  ...
正在解压 openjdk-19-jre:riscv64 (19+36-ok1) ...
正在选中未选择的软件包 openjdk-19-jdk-headless:riscv64。
准备解压 .../5-openjdk-19-jdk-headless_19+36-ok1_riscv64.deb  ...
正在解压 openjdk-19-jdk-headless:riscv64 (19+36-ok1) ...
正在选中未选择的软件包 openjdk-19-jdk:riscv64。
准备解压 .../6-openjdk-19-jdk_19+36-ok1_riscv64.deb  ...
正在解压 openjdk-19-jdk:riscv64 (19+36-ok1) ...
在处理时有错误发生：
 /tmp/apt-dpkg-install-ladVDg/0-akonadi-contacts-data_4%3a22.12.3-ok1_all.deb
E: Sub-process /usr/bin/dpkg returned an error code (1)
root@openkylin:/etc/apt# java -version
bash: java：未找到命令

'''

0-akonadi-contacts-data_4%3a22.12.3-ok1_all.deb 存在依赖问题 无法完成测试 测试失败


### 结果

失败





