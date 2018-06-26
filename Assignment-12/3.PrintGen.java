class PrintGen{
	public static <T> void printArr(T[] inputArray){
		for(T var : inputArray)
			System.out.print(" "+var);
	}
	
	public static void main(String args[])
	{
		Integer[] intArr = {1,2,3,489,4,59,69};
		Character[] chArr = {'a','B','V','X','X','T'};
		Double[] dArr = {1.1, 1.2, 3.1, 6.1, 4.5, 6.9};
		
		System.out.print("\n Integer array is : ");
		printArr(intArr);
		
		System.out.print("\n Character array is : ");
		printArr(chArr);
		
		System.out.print("\n double array is :");
		printArr(dArr);
	}
}