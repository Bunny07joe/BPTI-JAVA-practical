class Student {
	String Name;
	int age ;
	Student (String Name, int age ){
		this.Name  = Name;
		this.age = age;
	}
		
	Student (Student s){
		Name = s.Name;
		age = s.age;
	}
	void Getinfo(){
		System.out.println("Name : " + Name +"\n" + "Age : " + age);
	}
}

public class Copycon{
	public static void main(String args[]){
		Student s1  = new Student("Thala", 45);	
		Student s2  = new Student(s1);
		s1.Getinfo();
		s2.Getinfo();
	}	
}
