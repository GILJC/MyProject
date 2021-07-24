#!/bin/sh
myfunc () {
  str=""	# 결과를 누적할 str 변수를 초기화한다.
  while [ "$1" != "" ] ; do	# $1 파라미터가 비어 있지 않은 동안에 반복 실행한다.(처음 $1은 AAA고, 한 번 반복 실행하면 5,6행에 의해 $1이 BBB가 된다).
    str="$str $1"	# str 변수에 $1을 추가한다.
    shift	# 전체 파라미터를 왼쪽으로 시프트시킨다. 즉 $2->$1, $3->$2, $4->$3, ... 의 형태로 작업이 일어난다.
  done
  echo $str	# while문이 끝나면 누적한 str 변수를 출력한다.
}
myfunc AAA BBB CCC DDD EEE FFF GGG HHH III JJJ KKK
exit 0

# sh shift.sh
# AAA BBB CCC DDD EEE FFF GGG HHH III JJJ KKK
