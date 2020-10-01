
public class Encrypt_Decrypt {

	
	static CaeserCipher Cipher = new CaeserCipher(4);	
	
	public static String encryptText(String text, String Pin)
	{
		
		String key = "123";
		
				
		 if(key.equals(Pin)) {
			 return " Encrypted message: \n " + Cipher.encrypt(text) + "\n"; 
		
		
		 } else
		 {
			return "Numeric key is invalid, message cannot be encrypted \n";
		 }
	}
	
	public static String decryptText(String text, String Pin)
	{
		
		String key = "123";
		
				
		 if(key.equals(Pin)) {
			 return " Deciphed message: \n " + Cipher.decrypt(text) + "\n";

		 } else
		 {
			return "Numeric key is invalid, message cannot be decrypted \n";
		 }
	}

}
