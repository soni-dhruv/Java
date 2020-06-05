//Exception Handling 1
//wap to display arithmatical exception error and array index out of Bound exception with the help of multicatch block
//14 March 2

import java.io.*;
class ExceptionHandling1
{
	public static void main(String arg[])throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a, b, c;
			System.out.println("Enter 2 numbers: ");
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			System.out.println("A/b: " + (a/b));
			c = Integer.parseInt(arg[0]);
			System.out.println("Multiply: " + (a*c));
		}

		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}

		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}