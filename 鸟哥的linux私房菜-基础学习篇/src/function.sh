#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Uses function to repeat information.

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

function printit() {
    echo -n "Your choice is "
}

echo "This program will print your selection!"
read -p "Please input your choice: " choice

case $choice in
    "one")
        printit; echo $choice | tr 'a-z' 'A-Z'
        ;;
    "two")
        printit; echo $choice | tr 'a-z' 'A-Z'
        ;;
    "three")
        rpintit; echo $choice | tr 'a-z' 'A-Z'
        ;;
    *)
        echo "You must input someword"
        ;;

esac
