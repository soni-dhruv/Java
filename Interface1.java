//Interface 1
//wap to define volume of sphere and area with multiple inheritence

import java.io.*;
interface Volume
{
	public void volume1(double r);
}
interface Area
{
	public void area1(double r);
}
class Interface1 implements Volume, Area
{
	public void volume1(double r)
	{

		System.out.println("Volume: " + ((1.33*3.14)*r*r*r));
	}
	public void area1(double r)
	{

		System.out.println("Area: " + ((4*3.14)*r*r));
	}
	public static void main(String[] arg)throws IOException
	{
		double r;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Radius: ");
		r = Double.parseDouble(br.readLine());
		Interface1 ob = new Interface1();
		ob.volume1(r);
		ob.area1(r);
	}
}