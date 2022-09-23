#!/bin/bash

echo "Welcome to The Gram webpage! Are you a new or existing member?";
read member;

if [[ $member = "new" ]] #if selected new then procceds to the sign-up form
then
echo "Now just a few questions to get you set up."
read -p "First name?:" firname;
read -p "Last name?:" secname;
read -p "Email Address:" email;
read -p "Create a Username:" usname;
read -p "Create a Password:" pswd;
echo "Thank you for signing up for The Gram. You are now all set!";
echo "$firname,$secname,$email,$usname,$pswd" >> MOCK_DATA.csv; #inserts new data into mock_data.csv at the bottom
echo "You are now set to login";
fi

if [[ $member = "existing" ]] #if selected existing then checks the username
then
read -p "What is you Username?" usname;
sh parser.sh MOCK_DATA.csv | grep -A5 "Username: $usname$"; #if username is found then logs in
echo "Welcome to The Gram!!";
else
read -p "Unable to find that Username"; #if no username is found then this prints out
fi