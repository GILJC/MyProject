#!/bin/sh
echo "보고 싶은 파일명을 입력하세요."	# 보고 싶은 파일명을 입력하세요.
read fname	# /ib/systemd/system/nofileservice
if [ -f $fname ] && [ -s $fname ] ; then
  head -5 $fname
else
  echo "파일이 없거나, 크기가 0입니다."	# 파일이 없거나, 크기가 0입니다.
fi
exit 0

# /lib/systemd.system/cron.service
# [Unit]
# Description=Regular background program processing daemon
# After=remote-fs.target nss-user-lookup.target

