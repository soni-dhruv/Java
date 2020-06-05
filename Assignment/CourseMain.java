//Question 7
import java.io.*;
class Course
{
	int REGNO;
	String CNAME;
	float Score, Fees;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Course()
	{
		REGNO=0;
		Score=0;
		Fees=0;
	}
	void Input()throws IOException
	{
		System.out.print("Enter Course Name: ");
		CNAME=br.readLine();
		System.out.print("Enter Registration No: ");
		REGNO=Integer.parseInt(br.readLine());
		System.out.print("Enter Score: ");
		Score=Float.parseFloat(br.readLine());
	}
	void SetCourse()
	{
		if(Score>=9.0 && Score<=10.0)
		{
			if(CNAME.equals("Clinical Psychology"))
			{
				Fees=10000;
			}
		}
		else if(Score>=8.0 && Score<9.0)
		{
			if(CNAME.equals("Corporate counselling"))
			{
				Fees=8000;
			}
		}
		else if(Score>=5.0 && Score<8.0)
		{
			if(CNAME.equals("Guidance and counseling"))
			{
				Fees=6000;
			}
		}
		else
		{
			CNAME="Not Eligible";
		}
	}
	void display()
	{
		System.out.println("Course Name: " + CNAME);
		System.out.println("Registration No: " + REGNO);
		System.out.println("Score=" + Score);
		SetCourse();
		System.out.println("Fees=" + Fees);
	}
}
class CourseMain
{
	public static void main(String arg[])throws IOException
	{
		Course ob=new Course();
		ob.Input();
		ob.display();
	}
}
