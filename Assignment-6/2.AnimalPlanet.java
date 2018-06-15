abstract class Animal{					//abstract class
	String color;
	String breed;
	String name;
	
	abstract void eat();				//abstract fn
	
	void speak(){
		System.out.println("I am Animal");
	}
}

class Dog extends Animal{
	String breed = "Akita";
	String color = "Brown";
	String name = "Hachi";
	
	void eat(){										//overriding abstract fn
		System.out.println("\n I eat fresh meat");
	}
	void speak(){
		System.out.println("\n I am a Dog!! \n Breed : "+breed+" \n color : "+color+" \n name : "+name);
	}
}

class Cat extends Animal{
	String breed = "Himalayan Cat";
	String color = "White";
	String name = "Pussy Cat";
	
	void eat(){										//overriding abstract fn
		System.out.println("\n I eat Rats!!");
	}
	void speak(){
		System.out.println("\n I am a Cat!! \n Breed : "+breed+" \n color : "+color+" \n name : "+name);
	}
}

class AnimalPlanet{
	public static void main(String s[]){
		//Animal a = new Animal();
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.speak();
		d.eat();
		
		c.speak();
		c.eat();
	}
}