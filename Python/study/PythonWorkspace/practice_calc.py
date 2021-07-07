print(1+2) # 3
print(3-2) # 1
print(3--2) # 5
print(3---2) # 1
print(3----2) # 5
print(5*2) # 10
print(6/3) # 2.0

number = 2 + 3 + 4 # 14
print(number)

number += 2 # 18
print(number)

print(2**3) # 2^3 = 8
print(5%3) # 나머지 구하기 2
print(10%3) # 1
print(5//3) # 1 몫 구하기. // 2개는 몫 구하기
print(10//3) # 3

# +++++++는 여러개 써도 +. 한계점은 모름. -는 홀수개면 마이너스(-), 짝수개면 플러스(+)
# 나누기 '/' 는 2개까지 써도 됨. 3개부터 에러.  곱하기(*)는 1개면 곱셈, 2개면 제곱, 3개부터 에러

print(10 > 3) # True
print(4 >= 7) # False
print(10 < 3) # False
print(5 <= 5) # True

print(3 == 3) # True
print(4 == 2) # False
print(3 + 4 == 7) # True


# -5 의 절대값 = 5를 반환 함.
print(abs(-5))  # 5

# 4의 2승
print(pow(4, 2)) # 4^2 = 4*4 = 16

print(max(5, 12)) # 12
print(min(5, 12)) # 5

# 반올림
print(round(3.14)) # 3
print(round(4.99)) # 5


# math 라이브러리 사용

from math import *
print(floor(4.99)) # 내림. 4
print(ceil(3.14)) # 올림. 4   - 씰링
print(sqrt(16)) # 제곱근. 4.0
