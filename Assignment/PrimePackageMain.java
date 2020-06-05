import java.io.*;
import PG2020.LogicalNumber;
class PrimePackageMain
{
	public static void main (String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		LogicalNumber obj=new LogicalNumber();
		int a;
		System.out.print("Enter Number: ");
		a=Integer.parseInt(br.readLine());
		obj.Prime(a);
	}
}