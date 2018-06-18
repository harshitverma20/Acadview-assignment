class SubStr{
	public static void main(String arg[]){
		
		String s = "xyz";
		char ch[] = s.toCharArray();
		String substr;
       
	   System.out.println("\n All Substrings are : ");
	   
		for(int i=0 ;i<ch.length ; i++){
			for(int j=i+1 ; j<=ch.length ;j++){
				substr = s.substring(i, j);
				System.out.println(substr);
           }
       }

	}
}