# openkylin lua测试



## 测试环境



硬件环境：Visionfive v1 开发板

系统：openkylin RISC-V 0.9

软件：lua5.2

时间：2023.1.4





### 手动功能性测试

使用manuals下的测试用例

hello.lua
```
root@openkylin:/home/openkylin/lua# lua hello.lua
Hello, RISC-V!
```

mergesort.lua
```
root@openkylin:/home/openkylin/lua# lua mergesort.lua
Original:
11 45 14 19 19 8 10 
Sorted:
8 10 11 14 19 19 45 
```

mergesort.lua
```
root@openkylin:/home/openkylin/lua# lua mergesort.lua
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199
```


### 结果

成功