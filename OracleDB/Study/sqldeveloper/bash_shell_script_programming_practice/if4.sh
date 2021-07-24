#!/bin/sh
fname=/lib/systemd/system/cron.service	# fname 변수에 cron 서버 실행 파일을 저장한다.
if [ -f $fname ]	# fname 변수에 저장된 파일이 일반 파일이면 참이므로 5행을 실행하고, 그러지 않으면 거짓이므로 7행을 실행한다.
then
  head -5 $fname
else
  echo "Cron 서버가 설치되지 않았습니다."
fi
exit 0

# 실행 결과
# [Unit]
# Description=Regular backgroun program processing daemon
# Documentation=man:cron(8)
# After=remote-fs.target nss-user-lookup.target
