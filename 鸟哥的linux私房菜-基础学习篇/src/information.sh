#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Check system account's information.

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

users=$(cut -d ':' -f1 /etc/passwd)

for username in $users
do
    id $username
    finger $username
done

