import java.util.Scanner;

class Armstrong{
	public static void main(String s[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 3 digit number : ");
		int n = scan.nextInt();
		
		int temp=n;
		int sum=0,rem;
		
		while(n !=0){
			rem=n%10;
			sum= sum + rem*rem*rem;
			n=n/10;
		}
		
		if(sum == temp)
			System.out.println("\n**** No. is Armstrong ****");
		else
			System.out.println("\n** No is not Armstrong **");

			
	}
}