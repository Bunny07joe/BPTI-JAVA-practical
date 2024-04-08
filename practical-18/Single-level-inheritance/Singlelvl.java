class A{
	int value = 0;
	void dataupdated(){
		value += 10; // upadated value 
	}
}
// using extend keyword we can inheritance all property from class A
class B extends A{

	void dataupaded(){
		value += 20; // overide method 
	}

}
public class Singlelvl{
	
	public static void main(String args[]){
		B upadation = new B();
		upadation.dataupaded();
		System.out.println("new value is = " + upadation.value);
	}
}
