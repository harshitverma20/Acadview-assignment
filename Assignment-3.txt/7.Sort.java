class Sort{
	public static void main(String s[]){
		
		int a[]= new int[]{1,1,1,1,0,0,1,0};
		int n = a.length;
		
		System.out.print("\n Given array is : ");
		for( int i=0 ; i<n ; i++)
			System.out.print(" " +a[i]);
		
		
		int loc=0;
		for (int i=0 ; i<n ;i++){
			if(a[i] == 0){
				a[loc]=0;
				a[i]=1;
				loc++;
			}
		}
		
		System.out.print("\n\n Sorted array is : ");
		for( int i=0 ; i<n ;i++)
			System.out.print(" " +a[i]);
		
	}
}