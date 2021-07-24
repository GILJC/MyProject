#!/bin/sh
for fname in $(ls *.sh)	# fname 변수에 ls *.sh 명령의 실행결과를 하나씩 넣어서 4~5행을 반복한다. 즉. 파일 개수만큼 실행을 반복한다.
do
  echo "--------$fname--------"	# --------andor.sh--------	# 파일 이름을 출력한다.
  head -3 $fname	# 파일 앞에 3줄을 출력한다.
done
exit 0

# sh forin2.sh
# --------andor.sh--------
# #!/bin/sh
# echo "보고 싶은 파일명을 입력하세요."
# read fname
# --------bce.sh--------
# #!/bin/sh
# echo "무한반복 입력을 시작합니다. (b: break, e: exit)"
# while [ 1 ] ; do
# --------case1.sh

