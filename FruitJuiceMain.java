//Fruit Juice
import java.io.*;	

class FruitJuice
{
	double productPrice;
	int packSize, productCode;
	String productFlavour, packType;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	FruitJuice()
	{
		productCode = 0;
		packSize = 0;
		productPrice = 0;
		productFlavour = "";
		packType = "";
	}

	void input()throws IOException
	{
		System.out.print("Enter Product Code: ");
		productCode = Integer.parseInt(br.readLine());
		System.out.print("Enter Product Flavour: ");
		productFlavour = br.readLine();
		System.out.print("Enter Pack Type: ");
		packType = br.readLine();
		System.out.print("Enter Pack Size: ");
		packSize = Integer.parseInt(br.readLine());
		System.out.print("Enter Product Price: ");
		productPrice = Double.parseDouble(br.readLine());
		discount();
	}

	void discount()
	{
		productPrice = productPrice * 0.9;
	}

	void display()
	{
		System.out.println("Product Code: " + productCode);
		System.out.println("Product Flavour: " + productFlavour);
		System.out.println("Pack Type: " + packSize);
		System.out.println("Pack Size: " + packSize);		
		System.out.println("Product Price: " + productPrice);
	}
}

class FruitJuiceMain
{
	public static void main(String arg[])throws IOException
	{
		FruitJuice fj = new FruitJuice();
		fj.input();
		fj.display();
	}
}