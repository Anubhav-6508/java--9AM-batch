import java.util.Vector;

/**
 * About Vector
 * ============ 
 * 1. Vector is a legacy collection. It is available from Java 1.0v
 *    In Java 1.2v it is added as implementation class of List interface
 *    
 * 2. We must choose vector, for storing multiple objects in insertion order 
 *    with index in mulithread application with thread-safety  
 *    
 * 3. Vector is synchronized, it is best in MTA and not good in STA
 * 
 * 4. Vector is a ordered collection, it maintains Insertion Order
 * 
 * 5. Its implemented data structure is 'growable array'
 * 
 * 6. Default capacity: 10 
 *    Incremental capacity: [+1 or double]
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
 * 		1. Vector()
 * 		2. Vector(Collection c)
 * 		3. Vector(int capacity)
 * 		4. Vector(int capacity, int incrCapacity)
 * 
 */
public class Test01_Vector {
	public static void main(String[] args) {
		
		Vector<Object> v1 = new Vector<>();
		System.out.println("Capacity: "+ v1.capacity());
		System.out.println("Size    : "+ v1.size());
		System.out.println("Eles    : "+ v1);
		System.out.println();
		
		v1.add("a");
		v1.add("b");
		v1.add(5);	
		v1.add(6.7);	
		v1.add('p');	
		v1.add(true);	
		v1.add(null);	
		v1.add(new Ex(5, 6));	
		v1.add("a");	
		v1.add(5);	
		
		System.out.println("Eles    : "+ v1);
		System.out.println("Size    : "+ v1.size());
		System.out.println("Capacity: "+ v1.capacity());
		System.out.println();
		
		v1.add(null);	
		v1.add(new Ex(5,6));	
		v1.add(new Ex(7,8));	
		v1.add(6.7);	
		
		System.out.println("Eles    : "+ v1);
		System.out.println("Size    : "+ v1.size());
		System.out.println("Capacity: "+ v1.capacity());
		System.out.println();

	//random access	
		System.out.println(v1.get(4));
		System.out.println(v1.get(10));
	
	//sequential access	
		for(int i=0; i<v1.size(); i++) {
			System.out.print(v1.get(i) + "  ");
		}
		System.out.println();
		for(Object obj:v1) {
			System.out.print(obj + "  ");
		}
		System.out.println();
		v1.forEach(obj->System.out.print(obj + "  "));

		System.out.println();
		v1.stream().forEach(obj->System.out.print(obj + "  "));
		

	}
}
