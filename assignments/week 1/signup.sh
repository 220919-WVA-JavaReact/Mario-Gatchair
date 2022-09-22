#!/bin/bash:
#creating sign up prompt;

echo "Are you a new?";
read answer;
#takes response and then proceeds starting with yes
if [[ $answer = "Yes" ]] || [[ $answer = "y" ]] || [[ $answer = "Y" ]];
then
	read -p "First name: $fname";
  	read -p "Last name: $lname";
  	read -p "Email address: $email";
  	read -p "Username: $uname";
 	read -p "Password: $pw";
#takes response and proceeds with no to check if they exist
 	elif [[ $answer = "No" ]] || [[ $answer = "n" ]] || [[ $answer = "N" ]];
 		read -p	"Enter your email:" xemail;
 		sh parser.sh MOCK_DATA.csv | grep -A5 -q "Email address: $xemail$";
 	then
 		echo "We found you."
 	fi
 fi