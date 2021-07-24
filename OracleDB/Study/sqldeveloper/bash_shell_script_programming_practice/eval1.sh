#!/bin/sh
str="ls -l eval.sh"
echo $str
eval $str
exit 0

# sh eval.sh
# ls -l eval.sh
# -rw-r--r-- 1 root root 57 8dnjf  9  2016 eval.sh

