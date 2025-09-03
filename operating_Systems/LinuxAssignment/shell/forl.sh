#!/bib/bash

for var in 123
do
	for var1 in [0..5]
	do
		if [(($var - $var1)) -eg 0]; then
			echo "tested"
		else
			echo "not tested"
		fi
	done
done
