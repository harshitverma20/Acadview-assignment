class StrOccurence{
	public static void main(String s[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter string 1 : ");
		String s1 = in.nextLine();
		
		System.out.print("Enter string 2 : ");
		String s2 = in.nextLine();
		
		int count = 0;
		int len=s2.length();
		
		String substr;
		for(int i=0 ; i<=s1.length()-len ; i++){
			substr = s1.substring(i,i+len);
			if(s2.equals(substr))
				count++;
				
		}
		System.out.println(count);
		
	}
}
