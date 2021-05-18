#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org
 
# Creates three files, which named by user's input and date command

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

# 提示用户输入文件名，取得fileuser变量
echo -e "I will use 'touch' command to create 3 files."
read -p "Please input your filename: " fileuser

# 为了避免用户随意按[Enter]，利用变量功能分析文件名是否有设置
filename=${fileuser:-"filename"}

# 利用date命令取得所需要的文件名
date1=$(date --date='2 days ago' +%Y%m%d)
date2=$(date --date='1 days ago' +%Y%m%d)
date3=$(date +%Y%m%d)

# 配置文件名
file1=${filename}${date1}
file2=${filename}${date2}
file3=${filename}${date3}

# 创建文件名
touch "$file1"
touch "$file2"
touch "$file3"

exit 0