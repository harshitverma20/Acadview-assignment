class RevStr{
	public static void main(String s[]){
		String str = "abcd";
	//	String rev = "";
	/*	for( int i = str.length()-1 ; i >= 0 ; i--){
			System.out.print(str.charAt(i));
		}
	*/
		for ( int i=str.length()-1 ;i>=0 ; i--)
			String rev = String.valueof(str.charAt(i));
		
		System.out.println(rev);
	}
}