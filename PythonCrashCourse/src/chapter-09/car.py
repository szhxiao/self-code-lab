# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

class Car:
    """
    一次模拟汽车的简单尝试
    """

    def __init__(self,make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.odometer_reading = 0

    def get_descriptive_name(self):
        long_name = f"{self.year} {self.make} {self.model}"
        return long_name.title()

    def read_odometer(self):
        print(f"This car has {self.odometer_reading} miles on it.")

    def update_odometer(self, mileage):
        # self.odometer_reading = mileage
        if mileage >= self.odometer_reading:
            self.odometer_reading = mileage
        else:
            print("You can't roll back an odometer")

    def increment_odometer(self, miles):
        self.odometer_reading += miles

# my_new_car = Car('audi', 'a4', 2019)
# print(my_new_car.get_descriptive_name())

# 直接修改属性值
# my_new_car.odometer_reading = 50
# print(my_new_car.read_odometer())

# 通过方法修改属性值
# my_new_car.update_odometer(23_500)
# my_new_car.read_odometer()

# 通过方法递增属性值
# my_new_car.increment_odometer(500)
# my_new_car.read_odometer()