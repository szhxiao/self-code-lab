# 第 7 章 用户输入和 while 循环

## 7.1 函数 input()的工作原理

函数`input()`让程序暂停运行，等待用户输入一些文本。

### 7.1.1 编写清晰的程序

```python
prompt = "If you tell us who you are, we can personalize the messages you see."
prompt += "\nWhat is your first name? "

name = input(prompt)
print(f"\nHello, {name}")
```

### 7.1.2 使用 input()来获取数值输入

使用`int()`方法将输入转换为数值。

```python
height = input("How tall are you, in inches? ")
height = int(height)

if height > 48:
    print("\nYou're tall enough to ride!")
else:
    print("\nYou'll be able to ride when you're ")
```

### 7.1.3 求模运算符

```python
number = input("Enter a number, and I'll tell you if it's even or odd: ")
number = int(number)

if number % 2 == 0:
    print(f"\nThe number {number} is even.")
else:
    print(f"\nThe number {number} is odd.")
```

## 7.2 while 循环简介

### 7.2.1 使用 while 循环

while 循环不断运行，直到指定的条件不满足为止。

### 7.2.2 让用户选择何时退出

```python
prompt = "\nTell me something, and I will repeat it back to you: "
prompt += "\nEnter 'quit' to end the program."
message = ""
while message != 'quit':
    message = input(prompt)

    if message != 'quit':
        print(message)
```

### 7.2.3 使用标志

定义一个变量，用于判断整个程序是否处于活动状态，该变量称为标志。

```python
active = True
while active:
    message = input(prompt)

    if message == 'quit':
        active = False
    else:
        print(message)
```

### 7.2.4 使用 break 退出循环

要立即退出 while 循环，不再运行循环中余下的代码，也不管条件测试的结果如何，可使用 break 语句。

```python
prompt = "\nPlease enter the name of a city you have visited: "
prompt += "\n(Enter 'quit' when you are finished.)"

while True:
    city = input(prompt)

    if city == 'quit':
        break
    else:
        print(f"I'd love to go to {city.title()}")
```

### 7.2.5 在循环中使用 continue

```python
current_number = 0
while current_number < 10:
    current_number += 1
    if current_number % 2 == 0:
        continue

    print(current_number)
```

### 7.2.6 避免无限循环

要避免编写无限循环，务必对每个 while 循环进行测试，确保其这按预期那样结束。

## 7.3 使用 while 循环处理列表和字典

通过将 while 循环同列表和字典结合起来使用，可收集、存储并组织大量输入，供以后查看和显示。

### 7.3.1 在列表之间移动元素

```python
unconfirmed_users = ['alice', 'brian', 'candace']
confirmed_users = []

while unconfirmed_users:
    current_user = unconfirmed_users.pop()

    print(f"Verifying user: {current_user.title()}")
    confirmed_users.append(current_user)

print("\nThe following users have been confirmed:")
for confirmed_user in confirmed_users:
    print(confirmed_user.title())
```

### 7.3.2 删除为特定值的所有列表元素

使用函数`remove()`来删除列表中的特定值。

```python
pets = ['dog', 'cat', 'dog', 'goldfish', 'cat', 'rabbit', 'cat']
print(pets)

while 'cat' in pets:
    pets.remove('cat')

print(pets)
```

### 7.3.3 使用用户输入来填充字典

```python
responses = {}

# 设置标志，指出调查是否继续
polling_active = True

while polling_active:
    name = input("\nWhat is your name? ")
    response = input("Which mountain would you like to climb someday? ")

    responses[name] = response

    repeat = input("Would you like to let another person respond? (yes/no) ")
    if repeat == 'no':
        polling_active = False

# 显示调查结果
print("\n--- Poll Results ---")
for name, response in responses.items():
    print(f"{name} would like to climb {response}.")
```
