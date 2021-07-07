# 튜플 
# 튜플은 리스트하곤 다르게 내용 변경이나 추가를 할 수 없음.
# 대신 속도가 리스트보다 빠름

menu = ("돈가스", "치즈까스")
print(menu[0])
print(menu[1])

#menu.add("생선까스")  # 튜플은 값을 추가, 변경이 불가 / 고정된 값만 사용 가능
#print(menu)
#menu.append("생선까스")
#print(menu)


# name = "김종국"
# age = 20
# hobby = "코딩"
# print(name, age, hobby)

name, age, hobby = "김종국", 20, "코딩"
print(name, age, hobby)

(name, age, hobby) = ("김종국", 20, "코딩")  # 보기 좋게 가로를 넣어볼까요
print(name, age, hobby)


#==========================
# 세트

# 집합 (set)
# 중복 안됨, 순서 없음
my_set = {1,2,3,3,3}
print(my_set)  # 1,2,3,3,3으로 중복지만, 중복을 허용하지 않으므로, 3,3은 무시됨
# = {1, 2, 3}

java = {"유재석", "김태호", "양세형"}
python = set(["유재석", "박명수"])

# 교집합 (java와 python을 모두 할 수 있는 개발자)
print(java & python)
print(java.intersection(python))
# = {'유재석'}

# 합집합 (java 도 할 수 있거나 python 할 수 있는 개발자)
print(java | python)
print(java.union(python))
# = {'박명수', '김태호', '유재석', '양세형'} -> 다 출력됨. 그런데 "유재석"이 3번쨰로 감.
# = {'박명수', '김태호', '유재석', '양세형'}    = 순서는 보장되지 않습니다.


#차집합



### 1:46:45   5-4 세트,  차집합부터 다시 듣기

