# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

# message = input("Tell me something, and I will repeat it back to you:\n")
# print(message)

prompt = "\nTell me something, and I will repeat it back to you: "
prompt += "\nEnter 'quit' to end the program."
# message = ""
# while message != 'quit':
#     message = input(prompt)
#
#     if message != 'quit':
#         print(message)

active = True
while active:
    message = input(prompt)

    if message == 'quit':
        active = False
    else:
        print(message)