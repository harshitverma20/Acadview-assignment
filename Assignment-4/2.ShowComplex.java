class Complex
{
	
	int real;
	int img;

	Complex(int real, int img){			//parameterized constructor
		
		this.real = real;
		this.img = img;
	}
	void showComplex(){
			System.out.println("\n complex No. is :  "+real+"+"+img+"i");
	}
}

class ShowComplex{

	public static void main(String s[]){

		Complex c1 = new Complex(15,36);
		c1.showComplex();
	}
}

/*
class Complex{
	
	int real;
	int img;

	Complex(int real, int img){			//parameterized constructor
		
		this.real = real;
		this.img = img;
	}
	Complex(){  }			//default constructor

	void showComplex(){
		System.out.println(" complex No. is :  "+real+"+"+img+"i");
	}

	Complex addComplex(Complex c){
		Complex temp = new Complex();
		temp.real = real+c.real;
		temp.img = img+c.img;
		return temp;
	}

	Complex mulComplex(Complex c){
		Complex temp = new Complex();
		temp.real = real * c.real;
		temp.img = img * c.img;
		return temp;
	}
	
}

class Test{

	public static void main(String s[]){

		Complex c1 = new Complex(15,36);
		c3 = c1.addComplex(c2);
		Complex c2 = new Complex(21,4);
		c2.showComplex();

		Complex c3 = new Complex();
		Complex c4 = new Complex();
		

		c1.showComplex();
		
		System.out.println("\n Sum of above complex no's is : ");
		c3.showComplex();

		c4 = c1.mulComplex(c2);
		System.out.println("\n Mul of above complex no's is : ");
		c4.showComplex();

	}
}
*/