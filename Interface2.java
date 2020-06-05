//Interface 2
//wap to show entered no is happy no or not, spy or not using multiple inheritence

import java.io.*;
interface Spy
{
	public void spyf(int a);
}
interface Happy
{
	public void happyf(int a);
}
class Interface2 implements Spy, Happy
{
	public void spyf(int a)
	{
		int b=0,c=1;
		for(int r; a>0; a=a/10)
		{
			r=a%10;
			b=b+r;
			c=c*r;
		}

		if(b==c)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("NOT Spy Number");
		}
	}
	public void happyf(int a)
	{
		int b,c=a;
		for(;(c>1) && (c!=4); a=c)
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
	public static void main(String[] arg)throws IOException
	{
		int a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number: ");
		a = Integer.parseInt(br.readLine());
		Interface2 ob = new Interface2();
		ob.spyf(a);
		ob.happyf(a);
	}		
}