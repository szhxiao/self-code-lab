# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

import matplotlib.pyplot as plt
plt.style.available

input_values = [1, 2, 3, 4, 5]
squares = [1, 4, 9, 16, 25]

plt.style.use('Solarize_Light2')
print(plt.style.available)
fig, ax = plt.subplots()
# ax.plot(squares)
ax.plot(input_values, squares, linewidth=3)

# 设置图表标题并给坐标轴加上标签
ax.set_title("squares", fontsize = 24)
ax.set_xlabel("value", fontsize = 14)
ax.set_ylabel("square", fontsize = 14)

# 设置刻度标记的大小
ax.tick_params(axis = 'both', labelsize = 14)

plt.show()