// This is multi level inheritance
class Animal{
	void Eat(){
		System.out.println("Animal Eat Everythings.");
	}

}
class Cow extends Animal{
	void Eat(){
		System.out.println("Cow Only Eat Grass.");
	}
}
class Tiger extends Animal{
	void Eat(){
		System.out.println("Tiger Only Eat Meat.");
	}
}
public class Multilvl{
	public static void main(String args[]){
		Cow Food = new Cow();
		Tiger Food1 = new Tiger();
		Food.Eat();
		Food1.Eat();
	
	}
}