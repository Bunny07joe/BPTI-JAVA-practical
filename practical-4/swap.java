//swaping value of two var without using tempary or other var 
import java.util.Scanner; // we have import module Scanner for user-input
public class swap{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in); // opening Scanner 

		System.out.print("Enter First Value : ");
		int First = sc.nextInt(); // taking user-input 
		System.out.print("Enter Second Value : ");
		int Second = sc.nextInt(); // taking user-input
		System.out.println("");
		
		System.out.println("Before swaping value of variables ");
		System.out.println("First var vlaue = " + First );
		System.out.println("Second var value  = " + Second );

		// swaping value 
		First = First ^ Second;
		Second = First ^ Second;
		First = First ^ Second;

		
		System.out.println("After swaping value of variables ");
		System.out.println("First var vlaue = " + First );
		System.out.println("Second var value  = " + Second );

		sc.close(); // closing Scanner

	}
}