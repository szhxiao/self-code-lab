#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Checks $1 is equal to "hello"

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

if [ "$1" == "hello" ]; then
    echo "Hello, how are you?"
elif [ "$1" == "" ]; then
    echo "You MUST input parameters, ex> {$0 someword}"
else
    echo "The only parameter is 'hello', ex> {$0 hello}"
fi
