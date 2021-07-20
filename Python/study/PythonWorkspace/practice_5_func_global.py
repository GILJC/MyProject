def open_account():
    print("새로운 계좌가 생성되었습니다.")

def deposit(balance, money):  # 입금
    print("입금이 완료되었습니다. 잔액은 {0} 원입니다.".format(balance + money))
    return balance + money

def withdraw(balance, money):  # 출금
    if balance >= money:  # 잔액이 출금보다 많으면
        print("출금이 완료되었습니다. 잔액은 {0} 원입니다.".format(balance - money))
        return balance - money
    else:
        print("출금이 완료되지 않았습니다. 잔액은 {0} 원입니다.".format(balance))
        return balance

def withdraw_night(balance, money):  # 저녁에 출금
    commission = 100  # 수수료 100원
    return commission, balance - money - commission


balance = 0  # 잔액
balance  = deposit(balance, 1000)  # 입금이 완료되었습니다. 잔액은 1000 원입니다.
balance = withdraw(balance, 2000)  # 출금이 완료되지 않았습니다. 잔액은 1000 원입니다.
balance = withdraw(balance, 500)   # 출금이 완료되었습니다. 잔액은 500 원입니다.
commission, balance = withdraw_night(balance, 500)
print("수수료 {0} 원이며, 잔액은 {1} 원입니다.".format(commission, balance))
# 수수료 100 원이며, 잔액은 -100 원입니다.



#=======================================
                                 #글자를 크게 해서 한줄에 다 안들어 오니까, 줄바꿈을 해보겠음
def profile(name, age, main_lang):                  # \ + {Enter} 하면 줄바꿈
    print("이름 : {0}\t나이 : {1}\t주 사용 언어: {2}" \
        .format(name, age, main_lang))              # 위 2 문장은 실제로는 하나의 문장.

profile("유재석", 20, "파이썬")  # = 이름 : 유재석   나이 : 20       주 사용 언어: 파이썬
profile("김태호", 25, "자바")    # = 이름 : 김태호   나이 : 25       주 사용 언어: 자바

#같은 학교 같은 학년 같은 반 같은 수업.

def profile2(name, age=17, main_lang="파이썬"):  # 사용하지 않을때는 기본값 17출력
    print("이름 : {0}\t나이 : {1}\t주 사용 언어: {2}"\
        .format(name, age, main_lang))

profile2("유재석")  # 이름 : 유재석   나이 : 17       주 사용 언어: 파이썬
profile2("김태호")  # 이름 : 김태호   나이 : 17       주 사용 언어: 파이썬



def profile_1(name, age, main_lang):
    print(name, age, main_lang)

profile_1(name="유재석", main_lang="파이썬", age=20)  # 유재석 20 파이썬
profile_1(main_lang="자바", age=25, name="김태호")  # 김태호 25 자바  -> 함수안의 변수입력할때 순서를 바꿔도 ('각 변수명'=)을 써주면 동일한 결과.


def profile_2(name, age, lang1, lang2, lang3, lang4, lang5):
    print("이름 : {0}\t나이 : {1}\t".format(name, age), end=" ")  # -> end=" "  -> 이걸로 끝나면 줄이 안바뀌고 밑에줄과 1줄로 이어짐
    print(lang1, lang2, lang3, lang4, lang5)                 # -> 윗줄을 포함, 여기까지가 사실상 1줄로 나옴

profile_2("유재석", 20, "Python", "Java", "C", "C++", "C#")
# 이름 : 유재석   나이 : 20        Python Java C C++ C#
profile_2("김태호", 25, "Kotlin", "Swift", "", "", "")
# 이름 : 김태호   나이 : 25        Kotlin Swift


# def profile_2(name, age, lang1, lang2, lang3, lang4, lang5):
# -> 요 안의 lang1~5를 하나로 표현하기
def profile_3(name, age, *language):
    print("이름 : {0}\t나이 : {1}\t".format(name, age), end=" ")
    for lang in language:   # -> lang 이라는 변수 생성(없던것 만듬), 생성되는 language의 수만큼 받아오기
        print(lang, end=" ")  # -> 받은 lang 출력하고 end=" " 아래줄과 이어짐 / 근데 아래줄에서 다시 줄 내림.
    print()

profile_3("유재석", 20, "Python", "Java", "C", "C++", "C#", "JavaScript")
# 이름 : 유재석   나이 : 20        Python Java C C++ C# JavaScript
profile_3("김태로", 25, "Kotlin", "Swift")
# 이름 : 김태로   나이 : 25        Kotlin Swift



#=======================================

# 지역변수와 전역변수


gun = 10

def checkpoint(soldiers):  # 경계근무
    gun = 20
    gun = gun - soldiers
    print("[함수 내] 남은 총 : {0}".format(gun))

print("전체 총 : {0}".format(gun))  # 전체 총 : 10
checkpoint(2)  # 2명이 경계 근무 나감    # -> [함수 내] 남은 총 : 18
print("남은 총 : {0}".format(gun))  # 남은 총 : 10  -> return gun이 없으므로 안에서만 쓰고 사라짐. 휘발성

#-----------------------

def checkpoint_global(soldiers):  # 경계근무
    global gun  # 전역 공간에 있는 gun 사용
    gun = gun - soldiers
    print("[함수 내 남은 총 : {0}]".format(gun))

print("전체 총 : {0}".format(gun))    # 전체 총 : 10
checkpoint_global(2)  # 2명이 경계 근무 나감   # -> [함수 내 남은 총 : 8]
print("남은 총 : {0}".format(gun))    # 남은 총 : 8

#-----------------------

def checkpoint_ret(gun, soldiers):
    gun = gun - soldiers
    print("[함수 내] 남은 총 : {0}".format(gun))
    return gun   # return값으로 gun을 올리므로 밖에서 가져온 gun값에 대입. 밖의 gun값 변화함.
                 # return 안주면 값 안변함 -> 안에서만 변하게 됨

print("전체 총 : {0}".format(gun))  # 전체 총 : 8
gun = checkpoint_ret(gun, 2)   # [함수 내] 남은 총 : 6
print("남은 총 : {0}".format(gun))  # 남은 총 : 6














