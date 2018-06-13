import java.util.Scanner;

class SecondLargeArr{
	public static void main(String s[]){
		Scanner scan=new Scanner(System.in);

		int arr[]=new int[10];

			System.out.println(" Enter 10 Array elements : ");

			for ( int i=0 ; i<10 ; i++){
				arr[i]=scan.nextInt();
			}

			int large = arr[0];
			int sec_large = arr[1];

			for (int i=2 ; i<10 ; i++){
				if(arr[i]>large && arr[i] > sec_large){
					sec_large=large;
					large = arr[i];
				}
				else if(arr[i]< large && arr[i]>sec_large){
					sec_large = arr[i];
				}
			}
			System.out.println(+large);
			System.out.println(+sec_large);
	}
}