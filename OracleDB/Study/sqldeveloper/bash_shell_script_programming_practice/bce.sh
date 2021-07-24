#!/bin/sh
echo "무한반복 입력을 시작합니다. (b: break, c: continue, e: exit)"
while [ 1 ] ; do
  read input
  case $input in
    b | B)
      break;;	# ; 하나만 쓰면 오류
    c | C)
      echo "continue를 누르면 while의 조건으로 돌아감"
      continue ;;
    e | E)
      echo "exit를 누르면 프로그램(함수)를 완전히 종료함"
      exit;;
    esac;
done
echo "break를 누르면 while을 빠져나와 지금 이 문장이 출력됨."
exit 0
