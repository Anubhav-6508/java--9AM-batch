import java.util.LinkedList;

/**
 * About LinkedList
 * ====================== 
 * 1. LinkedList is a collections framework collection. 
 *    It is available from Java 1.2v. It is an implementation of List.
 *    From Java 5v it also implements Deque interface
 *    
 * 2. We must choose LinkedList, if our more operations are 
 *    'inserting and removing objects' at begin and middle of the collection
 *    
 * 3. LinkedList is not synchronized, it is best in STA and not good in MTA
 * 
 * 4. LinkedList is a ordered collection, it maintains Insertion Order
 * 
 * 5. Its implemented data structure is 'linked list'
 * 
 * 6. Default capacity: 0 
 *    Incremental capacity: 1
 *    
 * 7. All 4 types of objects 'H, H, U and D' are allowed 
 * 
 * 8. null is allowed, multiple nulls are allowed 
 * 
 * 9. It stores objects in insertion order
 * 
 * 10. It allows us to retrieve elements 
 *     either randomly or sequentially  
 *     Note: when we access randomly, it internally 
 *     follow sequential access only  
 * 
 * 11. In search and remove operations, inside contains() and remove()
 *     methods internally 'equals()' method is called and it is executed
 *     our class that search argument object class.
 *   
 * 12. Available constructors
 * 		1. LinkedList()
 * 		2. LinkedList(Collection c)
 * 
 */
public class Test03_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<>();
		System.out.println("Size    : "+ ll.size());
		System.out.println("Eles    : "+ ll);
		System.out.println();
		
		ll.add("a");
		ll.add("b");
		ll.add(5);	
		ll.add(6.7);	
		ll.add('p');	
		ll.add(true);	
		ll.add(null);	
		ll.add(new Ex(5, 6));	
		ll.add("a");	
		ll.add(5);	
		
		System.out.println("Eles    : "+ ll);
		System.out.println("Size    : "+ ll.size());
		System.out.println();
		
		ll.add(null);	
		ll.add(new Ex(5,6));	
		ll.add(new Ex(7,8));	
		ll.add(6.7);	
		
		System.out.println("Eles    : "+ ll);
		System.out.println("Size    : "+ ll.size());
		System.out.println();

	//random access	
		System.out.println(ll.get(4));
		System.out.println(ll.get(10));
	
	//sequential access	
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i) + "  ");
		}
		System.out.println();
		
		for(Object obj:ll) {
			System.out.print(obj + "  ");
		}
		System.out.println();
		
		ll.forEach(obj->System.out.print(obj + "  "));
		
		System.out.println();
		ll.stream().forEach(obj->System.out.print(obj + "  "));
		/*
*/
	}
}
