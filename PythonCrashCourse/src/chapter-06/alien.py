# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

alien_0 = {'color': 'green', 'point': 5}

print(alien_0['color'])
print(alien_0['point'])

new_points = alien_0['point']
print(f"You just earned {new_points} points!")

alien_0['x_position'] = 0
alien_0['y_position'] = 25
print(alien_0)

alien_0['color'] = 'yellow'
print(f"The alien is now {alien_0['color']}.")

del alien_0['point']
print(alien_0)