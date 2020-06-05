//Bank Account

import java.io.*;
class BankAcc
{
	int accNumber;
	double add, sub, currentBal;
	String name, address, accType;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BankAcc()
	{
		name = ("null");
		currentBal = 0;
	}

	BankAcc(int accNumber1)throws IOException
	{	
		accNumber = accNumber1;
		System.out.print("Enter Name: ");
		name = br.readLine();
		System.out.print("Enter Address: ");
		address=br.readLine();
		System.out.print("Enter Type of Account: ");
		accType=br.readLine();
		System.out.print("Enter Current Balance: ");
		currentBal=Double.parseDouble(br.readLine());
	}

	void Deposit(int add)
	{
		currentBal = currentBal + add;
		GetBalance();
	}

	void WithDraw(int sub)
	{
		if(sub>currentBal)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			currentBal = currentBal - sub;
		}
		GetBalance();
	}

	void GetBalance()
	{
		System.out.println("Your Current Balance: " + currentBal);
	}

	void Details()
	{
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + accNumber);
		System.out.println("Account Type: " + accType);
		System.out.println("Address: " + address);
		System.out.println("Balance: " + currentBal);
	}
}
class BankAccMain
{
	public static void main(String arg[])throws IOException
	{
		String ch;
		int sub, add, accNumber1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("__________________________________________________________________________________");
		System.out.print("Enter your Account number:");
		accNumber1 = Integer.parseInt(br.readLine());;
		BankAcc obj = new BankAcc(accNumber1);
		do
		{
			int a, option;
			double b;
			System.out.println("__________________________________________________________________________________");
			System.out.println("1: Details");
			System.out.println("2: Check Balance");
			System.out.println("3: With Draw Balance");
			System.out.println("4: Deposit");
			System.out.println("__________________________________________________________________________________");
			System.out.println("Your Choice: ");
			option = Integer.parseInt(br.readLine());
			System.out.println(" ");
			switch (option)
			{
				case 1:
				obj.Details();
				break;

				case 2:
				obj.GetBalance();
				break;

				case 3:
				System.out.println("WithDraw Amount: ");
				sub = Integer.parseInt(br.readLine());
				obj.WithDraw(sub);
				break;

				case 4:
				System.out.println("Deposit Amount: ");
				add = Integer.parseInt(br.readLine());
				obj.Deposit(add);
				break;

				default:
				System.out.println(" Invalid Input");
			}
			System.out.println(" ");
			System.out.print("Want to Continue? Y/N: ");
			ch = br.readLine();
		}while(ch.equals("Y")||ch.equals("y"));
	}
}