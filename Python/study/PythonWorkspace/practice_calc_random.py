from random import *

print(random())  # 0.0 ~1.0 미만의 임의의 값 생성
print(random() * 10)  # 0.0 ~ 10.0 미만의 임의의 값 생성

# random()을 int로 감싸줘서, 정수만 뽑고싶을때 사용
print(int(random() * 10))  # 0 ~ 10 미만의 임의의 정수 생성

# 1부터 출력하고 싶을때
print(int(random() * 10) + 1)  # 1 ~ 10 이하의 임의의 정수 생성

# 로또 출력
print(int(random() * 45) + 1)  # 1 ~ 45 이하의 임의의 정수
print(int(random() * 45) + 1)  # 1 ~ 45 이하의 임의의 정수
print(int(random() * 45) + 1)  # 1 ~ 45 이하의 임의의 정수


# 위 난수 쉽게 출력 하는 방법 = randrange
print(randrange(1, 46))  # 1 ~ 46 미만의 임의의 값 생성
print(randrange(1, 46))  # 1 ~ 46 미만의 임의의 값 생성


# 이하, 미만 햇갈리면 randint
print(randint(1, 45))  # 1 ~ 45 이하의 임의의 값 생성
print(randint(1, 45))  # 1 ~ 45 이하의 임의의 값 생성

