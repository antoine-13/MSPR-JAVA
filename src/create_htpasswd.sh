#!/bin/bash
for i in $(cat C:/Users/User/IdeaProjects/MSPR1/src/GitFile/staff.txt) ; do
  access_staff_file=$(echo C:/Users/User/IdeaProjects/MSPR1/src/GitFile/${i}.txt | sed -n "4 p")
  echo $access_staff_file
done
sleep 5
