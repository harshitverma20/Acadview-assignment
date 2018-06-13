import java.util.Scanner;

class Waveform{

	public static void main(String s[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int n = scan.nextInt();

		int a[] = new int[n];
		System.out.println("Enter array elements : ");

		for( int i=0 ; i<n ; i++){				//scan array
			a[i] = scan.nextInt();
		}
		System.out.print("\n Array is : ");

		for(int i=0 ; i<n ; i++)					//print array
			System.out.print(" " +a[i]);

		int temp;
		for(int i=0 ; i<n-1 ;i=i+2){
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}

		System.out.print("\n Wavefoem pattern is : ");				//print waveform
		for( int i=0 ; i<n ;i++)
				System.out.print(" "+a[i]);

	}

}