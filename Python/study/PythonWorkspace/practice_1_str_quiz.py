""" 
Quiz) 사이트별로 비밀번호를 만들어 주는 프로그램을 작성하시오

예) http://naver.com
규칙1 : http:// 부분은 제외 => naver.com
규칙2 : 처음 만나는 점(.) 이후 부분은 제외 => naver
규칙3 : 남은 글자 중 처음 세자리 + 글자 갯수 + 글자 내 'e' 갯수 + "!" 로 구성
                (nav)               (5)            (1)        (!)
예) 생성된 비밀번호 : nav51!

"""

url = "http://naver.com"
print(url)

print(url[7:])  # naver.com
password_ver_01 = url[7:]
print(password_ver_01)

print(password_ver_01.find("."))  # 5
num_dot = password_ver_01.find(".")
print(num_dot)

password_ver_02 = password_ver_01[:num_dot]
print(password_ver_02)  # naver

password_ver_03 = password_ver_02[:3]  # 처음부터 3 직전까지
print(password_ver_03)  # nav

str_count = len(password_ver_02)
print(str_count)  # 5

str_count_e = password_ver_02.count("e")
print(str_count_e)  # = 1

password = (password_ver_03 + str(str_count) + str(str_count_e) + "!")
print(password)  # = nav51!



### 여기서부턴 나도코딩 풀이 ###

url = "http://youtube.com"
my_str = url.replace("http://", "")  # 규칙 1
#print(my_str)
my_str = my_str[:my_str.index(".")]  # 규칙 2
# my_str[0:5] -> 0 ~ 5 직전까지. (0, 1, 2, 3, 4)
#print(my_str)
passward = my_str[:3] + str(len(my_str)) + str(my_str.count("e")) + "!"
print("{0} 의 비밀번호는 {1} 입니다.".format(url, password))
