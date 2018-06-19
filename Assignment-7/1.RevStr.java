class RevStr{
	public static void main(String s[]){
		
		StringBuffer str = new StringBuffer("!!weivdacA olleH!!");
        	str.reverse();
        	System.out.print("Reverse of string is : ");
        	System.out.println(str);
		
		// OR
		
		/*
		String str1 = "Hello Acadview!!";
		System.out.print("\n Reverse of string is : ");
			for( int i = str1.length()-1 ; i >= 0 ; i--){
				System.out.print(str1.charAt(i));
		*/		
		// OR
		
		/*
		String str = "abcd";
        	String rev = "";
        		for ( int i=str.length()-1 ;i>=0 ; i--)
            			rev = rev+String.valueOf(str.charAt(i));
		
            	System.out.println(rev);
		*/
}
