# openkylin dbus测试



## 测试环境



硬件环境：Visionfive v1 开发板

系统：openkylin RISC-V 0.7.5



查看程序状态



```
root@openkylin:~# dbus-test-tool echo --system
:1.104


```



查看当前调用情况（如无法被桌面调用成功即测试失败）





```
root@openkylin:~# dbus-send --system --print-reply --dest=org.freedesktop.DBus /org/freedesktop/DBus org.freedesktop.DBus.ListActivatableNames
method return time=1666502443.970827 sender=org.freedesktop.DBus -> destination=:1.101 serial=3 reply_serial=2
   array [
      string "org.freedesktop.DBus"
      string "org.freedesktop.GeoClue2"
      string "org.freedesktop.login1"
      string "com.ubuntu.LanguageSelector"
      string "org.freedesktop.ColorManager"
      string "org.freedesktop.systemd1"
      string "com.kylin.CGroup"
      string "org.freedesktop.Avahi"
      string "org.freedesktop.PolicyKit1"
      string "org.debian.apt"
      string "org.freedesktop.ModemManager1"
      string "io.netplan.Netplan"
      string "org.bluez"
      string "org.freedesktop.hostname1"
      string "org.freedesktop.nm_priv_helper"
      string "com.ukui.search.qt.systemdbus"
      string "org.freedesktop.PackageKit"
      string "org.freedesktop.UPower"
      string "com.bluetooth.systemdbus"
      string "org.freedesktop.UDisks2"
      string "com.settings.daemon.qt.systemdbus"
      string "org.freedesktop.network1"
      string "com.kylin.assistant.systemdaemon"
      string "com.kylinusbcreator.systemdbus"
      string "org.kubuntu.qaptworker3"
      string "org.ukui.samba.share.config"
      string "com.control.center.qt.systemdbus"
      string "org.freedesktop.bolt"
      string "org.freedesktop.resolve1"
      string "org.freedesktop.Accounts"
      string "fi.w1.wpa_supplicant1"
      string "org.freedesktop.RealtimeKit1"
      string "org.freedesktop.timedate1"
      string "org.ukui.powermanagement"
      string "org.freedesktop.locale1"
      string "org.ukui.libinput.proxy"
      string "org.freedesktop.nm_dispatcher"
   ]
```

