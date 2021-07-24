#!/bin/sh
echo $var1	# var1과 var2 변수를 출력한다.
echo $var2	# var2는 exp2.sh에서 외부 변수로 선언했다.
exit 0

# 외부 변수로 선언한다. 즉 선언한 변수를 다른 프로그램에서도 사용할 수 있게 한다.
