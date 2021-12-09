package work1;

public class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduction() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
	}

}
