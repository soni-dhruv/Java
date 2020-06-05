//Question 1
import java.io.*;

class BookFair
{
	String bName;
	double price;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	BookFair()    //Constructor
	{
		bName = "";
		price = 0;
	}

	void Input()throws IOException
	{
		System.out.print("Book Name: ");
		bName = br.readLine();
		System.out.print("Book Price: ");
		price = Double.parseDouble(br.readLine());
		Calculate();
	}

	void Calculate()
	{
		if(price<=1000)
			price = price * 0.98;
		else if(price>1000 && price<=3000)
			price = price * 0.90;
		else
			price = price * 0.85;
	}

	void Display()
	{
		System.out.println("OUTPUT:");
		System.out.println("Book Name  : " + bName);
		System.out.println("Book Price : " + price);
	}
}
class BookFairMain
{
	public static void main(String[] args)throws IOException
	{
		BookFair bf = new BookFair();
		bf.Input();
		bf.Display();
	}
}