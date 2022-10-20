# Python Crash Course
# A Hands-On, Project-Based Introduction to Programming
#
# version: 2nd
# author: Eric Matthes
# http://ituring.cn/book/2784

favorite_languages = {
    'jen': 'java',
    'sarah': 'c',
    'edward': 'ruby',
    'phil': 'python',
    'tom': 'c'
}

language = favorite_languages['jen'].title()
print(f"Jen's favorite language is {language}")

for name in favorite_languages.keys():
    print(name.title())

for name in sorted(favorite_languages.keys()):
    print(f"{name.title()}, thank you for taking the poll.")

for language in favorite_languages.values():
    print(language.title())

for language in set(favorite_languages.values()):
    print(language.title())