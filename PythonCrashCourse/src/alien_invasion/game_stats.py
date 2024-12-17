# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

# 跟踪游戏统计信息
class GameStats:
    # 初始化统计信息
    def __init__(self, ai_game):
        self.settings = ai_game.settings
        self.reset_stats()

        self.game_active = False
        self.high_score = 0
        self.level = 1

    # 初始化在游戏运行期间可能变化的统计信息
    def reset_stats(self):
        self.ships_left = self.settings.ship_limit
        self.score = 0


