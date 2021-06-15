# 第 14 章 Linux 账号管理与 ACL 权限设置

## 14.1 Linux 的账号与用户组

### 14.1.1 用户标识符：UID 与 GID

### 14.1.2 用户账号

1. 登录处理

    - 先找寻/etc/passwd 里是否有用户输入的账号，如果没有则跳出，如果有则将该账号对应的 UID 与 GID 读出来，将主文件夹与 shell 设置也一并读出
    - 进入 etc/shadow 找出对应账号与 UID，核对输入的密码是否相符
    - 进入 shell 控管阶段

2. /etc/passwd 文件结构

    每一行使用`:`分隔开，共七个字段：

    - 账号名称
    - 密码
    - UID

        | id 范围     | 用户特性                                                        |
        | ----------- | --------------------------------------------------------------- |
        | 0           | 系统管理员                                                      |
        | 1 ~ 499     | 保留给系统使用的 id，除 0 之外，其他的 UID 权限与特性并没有不同 |
        | 500 ~ 65535 | 一般用户                                                        |

    - GID
    - 用户信息说明
    - 主文件夹
    - shell

3. /etc/shadow 文件结构

    - 账号名称
    - 密码
    - 最近更改密码的日期
    - 密码不可被更改的天数
    - 密码需要更新更改的天数
    - 密码需要更改期限前的警告天数
    - 密码过期后的账号宽限时间
    - 账号失效日期
    - 保留

### 14.1.3 有效与初始用户组：groups,newgrp

1. /etc/group 文件结构

    - 用户组名称
    - 用户组密码
    - GID
    - 此用户组支持的账号名称

2. 有效用户组与初始用户组

    - 有效与支持用户组的查看

        > groups

    - 有效用户组的切换

        > newgrp users

        注：要切换的用户组必须是已经有支持的用户组。

3. /etc/gshadow

    - 用户组名
    - 密码
    - 用户组管理员账号
    - 用户组的所属账号

## 14.2 账号管理

### 14.2.1 新增与删除用户

1. useradd

    > useradd [-u UID] [-g 初始用户组] [-G 次要用户组] [-mM] [-c 说明栏] [-d 主文件夹绝对路径] [-s shell] 用户账号名

    参数：

    - -u UID，指定特定的 UID 给账号
    - -g 初始用户组名
    - -G 次要用户组名
    - -M 强制！不创建用户主文件夹
    - -m 强制！要创建用户主文件夹
    - -c 账号说明内容
    - -d 指定某个目录成为主文件夹，不使用默认值，务必使用绝对路径
    - -r 创建系统账号
    - -s 指定 shell
    - -e 接"YYYY-MM-DD"格式日期，设置账号失效日期
    - -f 指定密码是否会失效

    创建账号时会更改的文件：

    - 用户账号与密码参数相关文件：/etc/passwd, /etc/shadow
    - 用户组相关文件：/etc/group, /etc/gshadow
    - 用户的主文件夹：/home/username

2. useradd 参数文件

    查询 useradd 的默认值：

    > useradd -D

    内容：

    - GROUP=xxx 新建账号的初始用户组使用的 GID
    - HOME=/home 用户主文件夹的基准目录
    - INACTIVE=-1 密码过期后是否会失效的设置值
    - EXPIRE= 账号失效日期
    - SHELL=/bin/bash 默认的 shell
    - SKEL=/etc/skel 用户主文件夹参考基准目录
    - CREATE_MAIL_SPOOL=yes 创建用户的 mailbox

3. passwd

    设置密码：

    > passwd [--stdin]

    > passwd [-l] [-u] [--stdin] [-S] [-n days] [-x days] [-w days] [-i date] user

    参数：

    - --stdin 密码输入
    - -l lock，密码失效
    - -u unlock，与 lock 相对
    - -S 列出密码相关参数
    - -n 不可修改密码天数
    - -x 多久必须更改密码
    - -w 密码过期前的警告天数
    - -i 密码失效日期

4. chage

    > chage [-ldEImMW] user

    参数：

    - -l 列出账号的详细密码参数
    - -d 修改最近一次更改密码日期，YYYY-MM-DD
    - -E 修改账号失效日，YYYY-MM-DD
    - -I 接天数，密码失效日期
    - -m 接天数，密码最短保留天数
    - -M 接天数，密码多久需要进行更改
    - -W 接天数，密码过期前警告日期

    强制用户一定要更改密码后才能使用系统资源：

    > chage -d 0 user

5. usermod

    > usermod [-cdegGlsuLU] username

    参数：

    - -c 账号说明
    - -d 账号主文件夹
    - -e YYYY-MM-DD 格式日期，账号失效日期
    - -f 天数，密码过期后账号宽限时间
    - -g 初始用户组
    - -G 次要用户组
    - -a 与-G 合用可增加将要用户组的支持
    - -l 修改账号名称
    - -u UID 数字
    - -L 暂时将用户密码冻结

