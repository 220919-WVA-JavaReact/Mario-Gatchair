#!/bin/bash:

read -p "First name: " fname;
read -p "Last name: " lname;
read -p "Email address: " email;
read -p "Username: " uname;
read -p "Password: " pw;
string="$fname,$lname,$email,$uname,$pw";
echo $string >> MOCK_DATA.csv;