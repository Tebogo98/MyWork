
public class CaeserCipher {

	protected char[] encoder = new char[26];
	protected char[] decoder = new char[26];
	
	public CaeserCipher(int rotation)
	{
		for(int i= 0; i < 26; i++)
		{
			encoder[i] = (char) ('A' + (i + rotation) % 26);
			decoder[i] = (char) ('A' + (i - rotation % 26));		
		}
	}
	
	private String Transform(String msg, char[] code)
	{
		char[] message = msg.toCharArray();
		for(int i=0; i < message.length; i++)
		{
			message[i] = Character.toUpperCase(message[i]);
			if(Character.isUpperCase(message[i]))
			{
				int j = message[i] - 'A';
				message[i] = code[j];
			}
		}
		return new String(message);
	}
	
	public String encrypt(String message)
	{
		return Transform(message, encoder);
	}
	
	public String decrypt(String message)
	{
		return Transform(message, decoder);
	}
}
