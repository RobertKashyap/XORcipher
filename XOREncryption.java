import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
class XOREncryption 
{ 
	private static Scanner sc=new Scanner(System.in);
	private static String encryptDecrypt(String inputString,char xorKey) 
	{
		String outputString = ""; 
		
		int len = inputString.length(); 
		
		for (int i = 0; i < len; i++) 
		{ 
			outputString = outputString + 
			Character.toString((char) (inputString.charAt(i) ^ xorKey)); 
		}
		return outputString; 
	}
	private static String getFile(String p)throws Exception
	{
		String c="";
		FileReader fr=new FileReader(p);
		for(int i;(i=fr.read())!=-1;)
			c=c+(char)i;
		fr.close();
		return c;
	}
	private static void makeFile(String p,String c)throws Exception
	{
		FileWriter fw=new FileWriter(p);    
		fw.write(c);    
		fw.close();
	}
	// Driver code 
	public static void main(String args[])throws Exception
	{
		boolean run=true;
		String path;
		String raw;
		String processed;
		String output;
		char key;
		byte choice;
		while(run)
		{
			System.out.println("\t\t"+(char)11+"__~~ MENU ~~__");
			System.out.print("\t\t--------------");
			System.out.print("\n\n\t\t1.Encrypt\n\n\t\t2.Decrypt\n\n\t\t3.EXIT\n\nCHOOSE 1, 2 or 3 : ");
			choice=sc.nextByte();
			if(choice==1||choice==2)
			{
				System.out.println("\nEnter the path to the file:"+(char)11);
				path=sc.next();
				raw=getFile(path);
				System.out.print("\nEnter the encryption key : ");
				key=sc.next().charAt(0);
				System.out.print("\nEnter path for output file : ");
				output=sc.next();
				processed=encryptDecrypt(raw,key);
				if(choice==1)
					System.out.println("\nEncrypted file created SUCESSFULLY!!");
				else if(choice==2)
					System.out.println("\nDecrypted file created SUCESSFULLY!!");
				makeFile(output,processed);
			}
			else if(choice==3)
				run=false;
			else
			{
				System.out.println("\n\n\t__~~$$$ I N V A L I D-I N P U T $$$~~__");
			}
		}
	}
}


