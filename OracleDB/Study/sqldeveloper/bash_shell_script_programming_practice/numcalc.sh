#!/bin/sh
num1=100
num2=$num1+200
echo $num2	# 100+200
num3='expr $num1 + 200'	# 숫자로 취급해서 계산한다
echo $num3	# 300
num4='expr \( $num1 + 200 \) / 10 \* 2'	# 괄호와 '*' 앞에는 역슬래시(\)
echo $num4	# 60
exit 0
