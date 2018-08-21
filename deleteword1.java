package nikhil2;
import java.io.*;
public class deleteword1 
{
	public static void main(String args[])throws IOException
	{
		int i,j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("give the input");
		String s = br.readLine();
		String word[]=s.split(" ");
		int x = word.length;
		for(i=0;i<x;i++)
		{
			if(word[i]!=null)
			{
				for(j=i+1;j<x;j++)
				{
					if(word[i].equals(word[j]))
					{
						word[j]=null;
					}
				}
			}
		}
		for(int k=0;k<x;k++)
		{
			if(word[k]!=null)
			{
				System.out.print(word[k]+' ');
			}
		}
		
	}
}

