//Multi Threading 2
//Interface

import java.io.*;
class A extends Thread implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0; i<5; i++)
			System.out.println("i: " + i);
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class B extends Thread implements Runnable
{
	public void run()
	{
		try
		{
			for(int j=0; j<10; j++)
			System.out.println("j: " + j);
			Thread.sleep(500);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}	
}
class MultiThreading2
{
	public static void main(String arg[])throws InterruptedException
	{
		A ob = new A();
		B obj = new B();
		ob.start();
		obj.start();
	}
}