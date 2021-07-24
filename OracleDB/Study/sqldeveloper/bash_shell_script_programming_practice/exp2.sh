#!/bin/sh
var1="지역 변수"	# var1에 값을 넣는다. 일반 변수(지역 변수)이므로 현재 프로그램인 exp2.sh에서만 사용된다. 즉 exp1.sh의 var1과는 우연히 이름만 같을 뿐 다른 변수다.
export1 var2="외부 변수"	# var2를 외부 변수로 선언하고 값을 넣는다. 외부 프로그램(exp1.sh)에서도 사용 가능하다.
sh exp1.sh		# exp1.sh를 실행한다.
exit 0

# exp2.sh 실행 결과

# sh exp2.sh
#
# 외부 변수
