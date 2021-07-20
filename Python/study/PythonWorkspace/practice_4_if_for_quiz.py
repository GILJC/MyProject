"""
Quiz) 당신은 Cocoa 서비스를 이용하는 택시 기사님입니다.
50명의 승객과 매칭 기회가 있을 때, 총 탑승 승객 수를 구하는 프로그램을 작성하시오.

조건1 : 승객별 운행 소요 시간은 5분 ~ 50분 사이의 난수로 정해집니다.
조건2 : 당신은 소요 시간 5분 ~ 15분 사이의 승객만 매칭해야 합니다.

(출력문 예제)
[0] 1번째 손님 (소요시간 : 15분)
[ ] 2번째 손님 (소요시간 : 50분)
[0] 3번째 손님 (소요시간 : 5분)
...
[ ] 50번째 손님 (소요시간 : 16분)

총 탑승 승객 : 2분

"""
from random import *

rid_time = list(range(1,51))
print(rid_time)

a=0
for i in range(50):
    rid_time[i] = randrange(5, 50)
    #print(rid_time)
    if rid_time[i] <= 15:
        check = '0'
        a+=1
    else:
        check = ' '
    print("[{0}] {1}번째 손님 (소요시간 : {2}분".format(check, i+1, rid_time[i]))


print("총 탑승 승객 : {0}분".format(a))




### 여기서부턴 나도코딩 풀이 ###

# from random import *
cnt = 0  # 총 탑승 승객 수
for i in range(1, 51):  # 1 ~ 50 이라는 수 (승객)
    time = randrange(5, 51)  # 5분 ~ 50분 소요 시간
    if 5 <= time <= 15:  # 5분 ~ 15분 이내의 손님 (매칭 성공), 탑승 승객 수 증가 처리
        print("[0] {0}번째 손님 (소요시간 : {1}분)".format(i, time))
        cnt += 1
    else:  # 매칭 실패한 경우
        print("[ ] {0}번째 손님 (소요시간 : {1}분)".format(i, time))

print("총 탑승 승객 : {0} 분".format(cnt))
