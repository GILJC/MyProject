"""
Quiz) 당신의 학교에서는 파이썬 코딩 대회를 주최합니다.
참석률을 높이기 위해 댓글 이벤트를 진행하기로 하였습니다.
댓글 작성자들 중에 추첨을 통해 1명은 치킨, 3명은 커피 쿠폰을 받게 됩니다.
추천 프로그램을 작성하시오.

조건1 : 편의상 댓글은 20명이 작성하였고 아이디는 1~20 이라고 가정
조건2 : 댓글 내용과 상관 없이 무작위로 추첨하되 중복 불가
조건3 : random 모듈의 shuffle 과 sample 을 활용

(출력 예제)
 -- 당첨자 발표 --
 치킨 당첨자 : 1
 커피 당첨자 : [2, 3, 4]
 -- 축하합니다 --

(활용 예제)
from random import *
1st = [1, 2, 3, 4 ,5]
print(1st)
shuffle(1st)  # -> shuffle (1st) 안의 내용물의 순서를 무작위로 바꿈
print(1st)
print(sample(1st, 1))  # -> (1st) 안에서 (, 1) 개만큼 무작위로 뽑는다.

"""
from random import *

std = {i+1 for i in range(20)}  # -> 리스트 [ ] 로 하면 .remove 못써서 set으로 함.
print(std)  # { 1 ~ 20 }

gifted = []
tmp = []
for i in range(5):
  tmp = sample(std, 1)
  gifted.append(tmp[0])
  print(gifted)

  std.remove(tmp[0])
  print(std)

shuffle(gifted)
print(gifted)

print("""-- 당첨자 발표 --
치킨 당첨자 : {0}
커피 당첨자 : [{1}, {2}, {3}]
-- 축하 합니다 --
""".format(gifted[0], gifted[1], gifted[2], gifted[3]))
# format(gifted[i] for i in range(5))  -> 실패 Error




### 여기서부턴 나도코딩 풀이 ###

# from random import *
users = range(1, 21)  # 1부터 20까지 숫자를 생성
#print(type(users))  # -> <class 'range'>
users = list(users)
#print(type(users))  # -> <class 'list'>

print(users)
shuffle(users)
print(users)

winners = sample(users, 4)

print(" -- 당첨자 발표 -- ")
print("치킨 당첨자 : {0}".format(winners[0]))
print("커피 당첨자 : {0}".format(winners[1:]))
print(" -- 축하합니다 -- ")

