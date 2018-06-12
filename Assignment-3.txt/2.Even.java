import java.util.Scanner;

class Even{
	public static void main(String s[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int n = scan.nextInt();
			
		System.out.println("Even no's upto "+n+"are : ");
		
		for (int i=0 ; i<=n; i++){
			if( i%2 == 0)
				System.out.println(+i);
		}		
	}
}