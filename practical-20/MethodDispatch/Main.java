class Parent{
	void Display(){
		System.out.println("parent's Method Display");
	}
}
class Childs extends Parent {
	void Display(){
		System.out.println("Child'  method Display");
	}
}
public class Main{
	public static void main(String args[]){
		System.out.println("Dynammic method Dispatch");
		Parent parent = new Childs();
		parent.Display();
	}
}