stage("Build") {
    parallel (
     "Compile A": {
	echo "Compile package A"
     },
     "Compile B": {
        echo "Compile package B"
     } 
    )
}
