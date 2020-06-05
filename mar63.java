//Abstract Class Overiding 2
import java.io.*;
class add
{
	
	
	void func(int a, int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	
}

class sub extends add
{
	void func(int a, int b)
	{
		super.func(a,b);
		System.out.println("Substraction is "+(a-b));
	}
	
}
class mar63
{
public static void main (String args[])throws IOException
{
sub ob=new sub();
ob.func(10,20);	
}
}