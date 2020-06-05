//WAP to display atm using menu driven concept in constructor overloading and user friendly

import java.io.*;
class Account
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name,a_type,address;
	long account;
	double balance,amt;

	Account()
	{
		name=("null");
		account=0;
		balance=0;
	}
	Account(long acc)throws IOException
	{
		account=acc;
		System.out.println("Enter name of Account Holder");
		name=br.readLine();
		System.out.println("Enter address of Account Holder");
		address=br.readLine();
		System.out.println("Enter type of Account");
		a_type=br.readLine();
		System.out.println("Enter Current Balance of Account");
		balance=Double.parseDouble(br.readLine());
	}
	void Deposit()throws IOException
	{
		System.out.println("Enter amount to be deposited");
		balance=Double.parseDouble(br.readLine())+balance;
		System.out.println("Your updated balance is Rs."+balance);
	}
	void Withdraw()throws IOException
	{
		System.out.println("Enter amount to be withdrawn");
		amt=Double.parseDouble(br.readLine());
		if(amt>=balance)
		{
		System.out.println("Insufficient funds in account");	
		}
		else
		{
		balance=balance-amt;
		System.out.println("Your updated balance is Rs."+balance);
		}
	}
	void Get_Balance()
	{
		System.out.println("Your balance is Rs."+balance);	
	}

}
class feb237
{
	public static void main (String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String y;
		long acc;
		System.out.println("Enter your account number");
		acc=Long.parseLong(br.readLine());
		Account obj=new Account(acc);
		do
		{
			int ch;
			System.out.println("Make a choice\n1. Deposit\n2. Withdraw\n3. Check Balance");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
				obj.Deposit();
				break;

				case 2:
				obj.Withdraw();
				break;	

				case 3:
				obj.Get_Balance();
				break;	

			}
			System.out.println("Do you wish to Continue?y/n");
			y=br.readLine();
		}while((y.equals("y"))||(y.equals("Y")));
	}
}