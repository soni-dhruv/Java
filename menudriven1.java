//wap to display factor, factorial of entered number using menu driven and user friendly in const overloading 

import java.io.*;
class calc
{
	calc(int a)
	{
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
	}

	calc(float b)
	{
		int c=1;
		for(int i=(int)b; i>0; i--)
		{
			c = c * i;
		}
		System.out.println(c);
	}
}
class menudriven1
{
	public static void main(String arg[])throws IOException
	{
		String ch;
		do
		{
			int a, option;
			float b;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1 for Factor");
			System.out.println("2 for Factorial");
			System.out.println("__________________________________________________");
			option = Integer.parseInt(br.readLine());
			switch (option)
			{
				case 1: System.out.print("Enter Number for Factors: ");
				a = Integer.parseInt(br.readLine());
				calc obj = new calc(a);
				break;

				case 2: System.out.print("Enter Number for Factors: ");
				b = Float.parseFloat(br.readLine());
				calc obj1 = new calc(b);
				break;
			}
			System.out.print("Want to Continue? Y/N");
			ch = br.readLine();
		}while(ch.equals("Y")||ch.equals("y"));
	}
}