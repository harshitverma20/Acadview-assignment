import java.util.Scanner;

class LargeSubArr{
	public static void main(String s[]){
		Scanner alien = new Scanner(System.in);

		System.out.print("\n Enter array size : ");
		int n = alien.nextInt();

		int a[] = new int[n];

		System.out.print("\n Enter "+n+" Array elements : ");

		for(int i=0 ; i<n ; i++)
			a[i] = alien.nextInt();

		int max_len =1 , len = 1;
		int max=0, min=0;

		int i;
		for( i=1 ; i<n ; i++){

			if(a[i]>a[i-1])
				len++;

			else
				if (max_len < len){
				
					max_len=len;
					len=1;

					max = i-1;
					min = i-max_len;
				}


		}
		if(max_len < len){
			max_len = len;

			max = i-1;
			min = i-max_len;
		}
		System.out.println("Max length of sub array is : " +max_len);

		System.out.print("Largest sub array is : ");
		for( int x=min ; x<=max ;x++)
			System.out.print(" "+a[x]);
	}
}


