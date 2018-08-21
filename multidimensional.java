package rossi1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class multidimensional {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows");
		int m = Integer.parseInt(br.readLine());
		System.out.println("Enter the number of coloumns");
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[m][n];
		System.out.println("Enter the element of the array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Enter the value to be searched");
		int elem = Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(elem==arr[i][j])
				{
					System.out.println("Element found at index = " +i+ ","+j);
					System.exit(0);
				}
	}
		}
		System.out.println("Number not found");
}
}