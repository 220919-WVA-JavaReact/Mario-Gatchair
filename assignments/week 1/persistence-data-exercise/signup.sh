#!/bin/bash:
#creating sign up prompt;

echo "Are you a new memeber?";
#prompt for user to sign up or provid existing account
read answer;
#takes response and then proceeds starting with no
if [[ $answer = "No" ]] || [[ $answer = "n" ]] || [[ $answer = "N" ]] || [[ $answer = "no" ]];
then
	sh verify-user.sh;
	elif [[ $answer = "Yes" ]] || [[ $answer = "y" ]] || [[ $answer = "Y" ]] || [[ $answer = "yes" ]];
	then
		echo "Fill this out!"
		sh add-user.sh;
 		echo "Got ya, thanks for signing up!"
 	fi