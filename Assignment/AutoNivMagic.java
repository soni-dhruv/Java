//Question 6
import java.io.*;
import PG2020.LogicalNumber;
class AutoNivMagic
{
	public static void main (String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		LogicalNumber obj = new LogicalNumber();
		int a;
		System.out.print("Enter Number for Automorphic: ");
		a = Integer.parseInt(br.readLine());
		obj.Automorphic(a);
		System.out.print("Enter Number for Niven: ");
		a = Integer.parseInt(br.readLine());
		obj.Niven(a);
		System.out.print("Enter Number for Magical: ");
		a = Integer.parseInt(br.readLine());
		obj.Magical(a);
	}
}