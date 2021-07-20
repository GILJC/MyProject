# 1. 전화번호부 프로그램

import os

list_num = range(30)
list_num = list(list_num)
name = range(30)
name = list(name)
phone_number = range(30)
phone_number = list(phone_number)
address = range(30)
address = list(address)
stat = range(30)
stat = list(stat)
count = 0

a=0
while True:
    print("1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 전체 목록\n0. 종료\n\n현재 등록된 인원 총 {0} 명 입니다.\n\n".format(count))
    question_1 = int(input("원하는 기능의 숫자를 입력하시오: "))
    if question_1 == 1:
        print("등록 메뉴 입니다.")
        a = int(input("몇번 메모리에 저장하시겠습니까.: "))
        list_num[a]= a
        name[a] = input("이름 입력: ")
        phone_number[a] = input("전화번호 입력: ")
        address[a] = input("주소 입력: ")
        stat[a] = input("구분값 입력: ")
        
        count += 1

        print("등록이 완료되었습니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        
        os.system('cls')

    elif question_1 == 2:
        print("조회 메뉴 입니다.")
        for i in range(30):
            print(list_num[i], name[i])
        a = int(input("누구를 조회하시겠습니까.: "))
        print("")
        print(list_num[a], name[a], phone_number[a], address[a], stat[a])
        print("")

        print("조회가 완료되었습니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        
        os.system('cls')


    elif question_1 == 3:
        print("수정 메뉴 입니다.")
        for i in range(30):
            print(list_num[i], name[i])
        a = int(input("누구를 수정하시겠습니까.: "))
        list_num[a]= a
        name[a] = input("이름 입력: ")
        phone_number[a] = input("전화번호 입력: ")
        address[a] = input("주소 입력: ")
        stat[a] = input("구분값 입력: ")

        print("\n수정이 완료되었습니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        
        os.system('cls')


    elif question_1 == 4:
        print("삭제 메뉴 입니다.: ")
        for i in range(30):
            print(list_num[i], name[i])
        a = int(input("누구를 삭제하시겠습니까.: "))
        list_num[a]= a
        name[a] = ("")
        phone_number[a] = ("")
        address[a] = ("")
        stat[a] = ("")

        count -= 1

        print("\n수정이 완료되었습니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        
        os.system('cls')


    elif question_1 == 5:
        os.system('cls')
        print("전체 목록 메뉴 입니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        for i in range(30):
            print(list_num[i], name[i], phone_number[i], address[i], stat[i])

        input("\n계속 하시려면 Enter를 눌러주세요.\n")
        
        os.system('cls')


    elif question_1 == 0:
        os.system('cls')
        print("프로그램을 종료합니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        break

    else:
        os.system('cls')
        print("목록에 있는 번호에서만 입력해 주세요. (1~5 또는 0)\n")
        input("계속 하시려면 Enter를 눌러주세요")
