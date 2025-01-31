# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

filename = 'pi_digits.txt'

with open(filename) as file_object:
    # for line in file_object:
        # print(line)
        # print(line.rstrip())

    lines = file_object.readlines()

for line in lines:
    print(line.rstrip())