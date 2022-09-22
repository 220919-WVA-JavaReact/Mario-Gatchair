#!/bin/bash;

if [[ ${1} =~ ^[0-9]+$ ]] && [[ ${2} =~ ^[0-9]+$ ]] && [[ ${3} =~ ^[add]+$ ]];
# uses the regex to go make sure that the first two values are numbers
# uses a third variable to offer an alternative to the symbol use ie:+*-/;
then
	let "a = ${1} + ${2}";
# uses the built in bash calculation
	echo ${1} + ${2} = $a;
# gives the read out in a neat user friendly view
	elif [[ ${1} =~ ^[0-9]+$ ]] && [[ ${2} =~ ^[0-9]+$ ]] && [[ ${3} =~ ^[sub]+$ ]];
# used else-if to read through the various lines for the appropriate execution
	then
		let "a = ${1} - ${2}";
		echo ${1} - ${2} = $a;
		elif [[ ${1} =~ ^[0-9]+$ ]] && [[ ${2} =~ ^[0-9]+$ ]] && [[ ${3} =~ ^[multiply]+$ ]];
		then
			let "a = ${1} * ${2}";
			echo ${1}/*${2} = $a;
			elif [[ ${1} =~ ^[0-9]+$ ]] && [[ ${2} =~ ^[0-9]+$ ]] && [[ ${3} =~ ^[divide]+$ ]];
			then
				let "a = ${1}/${2}";
				b=$((${1}%${2}));
				echo ${2} goes into ${1} ... $a times;
				echo With a remainder of $b
				else
				echo "INVALID: The first two values must a complete number.";
		# else was used to prevent breaking
				fi