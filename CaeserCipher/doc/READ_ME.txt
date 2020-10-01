CaeserCipher.
What is it?

A program that encrypts and decrypts messages, using the classic Caeser's cipher 
algorithm. Caeser used a similar method to encrypt war messages to generals and other officers.

How does it work?

The program requires an integer input from the user which tells the program
whether the user wants to decipher or encrypt a message. The message will then be deciphed
or encrypted if the user enters the correct numeric key when prompted to do so.

key = 123

Option 1: 
Decipher encrypted message ==> The program will prompt the user to enter a message
and then enter a numeric key. If the key entered is "123" then the message will be 
deciphered. If however the key is incorrect then the user will be notified.


Option 2: 
Encrypt message ==> The program will prompt the user to enter a message
and then enter a numeric key. If the key entered is "123" then the message will be 
encrypted. If however the key is incorrect then the user will be notified.

Logic behind it?

The CaeserCipher program turns messages into encrypted text or takes encrypted text
and deciphers the message behind it.
When encrypting a message, the CaeserCipher looks at every single alphabet of that message
and changes each alphabet to the alphabet that comes fourth. In this case when
encrypting the message "Hello World" it would be "LIPPS ASVPH".  Notice that "W" changed to "A"
because the fourth alphabet comes after Z we go on to start again at A.

When deciphering a message, the CaeserCipher looks at every single alphabet of that encrypted message
and changes each alphabet to the fourth alphabet that comes before it. In this case when
deciphering the message "FIEYXMJYP WYRWIXW ERH WQMPMRK FEFMIW" it would be "BEAUTIFUL SUNSETS AND SMILING BABIES".  Notice that "FEFMIW" changed to "BABIES"
because the fourth alphabet before "F"is "B".

