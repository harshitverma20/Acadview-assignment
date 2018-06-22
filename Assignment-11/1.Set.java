import java.util.*;

class SetDemo{
	public static void main(String args[])
	{
		HashSet hs1 = new HashSet();
		hs1.add("45");
		hs1.add("48");
		hs1.add("V");
		hs1.add("478");
		hs1.add("545");
		
		System.out.println("\n hashset 1 : "+hs1);
		
		HashSet hs2 = new HashSet();
		hs2.add("44");
		hs2.add("48");
		hs2.add("V");
		hs2.add("47");
		hs2.add("545");
		
		System.out.println("\n hashset 2 : "+hs2);
		
		hs1.retainAll(hs2);
		System.out.println("\n retained hashset : "+hs1);
	}
}