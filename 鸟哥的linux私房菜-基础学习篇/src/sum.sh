#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Use loop to calculate "1+2+3+...+n"

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

sum=0;
i=0;

read -p "Please in put number: " n

while [ "$i" != "$n" ]; do
    i=$(($i+1))
    sum=$(($sum+$i))
done
echo "1+2+...+$n = $sum"
