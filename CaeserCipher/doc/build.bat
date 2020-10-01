@echo off
echo Setting up path
SET PATH=%PATH%;"C:\Program Files\Java\jdk-12\bin"
cd ..
cd src
javac CaeserCipher.java

javac Main.java
java Main

echo Message has been encrypted! Thank you for using my Caeser Cipher tool