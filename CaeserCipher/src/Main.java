import java.util.Scanner;

public class Main {
public static int calcAge(int Y) {
	int Age= 0;
	int currYear= 2020;
	Age= currYear-Y;
	return Age; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask if user would like to decipher a message or encrypt
		System.out.println("Enter 1 to decrypt message and 2 encrypt message :  \n"
				+ "1. Decrypt \n 2. Encrypt");
		Scanner scn = new Scanner(System.in);
		//Record decision as integer
		int Decision = scn.nextInt();
		scn.nextLine();
		//Execute this block if user wants to decipher
		if(Decision == 1)
		{
			//Request message to decipher 
			System.out.println("Provide the message required to be deciphed: \n ");
			String text = scn.nextLine();
			System.out.println(" \n Enter 3 digit pin to perform decryption: \n ");
			String Pin = scn.nextLine();
			String DeciphedText =  Encrypt_Decrypt.decryptText(text, Pin);
			System.out.println("\n" + DeciphedText + "\n");
		}
		if(Decision == 2)
		{
			System.out.println("Provide the text required to be encrypted: \n");
			String text = scn.nextLine();
	System.out.println(" \n Enter 3 digit pin to perform encryption: \n ");
			String Pin = scn.nextLine();
			String EncryptedText =  Encrypt_Decrypt.encryptText(text, Pin);
			System.out.println("\n" + EncryptedText + "\n");
		}
		else if((Decision != 1) && (Decision != 2))
		{
			System.err.println("You were required to enter 1 or 2. \n I'm afraid that you might "
					+ "have a terrible experience with this program if you can't follow instructions.");
		}
		
	//	System.out.println("Enter numeric key to encrypt message:  \n" );
		
		
		System.out.println("You can copy the decrypted/encrypted text, then run the program again \n "
				+ "Compare to your original text.");
		int response = scn.nextInt();
		
		
		
				
			
			
		
	}}
