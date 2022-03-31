#!/bin/bash


input="C:/Users/User/IdeaProjects/MSPR1/src/GitFile/staff.txt"
#list_name=()
#while read -r line
#do
#  echo "$line"
#done < "$input"

list_name=()
mapfile -t list_name < C:/Users/User/IdeaProjects/MSPR1/src/GitFile/staff.txt

#for i in ${!list_name[@]}; do
#  echo "${list_name[$i]}"
#done


for i in ${!list_name[@]}; do
  echo $i
  access_staff_file="C:/Users/User/IdeaProjects/MSPR1/src/GitFile/""${list_name[$i]}"".txt"
#  truc="${list_name[$i]}"
#  access_staff_file+="$truc"
#  access_staff_file+="txt"
  echo $access_staff_file
#  iterator=0
#  while read -r line
#  do
#    if [ "$iterator" == 3 ]
#    then
#      echo "$line"
#    fi
#    i=$((i+1))
#  done < "$access_staff_file"
#  access_staff_file="/opt/bin/MSPR1/src/GitFile/"
#  i=0
#  access_staff_file+="$name"".txt"
#  while read -r line
#  do
#    if [ "$i" == 3 ]
#    then
#      echo "$line"
#    fi
#  i=$((i+1))
#  done  < "$access_staff_file"
done

#
#createHtpasswd(){
#
#}
#list_name=$(getAllName)
#list_passwd=$(getAllPasswd $list_name)
#
#echo $list_name
#echo $list_passwd
sleep 5