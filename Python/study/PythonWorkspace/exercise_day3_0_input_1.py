
#name = input("이름을 입력하시오: ")
#print(name + """ 씨, 안녕하세요?
#파이썬 프로그래밍의 세계에 오신 것을 환영합니다.""")

#=======================

"""
num_1 = input("첫 번째 정수를 입력하시오: ")
num_2 = input("두 번째 정수를 입력하시오: ")
num_sum = int(num_1) + int(num_2)
print(str(num_1) + " 과 " + str(num_2) + " 의 합은 " + str(num_sum) + "입니다.")

#=======================

height = input("신장(m) : ")
weight = input("체중(kg) : ")
# BMI = 몸무게(kg)를 키의 제곱(m)으로 나눈 값
BMI = int(weight) / (float(height) * float(height))

print(BMI)

# BMI = int(weight) / float(height) * float(height)    #-> 이러면 체중인 90만 나옴
# BMI = (int(weight) / float(height)) * float(height)  #-> 이러면 체중인 90만 나옴

"""
#=======================

"""
area = input("경기장은 어디입니까? ")
team_win = input("이긴 팀은 어디입니까? ")
team_loose = input("진 팀은 어디입니까? ")
MVP = input("우수선수는 누구입니까? ")
score = input("스코어는 몇대몇입니까? ")
"""


#print("""
#================================================================
#오늘 {area_} 에서 야구 경기가 열렸습니다.
#{team_loose_1} 과 P{team_win_1} 은 치열한 공방전을 펼쳤습니다.
#{MVP_1} 의 맹활약으로 {team_win_2} 가 {team_loose_2} 를 {score_1} 로 이겼습니다.
#================================================================
#""".format(area_ = area, team_loose_1 = team_loose, team_win_1 = team_win, MVP_1 = MVP, team_win_2 = team_win, team_loose_2 = team_loose, score_1 = score))



#=======================
"""
p = int(input("문자를 입력하시오: "))
q = int(input("분모를 입력하시오: "))
print("나눗셈의 몫 =", p // q)
print("나눗셈의 나머지 =", p % q)

#=======================

sec = int(input("초를 입력하세요: "))
h = sec//(60*60)
m = (sec%(60*60)) // 60
s = ((sec%(60*60)) % 60)
print("입력한 시간은 {h} 시간 {m} 분 {s} 초 입니다.".format(h=h, m=m, s=s))
"""
#=======================

bottom = float(input('직사각형의 밑변의 길이를 입력하시오: '))  # 3
height = float(input('직각삼각형의 높이를 입력하시오: '))  # 4
hypotenuse = (bottom ** 2 + height ** 2) ** 0.5
print('빗변은', hypotenuse, '입니다')   # 5.0

#=======================

