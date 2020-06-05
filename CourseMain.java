//Course
import java.io.*;
class Course
{
	String CNAME;
	float fees, score;
	int REGNO;

	Course()
	{
		REGNO = 0;
		fees = 0;
		score = 0;
	}

	void Input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Course Name: ");
		CNAME = br.readLine();
		System.out.println("Enter Score: ");
		score = Float.parseFloat(br.readLine());
		calculate();
	}

	void calculate()
	{
		if(score>=9.0 && score<=10.0)
		{
			if(CNAME.equals("Clinical Psychology"))
			{
				fees = 10000;
			}
			if(CNAME.equals("Corporate Counseling"))
			{
				fees = 8000;
			}
		}

		if(score>=8.0 && score<9.0)
		{
			if(CNAME.equals("Corporate Psychology"))
			{
				fees = 7000;
			}
			if(CNAME.equals("Guidance and Counseling"))
			{
				fees = 6000;
			}
		}

		if(score>=5.0 && score<8.0)
		{
			if(CNAME.equals("Guidance and Counseling"))
			{
				fees = 6000;
			}
		}

		if(score<5.0)
		{
			CNAME = "Not Elegible";
		}
	}

	void display()
	{
		System.out.println("Course Name: " + CNAME);
		System.out.println("FEES: " + fees);
	}
}
class CourseMain
{
	public static void main(String arg[])throws IOException
	{
		Course obj = new Course();
		obj.Input();
		obj.display();		
	}
}