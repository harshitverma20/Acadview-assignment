import java.util.Scanner;

class Prime{
	public static void main(String s[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		
		System.out.println("Prime no's upto "+n+" are : \n");
		if(n<=1)
			System.out.println("No Prime no's.");
		if(n == 2 )
			System.out.println(+n);
		
		int flag=0;
		for (int i=2 ; i<=n ; i++){
			for (int j=2 ; j<=i/2 ; j++){
				if(i%j == 0){
					flag=1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("Prime "+i);
			else
				flag=0;
		}
	}
}