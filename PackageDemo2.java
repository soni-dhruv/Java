import java.io.*;
import PG2020.AreaVolume;

class PackageDemo2
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r, l, b, h;
		AreaVolume ar = new AreaVolume();

		System.out.print("Enter radius for Area of Circle: ");
		r = Double.parseDouble(br.readLine());
		ar.areaCircle(r);

		System.out.print("Enter Base and Height for Area of Triangle: ");
		b = Double.parseDouble(br.readLine());
		h = Double.parseDouble(br.readLine());
		ar.areaTriangle(b, h);

		System.out.print("Enter Length and Breadth for Area of Rectangle: ");
		l = Double.parseDouble(br.readLine());
		b = Double.parseDouble(br.readLine());
		ar.areaRectangle(l, b);

		System.out.print("Enter radius for Area of Sphere: ");
		r = Double.parseDouble(br.readLine());
		ar.areaSphere(r);

		System.out.print("Enter Radius for Perimeter of Circle: ");
		r = Double.parseDouble(br.readLine());
		ar.volumeCircle(r);

		System.out.print("Enter Radius for Volume of Sphere: ");
		r = Double.parseDouble(br.readLine());
		ar.volumeSphere(r);
	}
}