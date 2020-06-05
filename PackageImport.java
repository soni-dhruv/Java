//wap to display entered no is perfect no or not, niven and buzz with help of menu drive and user friendly
//14 March 1
import java.io.*;
import PG2020.LogicalNumbers;

class PackageImport
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ch;
		do
		{
			int option, number;
			System.out.println("_______________________________________________");
			System.out.println("Press:");
			System.out.println("1 for Perfect Number");
			System.out.println("2 for Niven Number");
			System.out.println("3 for Buzz Number");
			System.out.print("Your Choice: ");
			option = Integer.parseInt(br.readLine());
			LogicalNumbers ln = new LogicalNumbers();
			switch(option)
			{
				case 1:
				System.out.println("Enter Number for Perfect Number: ");
				number = Integer.parseInt(br.readLine());
				ln.Perfect(number);
				break;

				case 2:
				System.out.println("Enter Number for Niven Number: ");
				number = Integer.parseInt(br.readLine());
				ln.Niven(number);
				break;

				case 3:
				System.out.println("Enter Number for Buzz Number: ");
				number = Integer.parseInt(br.readLine());
				ln.Buzz(number);
				break;

				default:
				System.out.println("Invalid Input");

			}
			System.out.println("Want to Continue? Y/N: ");
			ch = br.readLine();
		}while(ch.equals("Y") || ch.equals("y"));
	}
}