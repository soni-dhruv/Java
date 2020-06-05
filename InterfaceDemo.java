//Interface 1
//InterfaceDemo

interface a
{
	public void add(int a, int b);
}
interface b
{
	public void sub(int a, int b);
}
class InterfaceDemo implements a,b
{
	public void add(int a, int b)
	{
		System.out.println("Addition: " + (a+b));
	}
	public void sub(int a, int b)
	{
		System.out.println("Subtraction: " + (a-b));
	}
	public static void main(String arg[])
	{
		InterfaceDemo ob = new InterfaceDemo();
		ob.add(20,30);
		ob.sub(50,10);
	}
}