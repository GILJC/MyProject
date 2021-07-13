# 책 목록 선언
books = list()      
# 책 목록 만들기
books.append({'제목':'개발자의 코드', '출판연도':'2013.02.28', '출판사':'A', '쪽수':200, '추천유무':False})
books.append({'제목':'클린 코드', '출판연도':'2013.03.04', '출판사':'B', '쪽수':584, '추천유무':True})
books.append({'제목':'빅데이터 마케팅', '출판연도':'2014.07.02', '출판사':'A', '쪽수':296, '추천유무':True})
books.append({'제목':'구글드', '출판연도':'2010.02.10', '출판사':'B', '쪽수':526, '추천유무':False})
books.append({'제목':'강의력', '출판연도':'2013.12.12', '출판사':'A', '쪽수':248, '추천유무':True})

pages_all = 0

"""
for i in range(5):
    print(books[i])

for i in books:
    print("{}".format(i.get('쪽수')))

print(books[0].get('쪽수'))

"""

print('\n 1. 250 쪽을 넘는 책의 목록 ' )
for i in books:
    if i.get('쪽수') > 250:
        #print(i.get('쪽수'))
        print(i.get('제목'), end=", ")

# 같은 결과 다른 문법
"""
for i in range(5):
    if books[i].get('쪽수') > 250:
        #print(books[i].get('쪽수'))
        print(i.get('제목'))

"""

print('\n\n 2. 내가 추천하는 책의 목록 ' )
for i in books:
    if i.get('추천유무') == True:
        #print(i.get('추천유무'))
        print(i.get('제목'), end=', ')


print('\n\n 3. 내가 읽은 책 전체 쪽수 ' )
for i in books:
    pages = i.get('쪽수')
    pages_all += pages
    print(pages_all, end=', ')


print('\n\n 4. 내가 읽은 책의 출판사 목록 ' )
for i in books:
    print(i.get('출판사'), end=', ')

print('\n')
