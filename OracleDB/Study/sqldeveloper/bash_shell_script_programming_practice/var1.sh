#!/bin/sh
myvar="Hi Woo"
echo $myvar	# Hi Woo
echo "$myvar"	# Hi Woo
echo '$myvar'	# $myvar
echo \$myvar	# $myvar
echo 값 입력 :	# 값 입력 :
read myvar	# 안녕하세요?
echo '$myvar' = $myvar	# $myvar = 안녕하세요?
exit 0
