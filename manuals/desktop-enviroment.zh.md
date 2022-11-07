# 如何测试桌面环境

## 启动桌面环境

记录内容：

- 显示协议：X11, Wayland

- 显示管理器：startx, xdm, gdm, sddm, lightdm...

## 桌面

Panel/Taskbar/Dock 是否正常？鼠标点击是否正常？副键菜单显示是否正常？

- 打开设置页面
- 打开文件管理器
- 打开终端

## 窗口

- 放大、缩小、移动窗口。

- 打开 `glxgears`，打开终端，将终端部分层叠于`glxgears`上

透明度（如有）：观察圆角边框、半透明终端是否显示正常。

## 应用

### 浏览器

- firefox
- chrome

打开 Google，搜索 RISC-V

### 输入法

- fcitx5
- ibus

在文本编辑器中输入中文“你好，世界！”

### 多媒体

- mpv
- vlc

播放一段 1080P 的 H264 本地影片（软解/硬解）

### 办公

- libreoffice
