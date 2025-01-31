# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

# squares = []
# for value in range(1, 11):
    # square = value ** 2
    # squares.append(square)
    # squares.append(value**2)

squares = [value**2 for value in range(1, 11)]

print(squares)
print(min(squares))
print(max(squares))
print(sum(squares))