6. userdel

    > userdel [-r] username

    参数：

    - -r 连同用户的主文件夹一起删除

### 14.2.2 用户功能

1. finger

    检查用户信息：

    > finger [-s] username

    参数：

    - -s 仅列出用户的账号、全名、终端机代号与登录时间等
    - -m 列出与后面接的账号相同者

2. chfn

    改变用户信息：

    > chfn [-foph] username

    参数：

    - -f 完全用户名
    - -o 办公室房间号
    - -p 办公室电话
    - -h 家庭电话

3. chsh

    > chsh [-ls]

    参数：

    - -l 列出当前系统可用的 shell
    - -s 设置修改自己的 shell

4. id

    查阅 id 信息：

    > id [username]

### 14.2.3 新增与删除用户组

1. groupadd

    > groupadd[-g gid] [-r] group_name

    参数：

    - -g 指定 GID
    - -r 新建系统用户组

2. groupmod

    修改 group 相关参数：

    > groupmod [-g gid] [-n group_name]

    参数：

    - -g 修改既有 GID
    - -n 修改既有用户组名

3. groupdel

    删除用户组：

    > groupdel group_name

4. gpasswd

    用户组管理员功能：

    > gpasswd [-A user1,...] [-M user3,...] group_name

    参数：

    - -A 将 group_name 的主控权交由后面的用户管理
    - -M 将某些账号加入这个用户组
    - -r 将 group_name 的密码删除
    - -R 让 group_name 的密码栏失效

#### 14.2.4 账号管理实例

## 14.3 主机的具体权限规划：ACL 的使用

### 14.3.1 什么是 ACL

ACL 即 Access Control List，主要目的是提供传统的 owner、group、others 的 read、write、execute 权限之外的具体权限设置。

ACL 主要针对的方面：

-   用户(user)：对用户进行权限设置
-   用户组(group)：对用户组权限进行设置
-   默认属性(mask)：在目录下新建文件/目录时设置新数据的默认权限

### 14.3.2 如何启动 ACL

### 14.3.3 ACL 的设置技巧

1. setfacl

    设置文件/目录的 ACL 规定：

    > setfacl [-bkRd] [{-m|-x} acl 参数] 目标文件

    参数：

    - -m 设置后续 ACL 参数给文件使用，不可与-x 合用
    - -x 删除后续的 ACL 参数，不可与-m 合用
    - -b 删除所有 ACL 参数
    - -k 删除默认的 ACL 参数
    - -R 递归设置 ACL，包括子目录
    - -d 设置默认的 ACL 参数，只对目录有效

2. getfacl

    读取文件/目录的 ACL 设置：

    > getfacl filename

## 14.4 用户身份切换

进行身份切换原因：

-   使用一般账号：系统平日操作的好习惯
-   用较低权限启动系统服务
-   软件本身限制

### 14.4.1 su

> su [-lm] [-c command] username

参数：

-   -   使用 login-shell 的变量文件读取方式登录系统
-   -l
-   -m 使用目前环境设置，不读取新用户的配置文件
-   -c 仅进行一次命令

### 14.4.2 sudo

> sudo [-b] [-u new_username]

参数：

-   -b 后续命令自行执行
-   -u 欲切换用户名

## 14.5 用户的特殊 shell 与 PAM 模块

### 14.5.1 特殊的 shell

### 14.5.2 PAM 模块简介

PAM 可以说是一套应用程序编程接口，它提供了一连串的验证机制，只要用户将验证阶段的需求告知 PAM 后，PAM 就能够回报用户验证的结果。

### 14.5.3 PAM 模块设置语法

### 14.5.4 常用模块简介

1. pam_securetty.so

    限制系统管理员只能从安全的终端机登录。

2. pam_lologin.so

    限制一般用户是否能够登录主机。

3. pam_selinux.so

4. pam_console.so

5. pam_loginuid.so

6. pam_env.so

    设置环境变量。

7. pam_UNIX.so

8. pam_cracklib.so

    检验密码强度。

9. pam_limits.so

### 14.5.5 其他相关文件

1. limits.conf

2. /var/log/secure

## 14.6 Linux 主机上的用户信息传递

### 14.6.1 查询用户

> w

> who

> last

> lastlog

### 14.6.2 用户对谈

> write username [终端接口]

> mesg username

> write username

### 14.6.3 用户邮件信箱

> mail username -s "message"

## 14.7 手动新增用户

### 14.7.1 检查工具

1. pwck

2. pwconv

3. pwunconv

### 14.7.2 特殊账号手工新建

### 14.7.3 批量新建账号模板

### 14.7.3 批量新建账号的范例
