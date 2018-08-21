package rossi1;
import java.util.Scanner;
public class missingno 
{
public static void main(String args[])
{
	Scanner in = new Scanner(System.in);
	int total;
	System.out.println("Enter the total numbers");
	int n = Integer.parseInt(in.nextLine());
	int array[]=new int[n];
	for(int i=0;i<array.length;i++)
	{
		array[i] = in.nextInt();
	}
	int x=array.length;
	total=(((x+1)*(x+2))/2);
	for(int i=0;i<x;i++)
	{
		total-=array[i];
	}
		System.out.println("missing number is" +total);
	
}
}
