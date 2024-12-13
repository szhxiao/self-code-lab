# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

import pygame
from pygame.sprite import Sprite

# 表示单个外星人的类
class Alien(Sprite):

    # 初始化外星人并设置其起始位置
    def __init__(self, ai_game):
        super().__init__()
        self.screen = ai_game.screen
        self.settings = ai_game.settings

        # 加载外星人图像并设置rect属性
        self.image = pygame.image.load('images/alien.bmp')
        self.rect = self.image.get_rect()

        # 每个外星人初始位置都在屏幕左上角
        self.rect.x = self.rect.width
        self.rect.y = self.rect.height

        # 存储外星人的水平精确位置
        self.x = float(self.rect.x)

    # 移动外星人
    def update(self):
        self.x += self.settings.alien_speed * self.settings.fleet_direction
        self.rect.x = self.x

    # 如果外星人位于屏幕边缘，就返回True
    def check_edges(self):
        screen_rect = self.screen.get_rect()
        if self.rect.right >= screen_rect.right or self.rect.left <= 0:
            return True