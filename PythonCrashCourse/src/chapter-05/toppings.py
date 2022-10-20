# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

# requested_topping = 'mushrooms'
#
# if requested_topping != 'anchoview':
#     print("Hold the anchovies!")

requested_toppings = ['mushrooms', 'green peppers', 'extra cheese']

for requested_topping in requested_toppings:
    # print(f"Adding {requested_topping}.")
    if requested_topping == 'green peppers':
        print("Sorry, we are out of green peppers right now.")
    else:
        print(f"Adding {requested_topping}.")


print("\nFinished making your pizza!")