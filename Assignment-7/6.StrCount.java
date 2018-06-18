class Str{
	public static void main(String args[]){
		
		String s = new String("    hello strings in java");
		System.out.println(s);
		
		int count = 0;
		
		char ch[] = s.toCharArray();
		
		for(int i=0 ; i<ch.length ;i++){
			if(ch[i] != 32)
				count++;
		}
		
		System.out.println(count);
	}
}