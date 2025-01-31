# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

import csv
from datetime import datetime

import matplotlib.pyplot as plt

filename = 'data/sitka_weather_2018_simple.csv'
with open(filename) as f:
    reader = csv.reader(f)
    header_row = next(reader)

    # 从文件中读取最高温度
    highs = []
    dates = []
    for row in reader:
        current_date = datetime.strptime(row[2], '%Y-%m-%d')
        high = int(row[5])
        dates.append(current_date)
        highs.append(high)

# 根据最高温度绘制图形
plt.rcParams['font.sans-serif'] = ['SimHei']
plt.style.use('seaborn-v0_8')
fig, ax = plt.subplots()
ax.plot(dates, highs, c='#e30039')

# 设置图形的格式
ax.set_title("2018 Temperature", fontsize=24)
ax.set_xlabel('', fontsize=16)
fig.autofmt_xdate()
ax.set_ylabel('Temperature(F)', fontsize=16)
ax.tick_params(axis='both', which='major', labelsize=16)

plt.show()

    # print(highs)

    # for index, column_header in enumerate(header_row):
    #     print(index, column_header)