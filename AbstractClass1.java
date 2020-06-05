//Abstract class OverRiding
import java.io.*;
abstract class Sample //object cannot be created and abstract key word is necessary
{
	abstract void show();
}
class AbstractClass1 extends Sample
{
	void show()
		{
			System.out.println("Child Class");
		}
	public static void main(String[] arg)
	{
		
		AbstractClass1 obj = new AbstractClass1();
		obj.show();
	}
}
[Finished in 1.5s]