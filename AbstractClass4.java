//Abstract Class 4
//wap to define spy method as abstract method and find out all spy number between 1 to 1000 along with prime no

import java.io.*;
abstract class Niven
{
	abstract void Niven1();
}

class Prime extends Niven
{
	void Prime1()
	{

		int c, i, j;
		for(i = 1; i <= 1000; i++)
		{	
			c=0;
			for(j = 2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}			
			if(c==0)
			{

				System.out.print(i+"\t");
			}
		}
		System.out.println("");
	}
	
	void Niven1()
	{
		int sum=0, rem, num, i, j;
		for(i = 1; i <= 1000; i++)
		{sum=0;
			num = i;
			while(num>0)
			{
				rem = num % 10;
				sum += rem;
				num /= 10;
			}
			if(i%sum==0)
			{
				System.out.print(+i+"\t");
			}
		}
	}
	
}
class AbstractClass4
{
	public static void main (String args[])
	{
		Prime p = new Prime();
		System.out.println("Prime Numbers: ");
		p.Prime1();
		System.out.println("Niven Numbers: ");
		p.Niven1();
	}
}