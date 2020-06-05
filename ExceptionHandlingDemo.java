//Exception Handling Demo TRY CATCH
//14 March 2

import java.io.*;
class ExceptionHandlingDemo
{
	public static void main(String arg[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a, b;
			System.out.println("Enter 2 numbers: ");
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			System.out.println("A/b: " + (a/b));
		}
		catch(IOException e1)
		{
			System.out.println("e1");
		}	
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 ERROR: " + e);
		}
	}
}