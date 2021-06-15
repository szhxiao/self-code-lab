#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Inputs a filename, program will check the flowing:
# 1.) exitss? 2.) file/directory? 3.) file permissions

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

# 用户输入文件名，判断用户是否输入字符串
echo -e "Please input a filena,e, I will check the filename's type and permission.\n"
read -p "Input a filename: " filename
test -z $filename && echo "You MUST input a filename." && exit 0

# 判断文件是否存在，若不存在则显示信息并结束脚本
test ! -e $filename && echo "The filename '$filename' DO NOT exit" && exit 0

# 判断文件类型与属性
test -f $filename && filetype="regulare file"
test -d $filename && filetype="directory"
test -r $filename && perm="readable"
test -w $filename && perm="$perm writable"
test -x $filename && perm="$perm executable"

# 输出信息
echo "The filename: $filename is a $filetype"
echo "And the permissions are: $perm"

exit 0