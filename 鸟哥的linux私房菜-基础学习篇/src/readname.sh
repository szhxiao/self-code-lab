#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org
 
# User inputs his first name and last name. 
# Program shows his full name.

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

# 提示用户输入
read -p "Please input your first name: " firstname
read -p "Please input your last name: " lastname
echo -e "\nYour full name is: $firstname $lastname"

exit 0