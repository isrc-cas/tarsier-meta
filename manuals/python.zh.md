

# 如何测试python

## 安装



## 测试





python3 -m test -uall,-gui,-audio,-largefile --list-tests > tests.txt

python3 -m test --matchfile tests.txt | tee py_testlog.txt
