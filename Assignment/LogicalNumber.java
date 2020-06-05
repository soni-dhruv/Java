//Logical Number
package PG2020;
public class LogicalNumber
{
	public void Prime(int a)
	{
		
		int c=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");	
		}	
	}
	public void Automorphic(int a)
	{
		int b = a * a;
		if ((b % 10 == a) || (b % 100 == a) || (b % 1000 == a))
		{
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("Not an Automorphic Number");
		}
	}
	public void Armstrong(int a)
	{
		int c=a,r,b;
		for(b=0;c>0;c=c/10)
		{
		r=c%10;
		b=b+(r*r*r);
		}
		if(a==b)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
	public void Palindrome(int a)
	{
		int c=a;
		int b=0;
		for(int r;a>0;a=a/10)
		{
			r=a%10;
			b=(b*10)+r;
		}

		if(b==c)
		{
			System.out.println("Palindrome Number");
		}

		else
		{
			System.out.println("Not a Palindrome Number");	
		}
	}
	public void Spy(int a)
	{
		int c=0,b=1;
		for(int r;a>0;a=a/10)
		{
			r=a%10;
			b=b*r;
			c=c+r;
		}	
		if(b==c)
		{
		System.out.println("Spy Number");	
		}
		else
		{
			System.out.println("Not Spy number");
		}
	}
	public void Niven(int a)
	{
		int c = a;
		int b=0;
		for (int r; a > 0; a = a / 10)
		{
			r = a % 10;
			b = b + r;
		}
		if (c % b == 0)
		{
			System.out.println("Niven Number");
		}
		else
		{
			System.out.println("Not Niven Number");
		}
	}
	public void Happy(int a)
	{
		int b,c=a;
		for(;(c>1)&&(c!=4);a=c)
		{
		b=0;
		for(int r;a>0;a=a/10)
		{
			r=a%10;
			b=b+(r*r);
		}
		c=b;
		if(c==1)
		System.out.println("Happy Number");
		else if(c==4)
		System.out.println("Not a Happy Number");
		}	
	}
	public void Magical(int a)
	{
		int c=a,b,d,r;
		for(b=0,d=1;a>0;a=a/10)
			{
			r=a%10;
			b=b+r;
			d=d*r;
			}
		if((b+d)==c)
		{
			System.out.println("Magical Number");
		}
		else
		{
			System.out.println("Not a Magical Number");
		}
	}
	public void Neon(int a)
	{
		int c=a*a,b,r;
		for(b=0;c>0;c=c/10)
		{
			r=c%10;
			b=b+r;
		}
		if(b==a)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a Neon Number");
		}
	}
	public void Perfect(int a)
	{
		int b=a,c=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				c=c+i;
			}
		}
		if(c==b)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}
	}
	public void Buzz(int a)
	{
		if((a%10==7)||(a%7==0))
		{
			System.out.println("Buzz Number");
		}

		else
		{
			System.out.println("Not a Buzz Number");	
		}
	}
}