import java.util.*;
class XOREncryption 
{ 
	// The same function is used to encrypt and 
	// decrypt 
	static String encryptDecrypt(String inputString) 
	{
		char xorKey = 'P'; 
		
		String outputString = ""; 
		
		int len = inputString.length(); 
		
		for (int i = 0; i < len; i++) 
		{ 
			outputString = outputString + 
			Character.toString((char) (inputString.charAt(i) ^ xorKey)); 
		} 
		
		System.out.println(outputString); 
		return outputString; 
	} 
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		String sampleString = "Robert is a sweet guy"; 
		
		// Encrypt the string 
		System.out.println("Encrypted String"); 
		String encryptedString = encryptDecrypt(sampleString); 
		
		// Decrypt the string 
		System.out.println("Decrypted String"); 
		encryptDecrypt(encryptedString); 
	} 
} 

