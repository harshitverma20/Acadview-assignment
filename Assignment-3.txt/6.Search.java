import java.util.Scanner;

class Search{
	public static void main(String s[]){
		
		int a[] = new int[]{1,4,6,7,8,9,10};
		System.out.print("\n Given array is : ");
		
		for(int i=0 ; i<a.length ; i++)
			System.out.print(" "+a[i]);
	
		Scanner scan = new Scanner(System.in);
		System.out.print("\n Enter a number : ");
		int search = scan.nextInt();
		
		int n=a.length;

		int beg=0;
		int end=n-1;
		int mid=(beg+end)/2;
//		System.out.println(+a[mid]);
		while(beg <= end){
			if(a[mid]== search){
				System.out.println("\n** Match found **");
				break;
			}
			
			else if(search < a[mid]){
				end=mid;
				mid=(beg+end)/2;
			}
			else{
				beg = mid+1;
				mid=(beg+end)/2;
			}
			
			if(beg>end)
					System.out.println("\n* Match not found *");
		}
		
	}
}











