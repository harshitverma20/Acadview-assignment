import java.util.*;


class Alist{
	int n;
	Alist(int n){
		this.n = n;
	}
	
	public ArrayList newArrList(){
		ArrayList l = new ArrayList(n*2);
		return l;
	}
	

}

class Main{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array list size : ");
		int n = scan.nextInt();
		
		Alist list1 = new Alist(n);
		ArrayList list;
		
		list = list1.newArrList();
		
		list.add("harshit");
		list.add("ram");
		System.out.println(list.size());
	}
}