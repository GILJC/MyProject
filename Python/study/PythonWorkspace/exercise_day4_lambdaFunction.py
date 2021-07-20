# lambda 함수 = 이름이 없는 함수, 1회용
print('100과 200의 합 :', (lambda x, y: x + y)(100, 200))  # 100, 200이 람다 함수의 인자


# 일반 함수
def add(x, y):
    return x+ y
def add2(x, y):
    sum=x+y
    return sum

print(add(100, 200))
print(add(100, 200))


# 튜플에서 첫 항목만을 추출하는 람다 함수
t = (100, 200, 300)
(lambda x: x[0])(t)  # t를 인자로 받아서 그 첫 항목 t[0]을 반환한다.
# = 100
(lambda x: x[1])(t)  # t를 인자로 받아서 그 두 번째 항목 t[1]을 반환한다.
# = 200



#---------------------------------
list(range(5))
# [0, 1, 2, 3, 4]
list(range(0, 5))
# [0, 1, 2, 3, 4]
list(range(0, 5))
# [0, 1, 2, 3, 4]
list(range(0, 5, 1))
# [0, 1, 2, 3, 4]
list(range(0, 5, 2))  # 생성하는 값을 2씩 증가
# [0, 2, 4]
list(range(2, 5, 2))
# [0, 2, 4]

#-----------------------------------

numbers = [9, 6, 7, 1, 8, 4, 5, 3, 2 ]
new_list = sorted(numbers)
print(new_list)
# [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(numbers)
# [9, 6, 7, 1, 8, 4, 5, 3, 2]

numbers = [9, 6, 7, 1, 8, 4, 5, 3, 2 ]
new_list = sorted(numbers, reverse=True)
print(new_list)
# [9, 8, 7, 6, 5, 4, 3, 2, 1]
print(numbers)
# [9, 6, 7, 1, 8, 4, 5, 3, 2]


#-----------------------------------
print("\n\n")

def apply_to_evens(a_list, a_func):
    return [a_func(x) for x in a_list if x % 2 == 0]

my_list = [1,2,3,4,5]
sqrs_of_evens = apply_to_evens(my_list, lambda x : x * x)

print(sqrs_of_evens)  # [4, 16]
#-----------------------------------

