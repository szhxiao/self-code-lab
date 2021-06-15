#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Shows "hello" from  $1... by using case .... esac

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

read -p "Please input your choice: " choice
case $choice in
    "hello")
        echo "Hello, how are you?"
    ;;
    "")
        echo "You MUST input parameters, ex> {$0 someword}"
    ;;
    *)
        echo "Usage $0 {hello}"
    ;;
esac
