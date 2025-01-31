# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

# def get_formatted_name(first_name, last_name):
#     full_name=f"{first_name} {last_name}"
#     return full_name.title()
#
# musician = get_formatted_name('jimi', 'hendrix')
# print(musician)

# 添加可选参数
def get_formatted_name(first_name, last_name, middle_name=''):
    if middle_name:
        full_name=f"{first_name} {middle_name} {last_name}"
    else:
        full_name=f"{first_name} {last_name}"
    return full_name.title()

musician = get_formatted_name('jimi', 'hendrix')
print(musician)

musician = get_formatted_name('john', 'hooker', 'lee')
print(musician)