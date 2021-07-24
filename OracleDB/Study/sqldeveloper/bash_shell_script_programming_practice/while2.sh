#!/bin/sh
hap=0
i=1
while [ $i -le 10 ]	# i가 10보다 작거나 같으면 6~7행을 실행한다.
do
  hap='expr $hap + $i'
  i='expr $i + 1
done
echo "1부터 10까지의 합 : "$hap	# 1부터 10까지의 합 : 55
exit 0
