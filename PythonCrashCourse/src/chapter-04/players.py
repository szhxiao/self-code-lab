# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

players = ['charles', 'martina', 'michael', 'florence', 'eli']
print(players[0:3])

print("Here are the first three players on my team: ")
for player in players[:3]:
    print(player.title())