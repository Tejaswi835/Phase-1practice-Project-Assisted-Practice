package implicit;

public class Constructortypes {
	private String name;
	private int age;

	public Constructortypes() {
		name = "Tejaswini";
		age = 22;
	}

	public Constructortypes(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Constructortypes(Constructortypes other) {
		this.name = other.name;
		this.age = other.age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Constructortypes obj1 = new Constructortypes();
		System.out.println("Name: " + obj1.getName());
		System.out.println("Age: " + obj1.getAge());
		Constructortypes obj2 = new Constructortypes("Poojitha", 23);
		System.out.println("Name: " + obj2.getName());
		System.out.println("Age: " + obj2.getAge());
		Constructortypes obj3 = new Constructortypes(obj2);
		System.out.println("Name: " + obj3.getName());
		System.out.println("Age: " + obj3.getAge());
	}
}
