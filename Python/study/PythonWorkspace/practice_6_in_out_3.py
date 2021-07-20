score_file = open("score.txt", "w", encoding="utf8")  # "w" -> 이 파일을 쓰기 위한 목적으로 열겠다
print("수학 : 0", file=score_file)                     # 인코딩=utf8 -> 한글 읽기 위해 필요
print("영어 : 50", file=score_file)  # 파일 안에 내용 쓰기
score_file.close()
# 출력하면 화면에 아무것도 안나오고 왼쪽에
# score_file이라는 파일이 생성됨
# 안에는 수학 : 0 , 영어 : 50 이라고 작성되어있음

#-> 여러번 실행해도 파일 여러개 만들어지거나, 같은내용 계속 적히거나 하진 않음.
# -> 'w'하면 덮어쓰기가 되므로 중복이 안됨


score_file = open("score.txt", "a", encoding="utf8")  # -> "a" -> append -> 존재하는 파일의 뒤에 계속 이어서 쓰고싶어
score_file.write("과학 : 80")
score_file.write("\n코딩 : 180")  # 위처럼 print로 쓰면 자동으로 줄바꿈이 됨
score_file.close()              # .write로 쓰면 줄바꿈 안됨 -> \n

# 전체 소스 여러번 실행해도 내용 계속 안늘어남.
# 위에서 "w"로 덮어씌우기부터 다시 시작하기 떄문이라고 봄


score_file = open("score.txt", "r", encoding="utf8")  # r-> 파일의 내용을 읽어옴
print(score_file.read())
score_file.close()
# 수학 : 0
# 영어 : 50
# 과학 : 80
# 코딩 : 180


score_file = open("score.txt", "r", encoding="utf8")
print(score_file.readline())  # 줄별로 읽기, 한 줄 읽고 커서는 다음 줄로 이동
print(score_file.readline())
print(score_file.readline())
print(score_file.readline())
score_file.close()
# 수학 : 0
#
# 영어 : 50
#
# 과학 : 80
#
# 코딩 : 180


score_file = open("score.txt", "r", encoding="utf8")
print(score_file.readline(), end="")  # 줄별로 읽기, 한 줄 읽고 커서는 다음 줄로 이동
print(score_file.readline(), end="")
print(score_file.readline(), end="")
print(score_file.readline(), end="") # 끝나고 다음줄로 안가고 다음칸에서 대기
score_file.close()
# 수학 : 0
# 영어 : 50
# 과학 : 80
# 코딩 : 180

print("\n")
score_file = open("score.txt", "r", encoding="utf8")
while True:
    line = score_file.readline()
    if not line:
        break
    print(line)
score_file.close()

# 수학 : 0
#
# 영어 : 50
#
# 과학 : 80
#
# 코딩 : 180


score_file = open("score.txt", "r", encoding="utf8")
lines = score_file.readlines()  # list형태로 저장
for line in lines:
    print(line, end="")

score_file.close()
# 수학 : 0
# 영어 : 50
# 과학 : 80
# 코딩 : 180

