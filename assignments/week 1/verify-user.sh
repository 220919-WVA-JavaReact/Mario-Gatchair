#!/bin/bash:

read -p	"Enter your email: " xemail;

sh parser.sh MOCK_DATA.csv | grep -A5 "Email: $email$";

if [[ "$xemail" == "$email" ]];
then
 	echo "You're already here."
 else
 	echo "Sign up!"
 	bash ./signup.sh
fi