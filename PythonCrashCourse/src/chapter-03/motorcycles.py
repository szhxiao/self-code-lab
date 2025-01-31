# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

motorcycles = ['honda', 'yamaha', 'suzuki']
print(motorcycles)

# 修改列表元素
# motorcycles[0] = 'ducati'
# print(motorcycles)

# 将元素添加至列表尾部
# motorcycles.append('ducati')
# print(motorcycles)

# 将元素插入至列表任意位置
# motorcycles.insert(1, 'ducati')
# print(motorcycles)

# del删除元素
# del motorcycles[0]
# print(motorcycles)

# pop()弹出列表尾部元素
# poped_motorcycle = motorcycles.pop();
# print(motorcycles)
# print(poped_motorcycle)

# pop()弹出任意位置元素
# first_owned = motorcycles.pop(1);
# print(motorcycles)
# print(first_owned)

# remove()根据元素值删除
too_expensive = 'honda'
motorcycles.remove(too_expensive)
print(motorcycles)