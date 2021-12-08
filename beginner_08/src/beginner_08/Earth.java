package beginner_08;

public class Earth {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Student student = new Student();
		
		animal.walk();
		
		human.walk();
		human.speak();
		
		student.walk();
		student.speak();
		student.study();
		
		

	}

}
