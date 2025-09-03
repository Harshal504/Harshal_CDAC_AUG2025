#!/bin/bash

while true
do
	echo "enter an number"
	read num
	
	if [[ $num -lt 0 ]];then
		echo " number is negative so exiting"
		break
	else
		echo $((num * num))
	fi
done
