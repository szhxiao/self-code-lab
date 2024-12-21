# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

import matplotlib.pyplot as plt

plt.style.use('seaborn-v0_8')
fig, ax = plt.subplots()

# x_values = [1, 2, 3, 4, 5, 6]
# y_values = [1, 4, 9, 16, 25, 36]

x_values = range(1, 1000)
y_values = [x**2 for x in x_values]

# ax.scatter(2, 4, s = 200)

# 设置图像颜色
# ax.scatter(x_values, y_values,c = 'green',  s = 10)
ax.scatter(x_values, y_values,c = '#00a8e1',  s = 10)
# ax.scatter(x_values, y_values,c = y_values, cmap=plt.cm.Reds,  s = 10)

# 设置图表标题并给坐标轴加上标签
ax.set_title("value-square", fontsize = 24)
ax.set_xlabel("values", fontsize = 14)
ax.set_ylabel("squares", fontsize = 14)

# 设置刻度标记的大小
ax.tick_params(axis = 'both', which = 'major', labelsize = 14)

# 自动保存图片
plt.savefig('squares_plot.png', bbox_inches='tight')
plt.show()