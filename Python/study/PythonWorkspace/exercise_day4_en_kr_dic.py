# make Eng-Kor dictionary
# $가 나타나며, 입력 사항은 < 는 단어 등록, >는 ? . 한글, 영어로 번역

print("사전 프로그램 시작... 종료는 q를 입력")
dictionary = {}  # -> 비어있는 dic 생성 (케비넷)

while True:    # = "$ "
    st = input('$ ')  # 사전에 등록할 단어를 입력하세요 -> 처음에 '$ '가 나오고 ' ' 한칸 띄고 입력
    command = st[0]  # 첫 입력 문자를 추출한다.
    if command == '<':  # 등록
        st = st[1:]  # 공백부터 시작, 끝까지
        inputStr = st.split(':')  # split -> ' : ' 으로 나눔.
        if len(inputStr) < 2 :  # 영문자만 입력하고 : 해석을 안했다던지, 아예 안썼다던지
            print('입력 오류가 발생했습니다.')
        else:  # -> 입력오류 체크 다 했으니까, 나머진 dictionary에 등록 하기.
            dictionary[inputStr[0].strip()] = inputStr[1].strip()  # key값 : inputStr[0].strip()] / value값 : inputStr[1].strip()  -> key 값에 value 넣어줌.
    elif command == '>':  #검색       # .strip() -> 해당 문자의 좌, 우의 공백 ' ' 제거 ->  <' name:이름 ' 와 같은 공백 제거
        st = st[1:]
        inputStr = st.strip()
        if inputStr in dictionary:  # inputStr = 공백 제거하고 name만 남은 것
            print(dictionary[inputStr])
        else :
            print('{}가 사전에 없습니다.'.format(inputStr))
    elif command == 'q':
        break
    else :  # 아무것도 안 누르거나, a나 b나 하나 누른거
        print('입력 오류가 발생했습니다.')
print('사전 프로글매을 종료합니다.')
