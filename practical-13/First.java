public class First{
	static {
		System.out.println("Static Block Executed First.");
	}
	public static void main(String[] args){
		System.out.println("main method AFTER Executed static Block. ");
		First Demo = new First();
		System.out.println(Demo instanceof First);

	}
}