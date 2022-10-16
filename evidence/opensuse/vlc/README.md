# OpenSUSE Python3测试

OS: openSUSE-Tumbleweed-RISC-V-XFCE.riscv64-rootfs.riscv64-2022.10.11  
VERSION: VLC 3.0.17.4  
TIME: 2022/10/16  

| 操作步骤                                 | 输入数据                       | 预期结果                      | 实际结果                      | 测试结果  | 附件              |
| --------------------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | -------- | ---------------- |
| zypper install vlc                      | vlc                          | 安装成功                      | 安装成功                      | 成功      | install.png      |
| vlc                                     |                              | 正确打开                      | 正确打开                      | 成功      | start.png        |
| 播放CompressedwithFlexClip.mp4           | CompressedwithFlexClip.mp4   | 正确播放                      | 播放失败                      | 失败      | mp4.png          |

CompressedwithFlexClip.mp4: https://wiki.wumoe.cn/images/d/d0/CompressedwithFlexClip.mp4

## 结果

基本功能无法使用
