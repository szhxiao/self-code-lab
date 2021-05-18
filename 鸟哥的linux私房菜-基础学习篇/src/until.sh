#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Repeats question until user input correct answer.

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

until [ "$yn" != "yes" -a "$yn" != "YES" ]; do
    read -p "Please input yes/YES to stop this program: " yn
done
echo "OK! you input the correct answer."
