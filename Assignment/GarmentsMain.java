//Question 08
import java.io.*;
class Garments
{
	String Code, Type, Fabric;
	Integer Size;
	Double Price;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Garments()
	{
		Code = "NOT ALLOTED";
		Type = "NOT ALLOTED";
		Fabric = "NOT ALLOTED";
		Size = 0;
		Price = 0.0;
	}
	void Input()throws IOException
	{
		System.out.print("Enter Item Code: ");
		Code = br.readLine();
		System.out.print("Enter Item Type: ");
		Type = br.readLine();;
		System.out.print("Enter Size of Item: ");
		Size = Integer.parseInt(br.readLine());
		System.out.print("Enter Type of Fabric: ");
		Fabric = br.readLine();
		Assign();
	}
	void Assign()
	{
		if(Fabric.equals("COTTON"))
		{
			if (Type.equals("TROUSER"))
			{
				Price = 1300.0;
			}
			if (Type.equals("SHIRT"))
			{
				Price = 1100.0;
			}
		}
		else
		{
			if (Type.equals("TROUSER"))
			{
				Price = (1300 * 0.9);
			}
			if (Type.equals("SHIRT"))
			{
				Price = (1100 * 0.9);
			}
		}
	}
	void Display()
	{
		System.out.println("OUTPUT: ");
		System.out.println("Code:" + Code);
		System.out.println("Type: " + Type);
		System.out.println("Size: " + Size);
		System.out.println("Fabric: " + Fabric);
		System.out.println("Price: " + Price);
	}
}
class GarmentsMain
{
	public static void main(String arg[])throws IOException
	{
		Garments obj = new Garments();
		obj.Input();
		obj.Display();
	}
}