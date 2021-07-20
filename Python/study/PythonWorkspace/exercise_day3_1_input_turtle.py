import turtle
t = turtle.Turtle()
t.shape("turtle")

while True:  # 무한루프
    question = int(input("몇각형을 그리시겠어요?(3-6): "))  # 근데 범위 벗어나도 다 그림

    for i in range(question):
        t.forward(100)
        t.left(360//question)
    
    turtle.done

    if question == 0:
        break

# 7부터 조금씩 위치가 어긋나기 시작함.
# 7, 11, ...