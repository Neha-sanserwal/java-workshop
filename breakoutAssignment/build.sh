echo "Class-Path: $1.jar" > ./Manifest.txt
jar cfme manali-$1.jar Manifest.txt com.step.manali.$1.Main  -C ./out/ .
java -jar manali-$1.jar