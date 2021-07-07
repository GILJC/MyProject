"""
함수 solution은 정수 x와 자연수 n을 입력 받아, 
x부터 시작해서 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수,
solution을 완성해주세요.

제한 조건
10000000 >= x >= -10000000
n은 1000 이하는 자연수.

입출력 예
x   n   answer
2   5   [2,4,6,8,10]
4   3   [4,8,12]
-4  2   [-4, -8]

"""

# def solution(x, n):
#     answer = []
#     return answer

x=2
n=5
tmp=x

def solution(x, n):
    for i in range(n):
        print(x)
        x+=tmp

print(solution(x, n))

