//wap to display add of two nos using default method

import java.io.*;
class add1
{
	void add(int a, int b)
	{	
		System.out.println("Addition: "+ (a+b));
	}
	void sub(int a, int b)
	{
		System.out.println("Substraction: "+ (a-b));
	}
}
class Addition1
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		add1 ab = new add1();
		
		int a,b;
		System.out.println("Enter 2 numbers to ADD:");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		ab.add(a,b);
		System.out.println("Enter 2 numbers to Substract:");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		ab.sub(a,b);
	}
}