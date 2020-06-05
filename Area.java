//wap to display area of circle , triangle in single inheritence

import java.io.*;

class A
{
	void circle(int r)
	{
		System.out.println("Area of Circle: " + (3.14 * r * r));
	}
}

class B extends A
{
	void triangle(int b, int h)
	{
		System.out.println("Area of Triangle: " + (0.5 * h * b));
	}
}

class Area
{
	public static void main(String arg[])throws IOException
	{
		int r, h, b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Radius : ");
		r = Integer.parseInt(br.readLine());
		System.out.print("Enter Base: ");
		b = Integer.parseInt(br.readLine());
		System.out.print("Enter Height: ");
		h = Integer.parseInt(br.readLine());
		B obj = new B();
		obj.circle(r);
		obj.triangle(b,h);
	}
}