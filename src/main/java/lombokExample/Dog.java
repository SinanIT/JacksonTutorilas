package lombokExample;

public class Dog {
	
	private String name;
	private String color;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Name of the dog is: " + name + "\n" 
				+ "Color of the dod is: " + color + "\n" 
				+ "Age of the dog is :" + age;
	}
}
