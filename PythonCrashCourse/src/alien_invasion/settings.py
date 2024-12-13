# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

"""存储游戏中所有设置的类"""
class Settings:
    def __init__(self):
        # 初始化游戏设置

        self.screen_width = 1200
        self.screen_height = 800
        self.bg_color = (230, 230, 230)

        self.ship_speed = 1.5

        # 子弹设置
        self.bullet_speed = 1.5
        self.bullet_width = 3
        self.bullet_height = 15
        self.bullet_color = (60, 60, 60)
        self.bullets_allowed = 3

        # 外星人设置
        self.alien_speed = 1.0
        self.ship_limit = 3
        self.fleet_drop_speed = 10
        self.fleet_direction = 1
