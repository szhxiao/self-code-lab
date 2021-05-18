#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Use for loop

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

for animal in dog cat elephant 
do
    echo "There are ${animal}s..."
done

