class RmVovels{
	public static void main(String arg[]){
		
		String s = "acacview chandigarh!!";
        System.out.println("\n String is : "+s);
	
        char ch[] = s.toCharArray();
        char ch1[] =  new char[s.length()]; 
        int n=0;
        
        for(int i=0 ; i<ch.length ; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'i')
            {
            } else {
                ch1[n] = ch[i];
                n++;
            }
        }
		
		System.out.print("\n String without vovels is : ");
        for(int i=0 ;i<n ;i++)
        System.out.print(ch1[i]);
	}
}