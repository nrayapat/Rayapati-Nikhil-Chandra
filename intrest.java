package rossi1;
import java.io.*;
public class intrest
{
	void simple(double p, double r,double t)
	{
		double i = (p*t*r)/100;
		System.out.println("The simple Intrest is" +i);
	}
void compound(double p, double r,double t)
{
double i =p * Math.pow((1 + r*0.01), t);
i=i-p;
.println("The compound Intrest is" +i);
System.out

}
}
