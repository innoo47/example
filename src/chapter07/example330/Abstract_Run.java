package chapter07.example330;

public class Abstract_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		System.out.println();

		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
