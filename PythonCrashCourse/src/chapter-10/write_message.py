# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

filename = 'programming.txt'

# with open(filename, 'w') as file_object:
#     file_object.write("I love programming.")
#     file_object.write("I love creating new games.")

with open(filename, 'a') as file_object:
    file_object.write("I also love finding meaning in large datasets")
    file_object.write("I love creating apps that can run in a browser.")