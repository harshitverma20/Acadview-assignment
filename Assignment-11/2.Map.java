import java.util.*;
class MapDemo{
	public static void main(String args[])
	{
		Map m = new HashMap();
		
		m.put("bread",30);
		m.put("pizza", 500);
		m.put("porsche", 50000000);
		
		System.out.println(m);
		
		m.replace("bread", 10);
		m.replace("porsche", 45000000);
		
		System.out.println(m);
	}
}