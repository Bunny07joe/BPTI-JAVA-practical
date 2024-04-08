class Checker{
	protected String name;
	Checker(String name){
		this.name = name;
		
	}
	void getter(){
		System.out.println("private and protected data is accesed " );
		System.out.println("name : " + this.name);
	}

}
public class Check{
	public static void main(String args[]){
		// creating object 
		Checker obj1 = new Checker("JOE");
		obj1.getter();
		
	}
}