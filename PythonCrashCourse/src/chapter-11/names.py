# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

from name_function import get_formattted_name

print("Enter 'q' at any time to quit")

while True:
    first = input("\nPlease give me a first name: ")
    if first == 'q':
        break
    last = input("Please give me a last name: ")
    if last == 'q':
        break

    formatted_name = get_formattted_name(first, last)
    print(f"\tNeatly formatted name: {formatted_name}.")