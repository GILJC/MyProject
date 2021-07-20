# 탈출 문자  ex: \n
print("백문이 불여일견\n백견이 불여일타")

# print("저는 "나도코딩"입니다.")  -> Error  -> 따옴표(") 안에 따옴표(") 불가
print("저는 '나도코딩'입니다.")
print('저는 "나도코딩"입니다.')
print("저는 \"나도코딩\"입니다.")
print('저는 \'나도코딩\'입니다.')

# \\ : 문장 내에서 하나의 \ 로 출력됨
print("C:\Python39\libs")
#print("C:\UPython39\libs") -> \뒤에 U만 붙으면 에러가 남. 딴건 다 에러 안나는데 -> 어째서?
                                # 해결법은 \\ 쓰면 되긴 하는데, 에러 원인을 모르겠음.
# print("C:\Users\Administrator\Desktop\GIL\프로그래밍\PythonWorkspace") -> 에러
print("C:\\Users\Administrator\Desktop\GIL\프로그래밍\PythonWorkspace")

# \r : 커서를 맨 앞으로 이동
print("Red Apple\rPine")  # = PineApple
print("Apple\rPine")  # = Pinee -> Pine 글자수만큼 앞의 글자가 사라지고, 대채됨

# \b : 백스페이스 (한 글자 삭제)
print("Redd\bApple")  # = RedApple

# \t : 텝
print("Red\tApple")  # Red  Apple
