//Electric Bill
import java.io.*;
class ElectricBill
{
	String n;
	int units;
	double bill;

	ElectricBill()
	{
		n = "null";
		units = 0;
		bill = 0;
	}

	void Accept()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name: ");
		n = br.readLine();
		System.out.println("Enter Units: ");
		units = Integer.parseInt(br.readLine());
		calculate();
	}

	void calculate()
	{
		if(units>=0 && units<=100)
		{
			System.out.println("Bill: "+(units*2));
		}
		if(units>=101 && units<=300)
		{
			System.out.println("Bill: "+(((100*2)+((units-100)*3))));
		}
		if(units>300)
		{
			System.out.println("Bill: "+1.025*(((100*2)+(200*3)+((units-300)*5))));
		}
	}
}
class ElectricMainBill
{
	public static void main(String arg[])throws IOException
	{
		ElectricBill obj = new ElectricBill();
		obj.Accept();		
	}
}