package lombokExample;

public class Dog2 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.setName("Nancy");
		
		System.out.println(dog1.getName());
		
		Dog dog2 = new Dog();
		dog2.setName("Janny");
		dog2.setAge(3);
		dog2.setColor("Black");
		
		System.out.println(dog2.getName());
		System.out.println(dog2.getColor());
		System.out.println(dog2.getAge());
	
		System.out.println(dog2.toString());

	}

}
