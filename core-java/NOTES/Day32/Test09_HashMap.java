import java.util.HashMap;

/**
 * For storing objects with mapping in hash code order
 * we must use HashMap
 * 
 *  Hash Map maintains entries in the key object's hash code order 
 */
public class Test09_HashMap {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<>();
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();
		
		System.out.print(hm.put("a", 101)); System.out.println("\t"+ hm);
		System.out.print(hm.put("b", 201)); System.out.println("\t"+ hm);
		System.out.print(hm.put(5, 301)); System.out.println("\t"+ hm);
		System.out.print(hm.put(6.7, 401)); System.out.println("\t"+ hm);
		System.out.print(hm.put('p', 601)); System.out.println("\t"+ hm);
		System.out.print(hm.put(null, 501)); System.out.println("\t"+ hm);
		System.out.print(hm.put(97, 601)); System.out.println("\t"+ hm);
		System.out.print(hm.put(98, 601)); System.out.println("\t"+ hm);
		System.out.print(hm.put("a", 701)); System.out.println("\t"+ hm);
	
		
		System.out.println();
		System.out.println(hm.size());
		
	}
}

















