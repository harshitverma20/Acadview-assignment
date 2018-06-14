class Animal{

	String breed;
	String color;

	public void speak(){
		System.out.println("\n I am Animal!!");
	}

}

class Dog extends Animal{
	String breed = "Dog";
	String color = "white";

	public void speak(){						//fn overriding
		System.out.println("\n I am Dog!!");
	}
}

class Cat extends Animal{
	String breed = "Cat";
	String color = "Brown";

	public void speak(){						//fn overriding
	System.out.println("\n I am Cat!!");
	}
}

class AnimalPlanet{

	public static void main(String s[]){
		Animal a = new Animal();
		a.speak();

		Dog d = new Dog();
		Cat c = new Cat();

		d.speak();
		c.speak();


	}
}