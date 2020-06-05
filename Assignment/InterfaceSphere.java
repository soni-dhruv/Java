//Question 10
import java.io.*;
interface volume
{
	public void volume_sphere(double r);
}
interface area
{
	public void area_sphere(double r);
}
class InterfaceSphere implements volume,area
{
	public void volume_sphere(double r)
	{
		System.out.println("Volume of Sphere: "+(1.33*3.14*r*r*r));
	}
	public void area_sphere(double r)
	{
		System.out.println("Area of Sphere: "+(4*3.14*r*r));
	}	
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		InterfaceSphere obj=new InterfaceSphere();
		double r;
		System.out.print("Enter the radius: ");
		r=Double.parseDouble(br.readLine());
		obj.volume_sphere(r);
		obj.area_sphere(r);
	}
}
