// Swapping vlaues without using third variable and commandline arguments.
public class  Swapp{
	public static void main(String args[]){
		// if user enter more then two values return message.
		if (args.length > 2 ){
			System.out.println("plz enter only two values !");
		}else{

			// inserting values using commandline argusments.
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			// Display before Swapping values of a and b. 
			System.out.println("BEFORE SWAPING values : ");
			System.out.println("A = " + a );
			System.out.println("B = " + b );
			
			// logic to swapp values .
			a = a + b ;
			b = a - b ;
			a = a - b ;
			
			// adding some space. 
			System.out.println("");

			// Display After Swapping values of a and b. 	
			System.out.println("AFTER SWAPING values : ");
			System.out.println("A = " + a );
			System.out.println("B = " + b );
	}	}
}	