import java.util.Scanner;
class Reverse{
	public static void main(String s[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		
		int temp=n;
		int rev=0;
		while (temp!=0){
			rev=rev*10 + temp%10;
			temp=temp/10;
		}
		
		System.out.println("\nReverse of "+n+" is : "+rev);
	}
}