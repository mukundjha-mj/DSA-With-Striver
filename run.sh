#!/bin/bash

echo "Enter the Java file name (without .java):"
read filename

# Compile from src/main/java and put .class in current dir
javac "src/main/java/$filename.java"

# Run the compiled class
java -cp src/main/java "$filename" < input.txt > output.txt

