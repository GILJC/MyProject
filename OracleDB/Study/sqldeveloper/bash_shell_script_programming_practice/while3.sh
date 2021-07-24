#!/bin/sh
echo "비밀번호를 입력하세요."	# 비밀번호를 입력하세요
read mypass			# 3333
while [ $mypass != "1234" ]
do
  echo "틀렸음. 다시 입력하세요."	# 틀렸음. 다시 입력하세요
  read mypass				# 4444, (반복)
done
echo "통과~~"
exit 0

# 1234
# 통과~~
