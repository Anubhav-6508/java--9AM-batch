import java.util.ArrayList;

/**
 * About ArrayList
 * ============ 
 * 1. ArrayList is a collections framework collection. 
 *    It is available from Java 1.2v. It is an implementation of List.
 *    
 * 2. We must choose ArrayList, for storing multiple objects 
 *    in single thread application without thread-safety
 *    in insertion order with index   
 *    
 * 3. ArrayList is not synchronized, it is best in STA and not good in MTA
 * 
 * 4. ArrayList is a ordered collection, it maintains Insertion Order
 * 
 * 5. Its implemented data structure is 'resizable array'
 * 
 * 6. Default capacity: 10 
 *    Incremental capacity: [+1 or half]
 *    
 * 7. All 4 types of objects 'H, H, U and D' are allowed 
 * 
 * 8. null is allowed, multiple nulls are allowed 
 * 
 * 9. It stores objects in insertion order
 * 
 * 10. It allows us to retrieve elements 
 *     either randomly or sequentially    
 * 
 * 11. In search and remove operations, inside contains() and remove()
 *     methods internally 'equals()' method is called and it is executed
 *     our class that search argument object class.
 *   
 * 12. Available constructors
 * 		1. ArrayList()
 * 		2. ArrayList(Collection c)
 * 		3. ArrayList(int capacity)
 * 
 */
public class Test02_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		//System.out.println("Capacity: "+ al.capacity());
		System.out.println("Size    : "+ al.size());
		System.out.println("Eles    : "+ al);
		System.out.println();
		
		al.add("a");
		al.add("b");
		al.add(5);	
		al.add(6.7);	
		al.add('p');	
		al.add(true);	
		al.add(null);	
		al.add(new Ex(5, 6));	
		al.add("a");	
		al.add(5);	
		
		System.out.println("Eles    : "+ al);
		System.out.println("Size    : "+ al.size());
		System.out.println();
		
		al.add(null);	
		al.add(new Ex(5,6));	
		al.add(new Ex(7,8));	
		al.add(6.7);	
		
		System.out.println("Eles    : "+ al);
		System.out.println("Size    : "+ al.size());
		System.out.println();

	//random access	
		System.out.println(al.get(4));
		System.out.println(al.get(10));
	
	//sequential access	
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + "  ");
		}
		System.out.println();
		
		for(Object obj:al) {
			System.out.print(obj + "  ");
		}
		System.out.println();
		
		al.forEach(obj->System.out.print(obj + "  "));

		System.out.println();
		al.stream().forEach(obj->System.out.print(obj + "  "));
		

	}
}
