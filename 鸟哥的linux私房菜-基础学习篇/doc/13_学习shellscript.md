# 第 13 章 学习 shell script

## 13.1 什么是 shell script

shell script 可以简单被看成批处理文件，也可以说是一种程序设计语言。

### 13.1.1 为什么学习 shell script

-   自动化管理的重要依据
-   追踪与管理系统的重要工作
-   简单入侵检测功能
-   连续命令单一化
-   简易的数据处理
-   跨平台支持与学习历程较短

### 13.1.2 第一个 script 的编写与执行

1. 直接命令执行：shell.sh 文件必须要具备可读与可执行权限

    - 绝对路径
    - 相对路径
    - 变量"PATH"

2. 编写第一个 script

    ```shell script
    #!/bin/bash
    # 声明script使用的shell名称
    # ----------------------
    # 主要环境变量声明
    PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
    export PATH
    # 程序主要部分
    echo -e "Hello World \a \n"
    # 程序执行结果
    exit 0
    ```

3. 编写 shell script 的良好习惯

    - 记录 script 的功能、版本信息、历史记录等重要信息
    - script 内较特殊的命令，使用**绝对路径**执行
    - script 执行时需要的环境变量预先声明、设置

## 13.2 简单的 shell script 练习

### 13.2.1 简单范例

1. 交互式脚本：变量内容由用户决定

2. 随日期变化：利用日期进行言论的创建

3. 数值运算：简单的加减乘除

### 13.2.2 script 的执行方式区别

1. 直接执行方式执行 script

2. 利用 source 来执行脚本：在父进程中执行

## 13.3 善用判断式

### 13.3.1 利用 test 命令的测试功能

### 13.3.2 利用判断符号[]

**Tips:**

-   中括号[]中的每个组件都需要有空格键来分隔
-   中括号内的变量最好都以双引号引起来
-   中括号内的常量最好都以单或双引号引起来

### 13.3.3 shell script 的默认变量

## 13.4 条件判断

### 13.4.1 利用 if-then

1. 单层条件判断式

    ```shell script
    if [条件判断式];then
    fi
    ```

2. 多重复杂条件判断式

    ```shell script
    if [条件判断式];then
    elif [条件判断式];then
    else
    fi
    ```

### 13.4.2 利用 case...esac 判断

```shell script
case $var in
    "var-content')
        statement
        ;;
    *)
        statement
        exit 1
        ;;
esac
```

### 13.4.3 利用 function 功能

```shell script
function fname() {
    statements
}
```

## 13.5 循环

### 13.5.1 不定循环

1. while do done

    ```shell script
    while [ condition ]
    do
        statements
    done
    ```

2. until do done

    ```shell script
    until [ condition ]
    do
        statements
    done
    ```

### 13.5.2 固定循环

```shell script
for var in con1 con2 con3...
do
    statements
done
```

### 13.5.3 for 数值处理

```shell script
for((初始值;限制值;执行步长))
do
    statements
done
```

## 13.6 shell script 的追踪与调试
