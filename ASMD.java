//wap to display add sub mul div multi level inheritence

import java.io.*;

class A
{
	void add(int a, int b)
	{
		System.out.println("Addition : " + (a+b));
	}
}

class B extends A
{
	void sub(int a, int b)
	{
		System.out.println("Subtraction: " + (a-b));
	}
}

class C extends B
{
	void mul(int a, int b)
	{
		System.out.println("Area of Triangle: " + (a*b));
	}
}
class ASMD
{
	public static void main(String arg[])throws IOException
	{
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("Enter b: ");
		b = Integer.parseInt(br.readLine());
		C obj = new C();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
	}
}