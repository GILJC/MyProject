# 8-1 표준 입출력

print("Python", "Java", "JavaScript", sep=" vs ")  # -> sep는 print() 사이의 콤마( , )가 어떻게 표현될지 정하는 것
# -> Python vs Java vs JavaScript

print("Python", "Java", sep=",", end="?")
print("무업이 더 재밌을까요?")
# -> Python,Java?무업이 더 재밌을까요?


import sys

print("Python", "Java", file=sys.stdout)  # -> 이건 그냥 표준 출력
# Python Java
print("Python", "Java", file=sys.stderr)  # -> 표준 에러. 로그파일에 표준 에러 기록.
# Python Java
# 두 출력문은 같지만 log가 다름.


# 시험 성적
scores = {"수학":0, "영어":50, "코딩":100}  # -> 일반 출력
for sub, sc in scores.items():  # -> sub, sc는 받기위해 새로 만든 변수 -> 바꿔도 상관 없다
    print(sub, sc)
#수학 0
#영어 50
#코딩 100

scores = {"수학":0, "영어":50, "코딩":100}
for subject, score in scores.items():
    print(subject.ljust(8), str(score).rjust(4), sep=":")  # -> sep=":" -> print안의 콤마 구분(',')을 :로 표시
                  # -> .ljust : 왼쪽 정렬, 오른쪽에(자신포함)8칸 여백
                  # -> .rjust : 우측 정렬, (4) : 왼쪽에 (자신포함) 4칸 여백.

#수학      :   0
#영어      :  50        -> 위에것보다 훨씬 보기 좋게 됨
#코딩      : 100                  


# 은행 대기순번표
# 001, 002, 003, ...
for num in range(1,21):
    print("대기번호 : " + str(num).zfill(3))  # -> zfill(3) -> 001, 002, 003식으로..

"""[print 값]
대기번호 : 001
대기번호 : 002
대기번호 : 003
대기번호 : 004
대기번호 : 005
대기번호 : 006
대기번호 : 007
대기번호 : 008
대기번호 : 009
대기번호 : 010
대기번호 : 011
대기번호 : 012
대기번호 : 013
대기번호 : 014
대기번호 : 015
대기번호 : 016
대기번호 : 017
대기번호 : 018
대기번호 : 019
대기번호 : 020
"""

for num in range(1,5):
    print("대기번호 : " + str(num).zfill(4))  # -> zfill(3) -> 0001, 0002, 0003...


for num in range(1,5):
    print("대기번호 : " + str(num).zfill(-1))  # 0, -1 등 다 1, 2, 3, 4 식으로 출력됨




answer = input("아무 값이나 입력하세요 : ")
print("입력하신 값은 " + answer + "입니다.")
print(type(answer))

