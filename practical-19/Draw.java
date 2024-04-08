/*
Practical - 19
Develop a program with one class named shape which has two 
member functions named erase () and draw (). In the program we 
have three other subclasses: circle, triangle and square. override 
methods of the superclass into subclasses
*/

// Super class Shape
class Shape {
	
	void Erase(){
		System.out.println("Everything was erasing.");
	}
	
	void Draw(){
		System.out.println("i can draw everythings i want ! ");
	}
}

//First Subclass 
class Circle extends Shape{
	void Erase(){
		System.out.println("Erasing a previous Drawing.");
	}
	
	void Draw(){
		System.out.println("Drawing Circle sucessfully.");
	}

}

// Second subclass
class Triangle extends Shape{
	void Erase(){
		System.out.println("Erasing a previous Drawing.");
	}
	
	void Draw(){
		System.out.println("Drawing Triangle sucessfully.");
	}

} 

// third subclass
class Square extends Shape{
	void Erase(){
		System.out.println("Erasing a previous Drawing.");
	}
	
	void Draw(){
		System.out.println("Drawing Square sucessfully.");
	}

} 

public class Draw {
	public static void main(String args[]){
		//MAKING OBJECT FOR SQUARE.
		Square Pen = new Square();
		Pen.Draw();
		Pen.Erase();
		
		// NOW DRAW TRIANGLE.
		Triangle Pen1 = new Triangle();
		Pen1.Draw();
		Pen1.Erase();
		
		// NOW DRAW TRIANGLE.
		Circle Pen2 = new Circle();
		Pen2.Draw();
		Pen2.Erase();
		
	}
}
