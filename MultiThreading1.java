//Multi Threading 1
//Sleep()

import java.io.*;
class A extends Thread
{
	public void show()throws InterruptedException
	{
		for(int i=0; i<5; i++)
		System.out.println("i: " + i);
		Thread.sleep(2000);
	}
}
class B extends Thread
{
	public void output()throws InterruptedException
	{
		for(int j=0; j<20; j++)
		System.out.println("j: " + j);
		Thread.sleep(500);
	}
}
class MultiThreading1
{
	public static void main(String arg[])throws InterruptedException
	{
		A ob = new A();
		B obj = new B();
		ob.show();
		obj.output();
	}
}