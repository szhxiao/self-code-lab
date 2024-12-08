# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

import json

filename = 'numbers.json'
with open(filename) as f:
    numbers = json.load(f)

print(numbers)

