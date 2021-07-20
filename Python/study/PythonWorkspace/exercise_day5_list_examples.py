#========================
"""
fruits = []
for _ in range(3):
    name = input('과일 이름 입력: ')
    fruits.append(name)

name = input('좋아하는 과일 입력')
if name in fruits:
    print('당신이 좋아하는 과일임')
else:
    print('이 과일은 당신이 좋아하는 과일이 아닙니다.')

"""
#========================

# 인구 통게(단위: 천명)
print('\n\n인구 통게(단위: 천명)\n\n')

Seoul = 9765
Busan = 3441
Incheon = 2954
city_pop = [Seoul, Busan, Incheon]  # 변수들로 리스트 생성
print(city_pop)  # 리스트 데이터를 출력
# -> [9765, 3441, 2954]

Daejeon = 1531
city_pop.append(Daejeon)

max_pop = 0
min_pop = 1000000
pop_sum = 0
n = 0

for pop in city_pop:   # 순환문을 돌면서, 최댓값, 최솟값을 구한다
    if pop > max_pop :
        max_pop = pop
    if pop < min_pop :
        min_pop = pop
    pop_sum += pop
    n += 1

print('최대 인구:', max_pop)  # 최대 인구: 9765
print('최소 인구:', min_pop)  # 최소 인구: 1531
print('평균 인구:', pop_sum / n)  # 평균 인구: 4422.75



#========================

# 도시의 인구 자료에 대한 슬라이싱
print('\n\n도시의 인구 자료에 대한 슬라이싱\n\n')

population = ["Seoul", 9765, "Busan", 3441, "Incheon", 2945]

print('서울 인구:', population[1])  # 서울 인구: 9765
print('인천 인구:', population[-1])  # 인천 인구: 2945

cities = population[0::2]
print('도시 리스트:', cities)  # 도시 리스트: ['Seoul', 'Busan', 'Incheon']
pops = population[1::2]
print('인구의 합:', sum(pops))  # 인구의 합: 16151



#========================


print('\n\n========================\n\n')

import random

expression = []  # -> expression 리스트를 만들어 놓음. 저장공간 가변.
expression.append("1 + 2")
expression.append("123 + 234")
expression.append("11 * 22")
expression.append("1234 / 22")
expression.append("1 ** 2")
expression.append("1111 * 1111")  # -> expression 리스트 안에 값 추가


dailyQuiz = random.choice(expression)  # -> random.choice로 expression 안의 내용중 하나 렌덤하게 뽑음
print(dailyQuiz)


