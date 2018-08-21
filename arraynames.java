package rossi1;

import java.io.*;
public class arraynames 
{
public static void main(String args[])throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String db[] = {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","Kity","Meery","Smith","Johnson","Bill","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
	System.out.println("Enter the name to be searched");
	String str = br.readLine();
	int ct=0;
	for(int i=0;i<db.length;i++)
	{
		if(str.equalsIgnoreCase(db[i]))
		{
			ct++;
		}
	}
		if(ct>0)
		{
			System.out.println("Name found");
			System.out.println("Enter number of occourances" + ct);
		}
		else
		
			System.out.println("Name not found");
		}
	}
	





