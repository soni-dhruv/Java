//Book Fair
import java.io.*;
class BookFair
{
	String bName;
	double price;

	BookFair()
	{
		bName = "null";
		price = 0;
	}

	void Input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Book Name: ");
		bName = br.readLine();
		System.out.println("Enter Price: ");
		price = Integer.parseInt(br.readLine());
		calculate();
	}

	void calculate()
	{
		if(price>=0 && price<=1000)
		{
			price = price * 0.98;
		}
		if(price>1000 && price<=3000)
		{
			price = price * 0.9;
		}
		if(price>3000)
		{
			price = price * 0.85;
		}
	}

	void display()
	{
		System.out.println("Book Name: " + bName);
		System.out.println("Book Price: " + price);
	}
}
class MainBookFair
{
	public static void main(String arg[])throws IOException
	{
		BookFair obj = new BookFair();
		obj.Input();
		obj.display();		
	}
}