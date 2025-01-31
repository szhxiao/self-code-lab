# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

import matplotlib.pyplot as plt
import numpy as np

# 创建数据
# 生成0到10之间的100个点
x = np.linspace(0, 10, 100)
# y = np.sin(x)

# 画图
plt.plot(x, np.sin(x), 'red', label='sin(x)')
plt.plot(x, np.cos(x), 'blue', label='cos(x)')
# plt.plot(x, np.tan(x), 'g--', label='tan(x)')
plt.title('Trigonometric(x)')
plt.show()



