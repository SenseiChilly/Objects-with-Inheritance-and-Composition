
public abstract class Person {
	
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String otherName) {
		name = otherName; 
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int otherAge) {
		age = otherAge; 
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
