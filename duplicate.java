package rossi1;
import java.io.*;
public class duplicate
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String: ");
		String input = br.readLine();
		String output = new String();
		char b;
		for(int i=0;i<input.length();i++)
		{
			b = input.charAt(i);
			if(b!=' ')
			{
				output=output+b;
				input=input.replace(b,' ');
			}
		}
		System.out.println(output);
	}

}
