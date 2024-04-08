abstract class Base{
	abstract void playbutton();// its just showing button play not body of method

}
class Instance extends Base{
	void playbutton(){
		System.out.println("Game is [STARTING..]");
	}

}
public class Abs{
	public static void main(String[] args){
		Instance instance = new Instance();
		instance.playbutton();
	}
}	