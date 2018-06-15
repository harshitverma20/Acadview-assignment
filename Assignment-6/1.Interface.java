interface Animal{
	void speak();
	void eat();
}

class Dog implements Animal{
	public void speak(){
		System.out.println(" \n Hello! Dog Barking!!");
	}
	public void eat(){
		System.out.println("I eat fresh Meat!");
	}
}

class Cat implements Animal{
	public void speak(){
		System.out.println(" \n Hello! Cat here!!meow!");
	}
	public void eat(){
		System.out.println("I only eat Rats!");
	}
}

class Main{
	public static void main(String s[]){
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.speak();
		d.eat();
		
		c.speak();
		c.eat();
	}
}
