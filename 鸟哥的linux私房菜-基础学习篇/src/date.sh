#!/bin/bash

# 鸟哥的Linux私房菜－基础学习篇
# 
# author: 鸟哥
# version: 3rd
# see: http://linux.vbird.org

# Input your demobilization date, then calculate 
# how many days before you demobilize.

PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~bin
export PATH

# 告知用户程序用途，告知用户日期输入格式
echo "This program will try to calculate: "
echo "How many days before your demobilization date..."
read -p "Please input your demobilization date (YYYYMMDD ex>20090401): " date2

# 利用正则表达式检查输入内容是否正确
date_d=$(echo $date2 |grep '[0-9]\{8\}')
if [ "$date_d" == "" ]; then
    echo "You input the wrong date format..."
    exit 1
fi

# 计算日期
declare -i date_dem=`date --date="$date2" +%s`     # 退伍日期秒数
declare -i date_now=`date +%s`                      # 现在日期秒数
declare -i date_total_s=$(($date_dem-$date_now))  # 剩余秒数计算
declare -i date_d=$(($date_total_s/60/60/24))     # 转为天数
if [ "$date_total_s" -lt "0" ];then
    echo "You had been demonbilization before: " $((-1*$date_d)) " ago"
else
    declare -i date_h=$(($(($date_total_s-$date_d*60*60*24))/60/60))
    echo "You will demobilize after $date_d days and $date_h hours."
fi