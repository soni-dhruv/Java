//Question 9
import java.io.*;
class Circle
{
	public void areac(int r)
	{
		System.out.println("Area of Circle: " + (3.142 * r * r));
	}
}
class Triangle extends Circle
{
	public void areat(int b, int h)
	{
		System.out.println("Area of Triangle: " + (0.5 * b * h));
	}
}
class Rectangle extends Circle
{
	public void arear(int l, int b)
	{
		System.out.println("Area of Rectangle: " + (l * b));
	}
}
class AreaMain
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		Triangle ob = new Triangle();
		Rectangle ob1 = new Rectangle();
		int r, b, h, l, b2;
		System.out.print("Enter Radius of Circle: ");
		r = Integer.parseInt(br.readLine());
		ob.areac(r);
		System.out.print("Enter Base and Height: ");
		b = Integer.parseInt(br.readLine());
		h = Integer.parseInt(br.readLine());
		ob.areat(b, h);
		System.out.print("Enter Length and Breadth: ");
		l = Integer.parseInt(br.readLine());
		b2 = Integer.parseInt(br.readLine());
		ob1.arear(l, b2);
	}
}