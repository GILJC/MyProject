#2. AI모델링반 17명의 학생 성적 처리 프로그램

import os


student = ['박창신', '김호연', '임건목', '신성철', '설유이', '남윤우',\
     '최유정', '김용현', '배민지', '정사라', '최길재', '안준홍', '이진서',\
          '김우용', '백승찬', '박상현', '정슬기']
score_ML = range(17)
score_ML = list(score_ML)
score_DL = range(17)
score_DL = list(score_DL)
score_Python = range(17)
score_Python = list(score_Python)


while True:
    print("1. 성적입력\n2. 학생별 성적 조회\n3. 전체 성적 조회\n0. 종료\n\n")
    question_1 = int(input("원하는 기능의 숫자를 입력하시오: "))
    if question_1 == 1:
        os.system('cls')
        print("성적 입력을 시작합니다.\n")
        for i in range(17):
            print("")
            print(student[i])
            score_ML[i], score_DL[i], score_Python[i] = map(int, input("ML, DL, Python의 순으로, 띄어쓰기 한칸 간격으로 성적을 입력하시오: \n예)12 13 14\n").split())
        print("\n성적 입력이 완료되었습니다.\n")
        input("계속 하시려면 Enter를 눌러주세요")
        os.system('cls')
    elif question_1 == 2:
        os.system('cls')
        print("학생별 성적 조회를 시작합니다.")
        tmp = input("찾으시는 학생의 이름을 정확히 입력해주세요.")
        if tmp == '박창신':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '김호연':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '임건목':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '신성철':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '설유이':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '남윤우':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '최유정':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '김용현':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '배민지':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '정사라':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '최길재':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '안준홍':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '이진서':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '김우용':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '백승찬':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '박상현':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        elif tmp == '정슬기':
            print("과목별 점수")
            print("ML: {ML}, DL: {DL}, Python: {PY}".format(ML = score_ML[0], DL = score_DL[0], PY = score_Python[0]))
            print("총점: {sum}, 평균: {avg}".format(sum = score_ML[0] + score_DL[0] + score_Python[0], \
                avg = (score_ML[0] + score_DL[0] + score_Python[0]) / 3))
            print("\n해당 학생의 성적 조회가 완료되었습니다.\n")
            input("계속 하시려면 Enter를 눌러주세요")
            os.system('cls')
        else:
            print("해당하는 학생이 없습니다.")
    elif question_1 == 3:
        os.system('cls')
        print("전체 성적 조회를 시작합니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        for i in range(17):
            print("이름: {0}, ML: {1}, DL: {2}, Python: {3}, 총점: {4}, 평균: {5}".format(student[i], score_ML[i], score_DL[i], score_Python[i], score_ML[i] + score_DL[i] + score_Python[i], (score_ML[i] + score_DL[i] + score_Python[i]) / 3))
        print("전체 성적 조회를 마쳤습니다.\n")
        input("계속 하시려면 Enter를 눌러주세요")
    elif question_1 == 0:
        os.system('cls')
        print("프로그램을 종료합니다.")
        input("계속 하시려면 Enter를 눌러주세요")
        break
    else:
        os.system('cls')
        print("목록에 있는 번호에서만 입력해 주세요. (1~3 또는 0)\n")
        input("계속 하시려면 Enter를 눌러주세요")