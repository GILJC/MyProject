sentence = '나는 소년입니다'
print(sentence)
sentence2 = "Python은 쉬워요"
print(sentence2)
sentence3 = """
나는 소년이고,
파이썬은 쉬워요
"""
print(sentence3)  # 줄바꿈을 포함하여 4줄이 출력되는 것을 보실 수 있습니다.




jumin = "990120-1234567"  # 0번쨰부터 시작

print("성별 : " + jumin[7])  # 7번째 위치를 출력 = 1
print("연 : " + jumin[0:2])  # 0번째부터 2번째 직전까지.=99 즉, 0,1번째 있는 값만 가져옴
print("월 : " + jumin[2:4])  # =01
print("일 : " + jumin[4:6])  # =20

print("생년월일 : " + jumin[0:6])  # =990120
print("생년월일 : " + jumin[:6])  # 처음부터 6 직전까지 = 0~5
print("뒤 7자리 : " + jumin[7:14])  # =1234567
print("뒤 7자리 : " + jumin[7:])  # 7번째부터 끝까지
print("뒤 7자리 (뒤에부터) : " + jumin[-7:])  # 맨 뒤에서 7번째부터 끝까지 = 1234567



python = "Python is Amazing"
print(python.lower())  # 모두 소문자  # python is amazing
print(python.upper())  # 모두 대문자  # PYTHON IS AMAZING
print(python[0].isupper())  # 파이썬 변수의 첫번째 값이 대문자인가 확인 하는 것. = True
print(len(python))  # python 전체 문자열의 길이 = 17
print(python.replace("Python", "Java"))  # "Python"과 "Java" 문자 변경
# = "Java is Amazing"


index = python.index("n")  # 어떤 문자가 어디있는지 찾을 수 있음 = 0,1,2,3,4,5
print(index)  # =5
index = python.index("n", index + 1)  # 2번째 n 찾기
# 앞 문자text, 뒤 숫자 start위치 => index:5 에서 +1 한 스페이스바(), i 전 부터
print(index)  # = 15

print(python.find("n"))  # = 5
print(python.find("Java")) # = -1  -> 내가 찾는 값이 없을 경우 -1 반환
# print(python.index("Java")) # = Error -> index에서 값이 없으면 Error를 내버림

print("hi")  # 위의 주석처리한 index에서 에러가 나서 뒤의 이 글자가 출력이 안됨

print(python.count("n"))  # 원하는 string이 몇번 나왔는가 확인







# 문자열 포멧

# 방 법 1
print("나는 %d살입니다." % 20)
print("나는 %s을 좋아해요." % "파이썬")
print("Apple 은 %c로 시작해요." % "A")
#s
print("나는 %d살입니다." % 20)  # %s는 숫자 문자 다 쓸 수 있다
print("나는 %s색과 %s색을 좋아해요." % ("파란", "빨간"))

print("나는 %s색과 %s색을 %d만큼 좋아해요." %("파란", "빨간", 20))

# 방 법 2  중가로{}
print("나는 {}살입니다.".format(20))
print("나는 {}색과 {}색을 좋아해요.".format("파란", "빨간"))

print("나는 {0}색과 {1}색을 좋아해요.".format("파란", "빨간"))  # 0번째, 1번째 값 = 파란, 빨간
print("나는 {1}색과 {0}색을 좋아해요.".format("파란", "빨간"))  # 1번째, 0번째 값 = 빨간, 파란

# 방 법 3
print("나는 {age}살이며, {color}색을 좋아해요." .format(age = 20, color="빨간"))
print("나는 {age}살이며, {color}색을 좋아해요." .format(color="빨간", age = 20, ))

# 방 법 4 (Python v3.6 이상~ 부터 사용 가능)
age = 20
color = "빨간"
print(f"나는 {age}살이며, {color}색을 좋아해요.")
print("나는 {age}살이며, {color}색을 좋아해요.")

