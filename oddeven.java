//wap to display entered no is even or odd with para method

import java.io.*;
class check
{
	void add(int a)
	{
		if(a%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
class oddeven
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		check ab = new check();
		
		int a;
		System.out.println("Enter numbers:");
		a = Integer.parseInt(br.readLine());
		ab.add(a);
		
	}
}