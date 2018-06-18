class Pattern1{
	public static void main(String s[]){
		
		char ch=97;
		for (int r=0 ; r<=3 ; r++){
			for (int c = 0 ; c<=r ; c++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			ch=97;
		}
	}
}