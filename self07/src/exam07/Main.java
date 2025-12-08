package exam07;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		as(new Dog());
		as(new Cat());
	}
	
		public static void as(Animal animal) {
			animal.sound();
		}
		

	}

