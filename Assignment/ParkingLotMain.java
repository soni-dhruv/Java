//Question 3
import java.io.*;
class ParkingLot
{
	Integer vNo, hours;
	double bill;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void Input()throws IOException
	{
		System.out.print("Enter Vehicle Number: ");
		vNo = Integer.parseInt(br.readLine());
		System.out.print("Enter Hours: ");
		hours = Integer.parseInt(br.readLine());
		Calculate();
	}
	void Calculate()
	{
		
		bill = (((hours - 1) * 1.5) + 3);
	}
	void Display()
	{
		System.out.println("OUTPUT:");
		System.out.println("Vehicle Number: " + vNo);
		System.out.println("Number of Hour(s): " + hours);
		System.out.println("Parking Bill: " + bill);
	}
}
class ParkingLotMain
{
	public static void main(String[] args)throws IOException
	{
		ParkingLot pl = new ParkingLot();
		pl.Input();
		pl.Display();
	}
}