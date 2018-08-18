package rossi1;
import java.io.*;

public class monthname
{
public static void main(String[] args) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int l, y, d, m;
String dd, mm, yy;
int maxdays[]= {0,31,28,31,30,31,30,31,30,31,30,31};
String month[] = {" ","January","Febrauary","March","April","May","June","July","August","September","October","November","December"};
System.out.println("Enter any date in 8 digits (ddmmyyyy) format: ");
String date=br.readLine();
l=date.length();
if(l==8)
{
	dd = date.substring(0,2);
	mm = date.substring(2,4);
	yy = date.substring(4);
	d = Integer.parseInt(dd);
	m = Integer.parseInt(mm);
	y = Integer.parseInt(yy);
	if(m<0 || m>12 || d<0 ||d>maxdays[m] || y<0 || y>9999)
		
	{
		System.out.println("The day, month or year areoutside acceptance limit");
		
	}
	else
	{
		System.out.println("Date in dd,month name,yyyy format ="+dd+"/"+mm+"/"+yy);
		System.out.println("Date in dd, month name, yyyy format = "+dd+" "+month[m]+","+yy);

	}
	
	
}
}
}
