class Overload{
	

		public void print(){
			System.out.println("print fn called with null arg!!");
		}
		public void print(int x){
			System.out.println("print fn called with int arg! int x :" +x);
		}
		public void print(float y){
			System.out.print("print fn called with float arg! float y : " +y);
		}

	public static void main(String s[]){
		Overload o = new Overload();

		o.print();
		o.print(69);
		o.print(78.9999f);
	}
}