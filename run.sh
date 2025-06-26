#!/bin/bash

read -p "📄 Enter the Java file name (without .java): " filename


# Check if file exists
if [ ! -f "src/main/java/$filename.java" ]; then
  echo "❌ File src/main/java/$filename.java not found!"
  exit 1
fi

# Compile the Java file
javac -d . "src/main/java/$filename.java"
if [ $? -ne 0 ]; then
  echo "❌ Compilation failed!"
  exit 1
fi

# Run the Java class
echo "🚀 Running $filename..."
java "$filename" < input.txt > output.txt


