public class Recursive{
	static int Factorial(int n){
		if (n == 1){
			return n;
		}else{
			return Factorial(n-1)*n;
		}
	}
	public static void main(String args[]){
		int fact = Factorial(5);
		System.out.println("Factorial = " + fact);
	}


}