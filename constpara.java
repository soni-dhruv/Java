//wap add 2 nos parameter const

import java.io.*;
class add
{
	add(int a, int b)
	{
		System.out.println("Addition is: " + (a+b));
	}
}
class constpara
{
	public static void main(String arg[])throws IOException
	{
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter numbers:");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		add ab = new add(a,b);
		//ab.add(a,b);
	}
}