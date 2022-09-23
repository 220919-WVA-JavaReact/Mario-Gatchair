#!/bin/bash:
#creating sign up prompt;

echo "Are you a new?";
read answer;
#takes response and then proceeds starting with no
if [[ $answer = "No" ]] || [[ $answer = "n" ]] || [[ $answer = "N" ]] || [[ $answer = "no" ]];
then
 	read -p	"Enter your email:" $xemail;
 	sh parser.sh MOCK_DATA.csv | grep -A5 -q "Email address: $xemail$";
 echo "You're already here."
	elif [[ $answer = "Yes" ]] || [[ $answer = "y" ]] || [[ $answer = "Y" ]] || [[ $answer = "yes" ]];
	then
		read -p "First name: " fname;
  		read -p "Last name: " lname;
  		read -p "Email address: " email;
  		read -p "Username: " uname;
 		read -p "Password: " pw;
 		echo "$fname,$lname,$email,$uname,$pw" >> MOCK_DATA.csv;
 		echo "Got ya, thanks for signing up!"
 fi