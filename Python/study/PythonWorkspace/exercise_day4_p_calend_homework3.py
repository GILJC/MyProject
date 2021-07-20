# 3. 년도의 간지 출력


cheongan = ['경', '신', '임', '계', '갑', '을', '병', '정', '무', '기']
zeezee = ['신', '유', '술', '해', '자', '축', '인', '묘', '진', '사', '오', '미']
while True:
    year = int(input("년도를 입력(ex: 2021): \n(종료는: 0)\n"))
    c = year % 10
    z = year % 12

    if year == 0:
        break
    
    print("결과: {0}{1}년".format(cheongan[c], zeezee[z]))


    
