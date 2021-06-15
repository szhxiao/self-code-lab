# 第 20 章 启动流程、模块管理与 Loader

## 20.1 Linux 的启动流程分析

### 20.1.1 启动流程一览

系统启动过程:

-   加载 BIOS 的硬件信息，进行自我测试，依据设置取得第一个可启动的设备；
-   读取执行第一个启动设备内 MBR 的 boot loader；
-   依据 boot Loader 的设置加载 Kernel，Kernel 开始检测硬件、加载驱动程序；
-   硬件驱动成功后，Kernel 主动调用 init 进程，init 取得 run-level 信息；
-   init 执行/etc/rc.d/rc.sysinit 文件来准备软件执行的操作环境；
-   init 执行 run-level 的各个服务启动；
-   init 执行/et/rc.d/rc.local 文件；
-   init 执行终端机模拟程序 mingetty 来启动 login 进程，等待用户登录。

### 20.1.2 BIOS, boot loader 与 Kernel 加载

1. BIOS 开机自我检测与 MBR

2. boot loader 的功能

    - 提供菜单
    - 加载内核文件
    - 转交其他 loader

3. 加载内核检测硬件与 initrd 的功能

### 20.1.3 第一个进程 init 及配置文件/etc/inittab 与 runlevel

1. run level: 执行等级

    |     |                         |                                          |
    | --- | ----------------------- | ---------------------------------------- |
    | 0   | half                    | 系统直接关机                             |
    | 1   | single user mode        | 单用户维护模式（系统出问题时的维护）     |
    | 2   | multi-user, without NFS | 无 NFS 服务                              |
    | 3   | full multi-user mode    | 完整含有网络功能的纯文本模式             |
    | 4   | unused                  | 系统保留功能                             |
    | 5   | X11                     | 与 run level 3 类似，但加载使用 X Window |
    | 6   | reboot                  | 重启                                     |

2. /etc/inittab 的内容与语法

    init 的处理流程：

    - 取得 run level 即默认执行等级
    - 使用/etc/rc.d/rc.syinit 进行系统初始化
    - 执行相关等级的服务配置
    - 设置[Ctrl] + [Alt] + [Del]组合键功能
    - 设置不断电系统的 pf, pr 机制
    - 启动 mingetty 的 6 个终端机（tty1 ~ tty6）
    - 最终以/etc/X11/perfdm-nodaemon 启动图形界面

### 20.1.4 init 处理系统初始化流程

### 20.1.5 启动系统服务与相关配置文件

### 20.1.6 用户自定义开机启动程序

### 20.1.7 根据/etc/inittab 的设置加载终端机或 X Window 界面

1. /etc/modprobe.conf

2. /etc/sysconfig/\*

    - authconfig 身份认证机制
    - clock 主机时区
    - i18n 语系使用
    - keyboard & mouse 键盘与鼠标形式
    - network 网络启动设置
    - network-scripts 设置网卡

### 20.1.9 run level 的切换

查询当前 run level:

> runlevel

切换：

> init number[0-6]

## 20.2 内核与内核模块

### 20.2.1 内核模块与依赖性

内核模块放置在/lib/modules/kernel 中，主要目录：

|         |                                    |                              |
| ------: | :--------------------------------- | :--------------------------- |
|    arch | 与硬件平台有关的选项               | 如 CPU 的等级等              |
|  crypto | 内核所支持的加密技术               | 如 md5                       |
| drivers | 硬件驱动程序                       | 如显卡、网卡、PCI 相关硬件等 |
|      fs | 内核所支持的文件系统               | 如 vfat, nfs 等              |
|     lib | 一些库函数                         |                              |
|     net | 网络相关各项协议数据，防火墙模块等 |                              |
|   sound | 与音效有关的各项模块               |                              |

### 20.2.2 内核模块的查看

1. 查看内核加载模块

    > lsmod

2. 查看单个模块信息

    > modinfo [-adln] [module_name|filename]

    参数：

    - -a 仅列出作者名
    - -d 仅列出模块说明
    - -l 仅列出授权
    - -n 仅列出模块的详细路径

### 20.2.3 内核模块的加载与删除

> modprobe [-lcfr] module_name

参数：

-   -c 列出当前系统所有模块
-   -l 列出当前在/lib/modules/kernel 中的所有模块完整文件名
-   -f 强制加载模块
-   -r 删除某个模块

### 20.2.4 内核模块的额外参数设置

> vim /etc/modprobe.conf

## 20.3 Boot Loader: Grub

### 20.3.1 boot loader 的两个 stage

1. 执行 boot loader 主程序

2. 主程序加载配置文件

### 20.3.2 grub 的配置文件/boot/grubmenu.lst 与菜单类型

1. grub 优点

    - 认识与支持较多的文件系统
    - 启动的时候，可以自行编辑与修改启动设置选项
    - 可以动态查找配置文件

2. /boot/grub/menu.lst 配置文件

3. 直接指定内核启动

4. 利用 chain loader 的方式转交控制权

### 20.3.3 initrd 的重要性与创建新 initrd 文件

需要 initrd 的时刻：

-   根目录所在磁盘为 SATA、USB 或 SCSI 等连接接口
-   根目录所在文件系统为 LVM、RAID 等特殊格式
-   根目录所在文件系统为非传统 Linux 认识的文件系统
-   其他必须要在内核加载时提供的模块

### 20.3.4 测试与安装 grub

### 20.3.5 启动前的额外功能修改

### 20.3.6 关于内核功能当中的 vga 设置

### 20.3.7 BIOS 无法读取大硬盘的问题

### 20.3.8 为某个菜单加上密码

## 20.4 启动过程的问题解决

### 20.4.1 忘记 root 密码的解决之道

-   重启系统
-   启动进入 grub 菜单，进入菜单上点`e`进入详细设置
-   进入单用户维护模式后，修改密码

### 20.4.2 init 配置文件错误

### 20.4.3 BIOS 磁盘对应的问题(device.map)

> grub-install --recheck /dev/hda1

### 20.4.4 因文件系统错误而无法启动

### 20.4.5 利用 chroot 切换到另一块硬盘工作
