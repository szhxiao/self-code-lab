#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Inputs 2 integer numbers and an operator,then compute

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

echo -e "You SHOULD input 2 numbers and one operator, I will compute.\n"
read -p "first number: " firstnu
read -p "operations (+, -, *, /): " operator
read -p "second number: " secnu
total=$(($firstnu$operator$secnu))
echo -e "\nThe result of $firstnu $operator $secnu is ==> $total"

exit 0