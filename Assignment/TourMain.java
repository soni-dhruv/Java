//Question 2
import java.io.*;

class Tour
{
	private	String tCode;
	private Integer adults, kids, kms;
	private float totalFair;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Tour()
	{
		tCode = "NULL";
		adults = 0;
		kids = 0;
		kms = 0;
		totalFair = 0;
	}
	void Input()throws IOException
	{
		System.out.print("Enter Tour Code: ");
		tCode = br.readLine();
		System.out.print("Enter Number of Kilometers: ");
		kms = Integer.parseInt(br.readLine());
		System.out.print("Enter Number of Adults: ");
		adults = Integer.parseInt(br.readLine());
		System.out.print("Enter Number of Kids: ");
		kids = Integer.parseInt(br.readLine());
		AssignFare();
	}
	void AssignFare()
	{
		if(kms<500)
		{
			totalFair = ((adults * 200) + (kids * 100));
		}
		if(kms>=500 && kms<1000)
		{
			totalFair = ((adults * 300) + (kids * 150));
		}
		if(kms>=100)
		{
			totalFair = ((adults * 500) + (kids * 250));
		}
	}
	void Display()
	{
		System.out.println("OUTPUT:");
		System.out.println("Number of Kilometers: " + kms);
		System.out.println("Enter Number of Adults: " + adults);
		System.out.println("Enter Number of Kids: " + kids);
		System.out.println("Total Fair: " + totalFair);
	}
}
class TourMain
{
	public static void main(String[] args)throws IOException
	{
		Tour tr = new Tour();
		tr.Input();
		tr.AssignFare();
		tr.Display();
	}
}