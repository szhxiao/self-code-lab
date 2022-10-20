# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

favorite_languages = {
    'jen': ['python', 'java'],
    'sarah': ['c', 'java'],
    'edward': ['ruby', 'go'],
    'phil': ['python', 'ruby']
}

for name, languages in favorite_languages.items():
    print(f"\n{name.title()}'s favorite languages are:")
    for language in languages:
        print(f"\t{language.title()}")