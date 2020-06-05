//Single Inheritence

import java.io.*;

class A
{
	void show()
	{
		System.out.println("Parent Class");
	}
}

class B extends A
{
	void output()
	{
		System.out.println("Child Class");
	}
}

class Inheritence1
{
	public static void main(String arg[])throws IOException
	{
		B obj = new B();
		obj.show();
		obj.output();
	}
}