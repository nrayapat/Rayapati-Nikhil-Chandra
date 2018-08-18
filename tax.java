package rossi1;
import java.io.*;
public class tax {
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
System.out.println("Enter the CTC");
int n = Integer.parseInt(br.readLine());
double tax=0;
if(n>0 && n<=180000)
{
	System.out.println("Nil: The caliculated tax is " + tax);
}
else if(n>180000 && n<=300000)
{
	tax = n * 0.1;
System.out.println("Slab A: The caliculated tax is " + tax);
}
else if(n>300000 && n<=500000)
{
	tax = n * 0.2;
System.out.println("Slab B: The caliculated tax is " + tax);
}
else if(n>500000 && n<=1000000)
{
	tax = n * 0.3;
System.out.println("Slab C: The caliculated tax is " + tax);
}
else
{
System.out.println("Enter the positive value");

}
}
}
