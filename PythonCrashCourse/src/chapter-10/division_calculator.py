# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784


# ZeroDivisionError: division by zero
# print(5/0)

# try:
#     print(5/0)
# except ZeroDivisionError:
#     print("You can't divide by zero")

print("Give me two numbers, and I will divide them")
print("Enter 'q' to quit")

while True:
    first_number = input("\nFirst number: ")
    if first_number == 'q':
        break
    second_number = input("\nSecond number: ")
    if second_number == 'q':
        break

    try:
        answer = int(first_number) / int(second_number)
    except ZeroDivisionError:
        print("You can't divide by 0!")
    else:
        print(answer)