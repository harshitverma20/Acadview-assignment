import java.util.*;

class Person{
	String name;
	int age;
	
	public Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

class CompAge implements Comparator<Person>{
	public int compare(Person p1 , Person p2){
		return p1.getAge()-p2.getAge();
	}
}
class CompName implements Comparator<Person>{
	public int compare(Person p1 , Person p2){
		return p1.getName().compareTo(p2.getName());
	}
}

class SortPerson{
	public static void main(String args[])
	{
		Person p1 = new Person("barny" , 20);
		Person p2 = new Person("robert" , 45);
		Person p3 = new Person("jordy" , 37);
		Person p4 = new Person("jonny" , 40);
		Person p5 = new Person("bond" , 42);
		Person p6 = new Person("elliot" , 25);
		Person p7 = new Person("joey" , 30);
		
		ArrayList<Person> aL = new ArrayList<>();
		aL.add(p1);
		aL.add(p2);
		aL.add(p3);
		aL.add(p4);
		aL.add(p5);
		aL.add(p6);
		aL.add(p7);
		
		System.out.println("\n Sort according to name..");
		CompName name = new CompName();
		Collections.sort(aL , name);
		
		for(Person p : aL)
			System.out.println("name : "+ p.getName() + "\t age : "+p.getAge());
		
		System.out.println("\n Sort according to age..");
		
		CompAge age= new CompAge();
		Collections.sort(aL , age);
		
		for(Person p : aL)
			System.out.println("name : "+ p.getName() + "\t age : "+p.getAge());
		
	}
}