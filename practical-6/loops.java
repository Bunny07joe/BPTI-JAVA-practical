// creating loops 
public class loops{
	public static void main(String[] arg){
		System.out.println("");
		String[] array = new  String[] {"Monday", "Tuseday", "Wednesday", "Thusday", "Friday", "Saturday", "Sunday"};
		System.out.print("All Day Names");

		// for loop 
		System.out.println("");
		System.out.println("using for loop ");
		System.out.println("");
		int len = array.length;
		for(int i = 0; i <= len-1; i++){
			System.out.println(array[i]);
		}

		// while loop
		System.out.println("");
		System.out.println("using while loop ");
		int i = 1;
		while(i <= len-1){
			System.out.println(array[i]);
			i++;

		}

		// do-while
		System.out.println("");
		int pointer = 1;
		System.out.println("using do-while lopp");
		do{
			System.out.println(array[pointer]);
			pointer++;
		}while(pointer <= len-1);
	}
}