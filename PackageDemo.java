import java.io.*;
import PG2020.AreaVolume;

class PackageDemo
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		ArithDemo ar = new ArithDemo();
		System.out.print("Enter value for Addition: ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		ar.add(a, b);
		System.out.print("Enter value for Subtraction: ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		ar.sub(a, b);
		System.out.print("Enter value for Multiplication: ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		ar.multiply(a, b);
		System.out.print("Enter value for Division: ");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		ar.divide(a, b);
	}
}