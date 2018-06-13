class Rectangle{
	
	double l;
	double b;

	Rectangle(double l, double b ){

		this.l = l;
		this.b = b;
	}

	void calArea(){
		System.out.println("\n Area of Rectangle is : " +(l*b));
	}

}

class RectArea{

	public static void main(String s[]){

		Rectangle r = new Rectangle(458,85.47);

		r.calArea();
	}
}