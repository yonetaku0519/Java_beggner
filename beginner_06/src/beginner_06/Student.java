package beginner_06;

public class Student {
	private String name;
	private int age;
	private int grade = 2;
	private int rank = 1;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}
	
	void introduction() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
		System.out.println(rank);
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
