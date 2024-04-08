// use of if-else switch statement
import java.util.Scanner;
public class statement{
	public static void main(String[] arg){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number check odd or even : ");
		int a = sc.nextInt();

		if ( a % 2 != 0){
			System.out.println("The number is odd ");
		}
		else{ 
			System.out.println("The number is Even ");
		}
		System.out.print("Enter the day number : ");
		int day =  sc.nextInt();
		switch (day){
			case (1):
				System.out.println("name of weak of day is monday");
				break;
			case (2):
				System.out.println("name of weak of day is tuseday");
				break;
			case (3):
				System.out.println("name of weak of day is wednesday");
				break;
			case (4):
				System.out.println("name of weak of day is thusday");
				break;
			case (5):
				System.out.println("name of weak of day is friday");
				break;
			case (6):
				System.out.println("name of weak of day is saturday");
				break;
			case (7):
				System.out.println("name of weak of day is sunday");
				break;
			default:
				System.out.println("number is out of the range !!");

			}
			
		sc.close();
		
	}
}
