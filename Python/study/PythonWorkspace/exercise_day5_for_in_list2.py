
  #l = [int(x) for x in input('정수를 여러개 입력하세요 : ').split()]
# 정수를 여러개 입력하세요 : 100 200 300
#print(l)
# [100, 200, 300]

  #l2 = [int(x) for x in input('정수를 여러개 입력해세요 : ').split() if x.isdigit()]
#ㅣ = (int(x) for x in input('정수를 여러개 입력해세요 : ').split() if x.isdigit())  # -> l 겹치면 제대로 안나옴 -> [100, 200, 300]
# 정수를 여러개 입력해세요 : 100 이백 300 400
#print(l2)
# [100, 300, 400]



l3 = [(x,y) for x in [1,2,3] for y in [3,1,4]]
# [(1, 3), (1, 1), (1, 4), (2, 3), (2, 1), (2, 4), (3, 3), (3, 1), (3, 4)]
print(l3)

#===================================

colors = ("red", "green", "blue")
colors  # 아무것도 안나옴 -> JupyterNotebook에서는 출력됨
print(colors)  # ('red', 'green', 'blue')
type(colors)
# -> <class 'tuple'>



numbers = (1, 2, 3, 4, 5 )
print(type(numbers))  # -> <class 'tuple'>
print(type, numbers)  # -> <class 'type'> (1, 2, 3, 4, 5)
print(numbers)  # (1, 2, 3, 4, 5)




#===================================


# 도시의 이름과 인구를 튜플로 묶어보자
print("\n\n도시의 이름과 인구를 튜플로 묶어보자\n\n")

city_info = [('서울', 9765), ('부산', 3441), ('인천', 2954), ('광주', 1501), ('대전', 1531)]

max_pop = 0
min_pop = 999999999999999
total_pop = 0

max_city = None
min_city = None

for city in city_info:  # -> ???
    total_pop += city[1]
    if city[1] > max_pop :
        max_pop = city[1]
        min_city = city
    if city[1] < min_pop :
        min_pop = city[1]
        min_city = city

print('최대인구 {0}, 인구: {1} 천명'.format(max_city[0], max_city[1]))
print('대인구 {0}, 인구: {1} 천명'.format(min_city[0], min_city[1]))
print('리스트 도시 평균 인구: {0} 천명'.format(total_pop / len(city_info)))


# Error 발생하는듯

#===================================

#
print("\n\n")
#

print("100 + 200")
# 100 + 200
eval("100 + 200")
# (출력 없음)
print(eval("100 + 200"))
# 300


#===================================

#
print("\n\n")
#
print("ABDC"[0])





#===================================
"""
>>> "ABCD"[0]
'A'
>>> "ABCD"[0:2]
'AB'
>>> "ABCD"[1:3]
'BC'

>>> "ABCD"[0]
'A'

>>> "ABCD"[0:2]
'AB'
>>> "ABCD"[1:3]
'BC'

>>> "ABCD"[1:]
'BCD'

>>> "ABCD"[:-1]
'ABC'

#===================================

>>> "ABC DEF".split()
['ABC', 'DEF']
>>> "ABC \tDEF".split()
['ABC', 'DEF']
>>> "ABC \tDEF".split(' ')
['ABC', '\tDEF']
>>> "ABCABD".split("AB")
[' ', 'C' 'D']



>>> ",".join(["A", "B", "C"])
'A', 'B', 'C'


>>> start, end, count_by = 1, 7, 2
>>> "ABCDEFG" [start: end: count_by]
'BDF'

"""



"""

함수명
open

#파일의 내용을 문자열로 가져온다.
open("file.txt", "r").read()

#파일의 내용을 문자열 리스트로 가져온다.
open("file.txt", "r").readlines()  #-> 한 줄씩 가져와서 읽는다

#파일에 쓴다.
open("file.txt", "w").write("Hello World") -> 쓸 용도로 열겠다.

Enumeration : 열거형
[1, 2, 3]
인덱스 값과 위치값을 함께 갖고 있다고 생각하면 됨

ex) [ Sun, Mon, Teu, Wed, Thurs, Fri, Sat ]
    [ Male, Female ]

범위가 딱 정해져 있는 것.


for ind, val in mylist:
  print("인덱스: %i" % ind)
  print("값 ", val)

"""
#===================================

#  예외 상황 다루기
"""
try:
  lines = input_text.split("\n")
  print("열 번째 줄: ", lines[9])   # -> 파일에 10번째 줄이 없으면 에러 발생
except:
  print("이 파일엔 열 번째 줄이 없습니다.")  # -> 에러로 인한 프로그램 정지 대신, 해당 문구 띄움.

"""

"""

실행시에 발생하는 에러
= 런타임 에러
Runtime Error

4/0  =>  Error

에러가 나면 프로그램이 죽음


1시간짜리 프로그램인데,
마지막 1분때 런타임 에러가 발생.
그런 경우를 막기 위해서,

Exception, 예외상황을 처리함

Exception handling
익셉션 핸들링

최소한 프로그램이 죽지는 않게 한다.

"""

#===================================
"""

# 라이브러리

from my_lib import f1, f2  # 이름공간에 f1과 f2를 추가한다.

import other_lib as ol  # -> other_lib이 너무 길어서 대신에 ol로 사용.

from other_lib import *


a.py
  my_func()

  -> 불러오려면

  from a import my_func()



#===================================



해싱
hashing

해시코드 -> #

데이터를 저장하고, 검색할때 사용하는
알고리즘중 하나.

해싱이 가능한 자료, 불가능한 자료가 있음.

해싱이 가능한 자료 (수정 불가능한 자료):
정수형, 실수형, 문자열, 튜플 등

해싱이 불가능한 자료 (수정 가능한 자료):
리스트, dict, 그 외의 여러 라이브러리 들

"""


