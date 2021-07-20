# if

weather = input("오늘 날씨는 어때요? ")
if weather == "비" or weather == "눈":
    print("우산을 챙기세요")
elif weather == "미세먼지":
    print("마스크를 챙기세요")
else:
    print("준비물 필요 없어요")


temp = int(input("기온은 어때요? "))
if 30 <= temp:
    print("너무 더워요. 나가지 마세요")
elif 10 <= temp and temp < 30:
    print("괜찮은 날씨에요")
elif 0 <= temp < 10:
    print("외투를 챙기세요")
else:
    print("너무 추워요. 나가지 마세요")



# for
# print("대기번호 : 1")
# print("대기번호 : 2")
# print("대기번호 : 3")
# print("대기번호 : 4")

for waiting_no in [0, 1, 2, 3, 4]:    # [0, 1, 2, 3, 4]안의 숫자들이 차례로 waiting_no에 들어감
    print("대기번호 : {0}".format(waiting_no))  # waiting_no <- 0, 1, 2, 3, 4

# 대기번호 : 0
# 대기번호 : 1
# 대기번호 : 2
# 대기번호 : 3
# 대기번호 : 4

# from random import *
# print(randrange(1, 7))  # -> 1부터 7 전까지의 숫자중 하나 렌덤하게 뽑기
# print(list(range(1,7)))  # = [1, 2, 3, 4, 5, 6]
for waiting_no in range(5):  # 0, 1, 2, 3, 4
    print("대기번호 : {0}".format(waiting_no)) 

for waiting_no in range(1, 6):  # 1, 2, 3, 4, 5
    print("대기번호 : {0}".format(waiting_no)) 


starbucks = ["아이언맨", "토르", "그루트"]
for customer in starbucks:
    print("{0}, 커피가 준비되었습니다.".format(customer))
# = print("{}, 커피가 준비되었습니다.".format(customer))  -> 같음


# while
customer = "토르"
index = 5
while index >= 1:
    print("{0}, 커피가 준비 되었습니다. {1} 번 남았어요.".format(customer, index))
    index -= 1
    if index == 0:
        print("커피는 폐기처분되었습니다.")

"""
customer = "아이언맨"
index = 1
while True:
    print("{0}, 커피가 준비 되었습니다. 호출 {1} 회".format(customer, index))
    index += 1
# Ctrl + C 로 강제 종료(멈춤) 가능

"""

customer = "토르"
person = "Unknown"

while person != customer :
    print("{0}, 커피가 준비 되었습니다.".format(customer))
    person = input("이름이 어떻게 되세요? ")



# =============================

# continue 와 break

absent = [2, 5]  # 결석
no_book = [7]  # 책을 안가져옴
for student in range(1, 11):  # 1,2,3,4,5,6,7,8,9,10
    if student in absent:  # 이 학생(student)이 결석(absent)을 했다면 = studen가 absen에 포함된다면 => student == absent
        continue  # continue를 만나게 되면 밑에 있는 문장을 실행을 안하고, 다음 반복으로 이어서 하는 것. --> 2,5를 만나면 스킵하는 것. => 스킵하고 다음 조건으로 반복문 실행.
    elif student in no_book:
        print("오늘 수업 여기까지. {0}는 교무실로 따라와".format(student))
        break
    print("{0}, 책을 읽어봐".format(student))



### 한줄 for

# 출석번호가 1, 2, 3, 4, 앞에 100을 붙이기로 함 -> 101, 102, 103, 104.
students = [1,2,3,4,5]
print(students)  # [1, 2, 3, 4, 5]
students = [i+100 for i in students]
print(students)  # [101, 102, 103, 104, 105]



# 학생 이름을 길이로 변환
students = ["Iron man", "Thor", "I am groot"]
students = [len(i) for i in students]
print(students)  # [8, 4, 10]


# 학생 이름을 대문자로 변환
students = ["Iron man", "Thor", "I am groot"]
students = [i.upper() for i in students]
print(students)  # ['IRON MAN', 'THOR', 'I AM GROOT']

