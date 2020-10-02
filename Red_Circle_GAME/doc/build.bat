@echo off
echo Setting up path
SET PATH=%PATH%;"C:\Program Files\Java\jdk-12\bin"
cd ..
echo compiling RedCircle 
cd src
SET PRAC_BIN=./bin
SET PRAC_SRC=./src
SET PRAC_DOCS= ./docs
echo compiling Main
javac Main.java
java Main
echo Game over!
pause