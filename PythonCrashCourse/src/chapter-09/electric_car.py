# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

class Car:
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

class Battery:
    """
    一次模拟电动汽车电瓶的简单尝试
    """

    def __init__(self, battery_size=100):
        self.battery_size = battery_size

    def describe_battery(self):
        print(f"This car has a {self.battery_size}-kWh battery.")

    def get_range(self):
        if self.battery_size == 75:
            range = 260
        elif self.battery_size == 100:
            range = 315

        print(f"This car can go about {range} miles on a full charge.")

class ElectricCar(Car):
    """
    模拟电动汽车
    """

    def __init__(self, make, model, year):
        super().__init__(make, model, year)
        # self.battery_size = 110
        self.battery = Battery()

    def describe_battery(self):
        print(f"This car has a {self.battery_size}-kWh battery.")

# my_byd = ElectricCar('byd', 'song', 2021)
# print(my_byd.get_descriptive_name())
# my_byd.describe_battery()
# my_byd.battery.describe_battery()
# my_byd.battery.get_range()