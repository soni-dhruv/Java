//Multi Threading Demo
import java.io.*;
class thr extends Thread
{

	public void runf()throws Exception
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("i= "+i);
			Thread.sleep(500);
		}
	}
}
class MultiThreadingDemo extends Thread
{
	public void runf()throws Exception
	{
		for(int j=0;j<20;j++)
		{
			System.out.println("j= "+j);
		}
	}
	public static void main (String args[])throws Exception
	{
		MultiThreadingDemo obj=new MultiThreadingDemo();
		thr ob1=new thr();
		ob1.runf();
		obj.runf();
		obj.start();
		ob1.start();
	}
}