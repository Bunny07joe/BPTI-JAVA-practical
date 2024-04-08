import  java.util.Scanner;
public class recusrsive{
	// making facktorial function
	public static int Fact(int n){
		if (n == 1){
			return n;
		}
		else{
			return Fact(n-1)*n;
		}
	}
	public static void main(String[] arg){
		// making facktorial number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt(); // user input 
		int result =  Fact(n); // calling that function;
		System.out.println("Factorial number is " + result);
		sc.close(); 
	}
}