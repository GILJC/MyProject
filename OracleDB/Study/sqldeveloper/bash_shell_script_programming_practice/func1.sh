#!/bin/sh
myFunction () {
  echo "함수 안으로 들어 왔음"
  return
}
echo "프로그램을 시작합니다."
myFunction
echo "그로그램을 종료합니다."
exit 0

# sh func1.sh
# 프로그램을 시작합니다.
# 함수 안으로 들어 왔음
# 프로그램을 종료합니다.
