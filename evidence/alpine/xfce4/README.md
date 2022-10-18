# Alpine Xfce4测试

OS: alpine-minirootfs-20220715-riscv64    
VERSION: xfce 4.16  
TIME: 2022/10/18  

| 操作步骤                                 | 输入数据                     | 预期结果                      | 实际结果                      | 测试结果  | 附件                  |
| ---------------------------------------- | ---------------------------- | ----------------------------  | ----------------------------  | --------- | --------------------- |
| apk add xfce4                            | xfce4                        | 安装成功                      | 安装成功                      | 成功      | install.png           |
| startx -- /usr/bin/Xephyr :1             |                              | 正确打开                      | 正确打开                      | 成功      | desktop.png           |
| 打开文件管理器                           |                              | 正确打开                      | 正确打开                      | 成功      | file.png              |
| 创建文件夹                               |                              | 正确创建                      | 正确创建                      | 成功      | create_folder.png     |
| 删除文件夹                               |                              | 正确删除                      | 正确删除                      | 成功      | delete_folder.png     |
| 重命名文件夹                             |                              | 正确重命名                    | 正确重命名                    | 成功      | rename_folder.png     |
| 创建文件                                 |                              | 正确创建                      | 正确创建                      | 成功      | create_txt.png        |
| 删除文件                                 |                              | 正确删除                      | 正确删除                      | 成功      | delete_txt.png        |
| 重命名文件                               |                              | 正确重命名                    | 正确重命名                    | 成功      | rename_txt.png        |
| 移动窗口                                 |                              | 正确移动                      | 正确移动                      | 成功      | window_drag.png       |
| 放大窗口                                 |                              | 正确放大                      | 正确放大                      | 成功      | window_add.png        |
| 缩小窗口                                 |                              | 正确缩小                      | 正确缩小                      | 成功      | window_sub.png        |
| 窗口全屏                                 |                              | 正确全屏                      | 正确全屏                      | 成功      | window_full.png       |
| 窗口最小化                               |                              | 正确最小化                    | 正确最小化                    | 成功      | window_min.png        |
| 切换工作区                               |                              | 正确切换                      | 正确切换                      | 成功      | switch_workspaces.png |
| 在不同工作区分别打开不同的窗口           |                              | 成功                          | 成功                          | 成功      | workspaces_open.png   |
| 查看系统信息                             |                              | 查看成功                      | 查看成功                      | 成功      | system_info.png       |
| 查看Xfce4的信息                          |                              | 查看成功                      | 查看成功                      | 成功      | xfce4_info.png        |
| 打开display                              |                              | 打开成功                      | 打开成功                      | 成功      | display.png           |
| 调整分辨率                               |                              | 调整成功                      | 调整成功                      | 成功      | resolution.png        |
| 调整缩放                                 |                              | 调整成功                      | 无变化 (重新登录和当时)       | **失败**  | scale.png             |
| 更换壁纸                                 |                              | 更换成功                      | 更换成功                      | 成功      | wall.png              |
| 打开设置                                 |                              | 打开成功                      | 打开成功                      | 成功      | settings.png          |

## 结果

除部分功能外，基本功能正常
