# 第 26 章 Linux 内核编译与管理

## 26.1 编译前的任务：认识内核与取得内核源代码

### 26.1.1 什么是内核(Kernel)

1. kernel

2. 内核模块的用途

3. 内核编译

4. 关于驱动程序：厂商的责任还是内核的责任

### 26.1.2 更新内核的目的

### 26.1.3 内核的版本

### 26.1.4 内核源代码的取得方式

### 26.1.5 内核源代码的解压缩/安装/观察

1. 内核源代码的解压缩与放置目录

2. 内核源代码下的次目录

## 26.2 内核编译的前处理与内核功能选择

### 26.2.1 硬件环境查看与内核功能要求

### 26.2.2 保持干净源代码：make mrproper

### 26.2.3 开始挑选内核功能：make XXconfig

-   make menuconfig

### 26.2.4 内核功能细项选择

1. General setup
2. loadable medule + block layer
3. CPU 的类型与功能选择
4. 电源管理功能
5. 一些总线的选项
6. 编译成可执行文件的格式
7. 内核的网络功能
8. 各项设备的驱动程序
9. 文件系统的支持
10. Kernel hacking、信息安全、密码应用
11. 虚拟化与函数库

## 26.3 内核的编译与安装

### 26.3.1 编译内核与内核模块

### 26.3.2 实际安装模块

### 26.3.3 开始安装新内核与多重内核菜单(grub)

1. 移动内核到/boot 且保留旧内核文件
2. 新建相对应的 Initial Ram Disk
3. 编辑开机菜单(grub)

## 26.4 额外（单一）内核模块编译

### 26.4.1 编译前注意事项

### 26.4.2 单一模块编译

### 26.4.3 内核模块管理
