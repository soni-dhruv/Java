//Abstract Class Overiding 
//Area and perimeter of Circle
import java.io.*;
abstract class Area
{
	
	
	void CArea(double r)
	{
		System.out.println("Area: "+(3.14*r*r));
	}
	
}

class Perimeter extends Area
{
	void CPerimeter(double r)
	{
		super.CArea(r);
		System.out.println("Perimeter: "+(6.23*r));
	}
	
}
class AbstractClass3
{
public static void main (String args[])throws IOException
	{
		double r;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Radius: ");
		r = Double.parseDouble(br.readLine());
		Perimeter p = new Perimeter();
		p.CPerimeter(r);
	}
}