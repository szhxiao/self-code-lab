# 第 11 章 认识与学习 bash

## 11.1 认识 bash 这个 shell

### 11.1.1 硬件、内核与 shell

![硬件、内核与用户的相关性](../resources/images/硬件内核与用户的相关性.png)

必须通过**Shell**将输入的命令与内核通信，让内核可以控制硬件正确工作。

### 11.1.2 为何要学命令行界面的 shell

-   命令行界面的 shell: 大家都一样
-   远程管理：命令行界面就是比较快
-   Linux 的任督二脉：shell 是也

### 11.1.3 系统的合法 shell 与/etc/shells 功能

1. 查看可以使用的 shell

    > cat /etc/shells

2. 查看默认取得的 shell

    > cat /etc/passwd

### 11.1.4 bash shell 的功能

-   命令记忆功能(history)
-   命令与文件补全功能([Tab])
-   命令别名设置功能(alias)
-   作业控制、前台、后台控制
-   程序脚本(shell script)
-   通配符

### 11.1.5 bash shell 的内置命令: type

1. 查看命令为内置或外部

    > type [-tpa] name

### 11.1.6 命令的执行
