"""
print(5)
print(-10)
print(-0.0004)
"""
#19;53 / 6:04:27 . 2-4 변수
# 애완동물을 소개해 주세요~
animal = "강아지"
name = "연탄이"
age = 4
hobby = "산책"
is_adult = age >= 3

print("우리집 " + animal + "의 이름은 " + name + "에요")
print(name + "는 " + str(age) + "살이며, " + hobby + "을 아주 좋아해요")
print(name + "는 어른일까요? " + str(is_adult))

# str(age) <- 숫자 자료형은 + + 로 연결 될 때 string 으로 출력해주기 위해
# str()을 붙여줌. 붙여주지 않으면 에러 발생.
# 콤마 ','로 이어져 있을 경우에는 str()로 감싸주지 않아도 괜찮음.

print(name, "는 ", age, "살이며, ", hobby, "을 아주 좋아해요")

