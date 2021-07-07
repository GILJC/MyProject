import turtle
t= turtle.Turtle() #  -> Turtle() 객체를 생성
	        	   #  turtle. 요 점이 터틀 사용한다는 표시. 터틀 안의 터틀 객체 생성.
t.shape('turtle')   #	 -> shape를 터틀로 지정

# turtle대신 arrow 등으로 다른 모양으로 바꿀 수 있다.

t.forward(100)	    # -> t 객체를 100만큼 전진시키겠다
t.left(90)	    	# -> 왼쪽방향으로 90도 회전(왼쪽방향 바라봄)
t.forward(50)	    # -> 그 방향으로 50만큼 이동

t.forward(50)
t.left(90)

t.forward(100)
t.left(90)

t.forward(100)

# turtle로 사각형 그리기

t.right(30)
t.forward(50)

t.right(60)
t.forward(50)

t.right(60)
t.forward(50)

t.right(60)
t.forward(50)

t.right(60)
t.forward(50)

t.right(60)
t.forward(50)

# turtle로 50짜리 정육각형 그리기

t.left(0)
t.forward(100)

t.left(120)
t.forward(100)

t.left(120)
t.forward(100)

# turtle로 100짜리 삼각형 그리기




# turtle로 피자 그리기 (원)

"""
import turtle

t = turtle.Turtle()
t.shape("turtle")

"""
t.shape('arrow')

radius = 100
t.circle(radius)    # 반지름이 100인 원을 그린다

radius = 200
t.circle(radius)    # 반지름이 200인 원을 그린다


