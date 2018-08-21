package rossi1;
import java.io.*;
public class palincnt
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[10];
		String pal_str[] = new String[10];
		int j=0;
		for(int i = 0; i<10; i++)
		{
			System.out.println("Enter String number " + (i+1));
			str[i] = br.readLine();
		}
		palincnt obj = new palincnt();
		for(int i = 0; i<10; i++)
		{
			String str_rev = obj.rev(str[i]);
			if(str[i].equals(str_rev))
			{
				pal_str[j]=str[i];
				j++;
			}
		}
		