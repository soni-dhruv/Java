//Assignment Q2

import java.io.*;
class Tour
{
	private String TCode;
	private int NoofAdults, NoofKids, Kilometres;
	private float TotalFare;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Tour()
	{
		TCode="NULL";
		NoofAdults=0;
		NoofKids=0;
		Kilometres=0;
		TotalFare=0;
	}
	void AssignFare()
	{
		if(Kilometres>=1000)
		{
			TotalFare=(500*NoofAdults)+(250*NoofKids);
		}

		if((Kilometres<1000)&&(Kilometres>=500))
		{
			TotalFare=(300*NoofAdults)+(150*NoofKids);
		}

		if(Kilometres<500)
		{
			TotalFare=(200*NoofAdults)+(100*NoofKids);
		}
	}
	void Input()throws IOException
	{
	System.out.println("Enter trip Code");
	TCode=br.readLine();
	System.out.println("Enter distance of trip in Kilometres");
	Kilometres=Integer.parseInt(br.readLine());
	System.out.println("Enter Number of Adults");
	NoofAdults=Integer.parseInt(br.readLine());
	System.out.println("Enter Number of Kids");
	NoofKids=Integer.parseInt(br.readLine());
	AssignFare();
	}
	
	void display()
	{
	System.out.println("Trip Code is "+TCode);
	System.out.println("Total Fare is "+TotalFare);
	}
}
class as2
{
public static void main (String args[])throws IOException
{
Tour obj=new Tour();
obj.Input();
obj.display();
}
}