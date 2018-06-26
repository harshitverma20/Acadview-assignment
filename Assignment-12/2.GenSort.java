import java.util.Arrays;
class GenSort{
	
	public static <T> void sort(T[] arr){
		Arrays.sort(arr);
		for(T var : arr)
			System.out.print(" " +var);
		
	}
	
	public static void main(String args[])
	{
		Integer[] intArr = {1,2,5,8,4,9,3,56};
		Character[] chArr = {'a','B','V','X','X','T'};
		Double[] dArr = {1.1, 1.2, 3.1, 6.1, 4.5, 6.9};
		
		System.out.print("\n Integer sorted array is : ");
		sort(intArr);
		
		System.out.print("\n  sorted array is : ");
		sort(chArr);
		
		System.out.print("\n Integer sorted array is : ");
		sort(dArr);
	}
}