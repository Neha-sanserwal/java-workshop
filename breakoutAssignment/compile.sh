rm -rf out/*
echo "----------------------------------------------------------------";
javac  -d out  -cp ./src:$1 $2 $3 $4
echo "Compiled."
echo "----------------------------------------------------------------"