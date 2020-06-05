//wap to check enter no is prime, niven, happy or not using heirarchal inheritance

import java.io.*;

class Prime
{
	int i, c;
	void Prime1(int num)
	{
		for(i=2; i<=num/2; i++)
		{
			if(i%num==0)
			{
				c++;
			}
		}
		if(c>0)
		{
			System.out.println("NOT Prime No");
		}
		else
		{
			System.out.println("Prime No");
		}	
	}
}

class Niven extends Prime
{
	void Niven1(int num)
	{
		int n, rem, sum=0;
		n = num;
		while(num > 0)
		{
			rem = num % 10;
			sum += rem;
			num /= 10; 
		}
		if(n%sum==0)
		{
			System.out.println("Niven Number");
		}
		else
		{
			System.out.println("NOT Niven Number");
		}
	}
}

class Happy extends Prime
{
	int Happy1(int num)
	{
		int rem = 0, sum = 0;
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + (rem * rem);
			num /= 10;
		}
		return sum;
	}
}

class PNH
{
	public static void main(String arg[])throws IOException
	{
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		num = Integer.parseInt(br.readLine());
		Niven ni = new Niven();
		ni.Niven1(num);
		ni.Prime1(num);
		Happy ha = new Happy();
		while(num!=1&&num!=4)
		num=ha.Happy1(num);
		if(num == 1)
		{
			System.out.println("Happy Number");
		}
		else if(num == 4)
		{
			System.out.println("NOT Happy Number");
		}
	}
}