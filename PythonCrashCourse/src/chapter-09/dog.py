# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def sit(self):
        print(f"{self.name} is now sitting")

    def roll_over(self):
        print(f"{self.name} rolled over")


my_dog = Dog('Willie', 6)
print(f"My dog's name is {my_dog.name}")
print(f"My dog's age is {my_dog.age}")
my_dog.sit()
my_dog.roll_over()

print()

your_dog = Dog('Lucy', 4)
print(f"My dog's name is {your_dog.name}")
print(f"My dog's age is {your_dog.age}")
your_dog.sit()
your_dog.roll_over()