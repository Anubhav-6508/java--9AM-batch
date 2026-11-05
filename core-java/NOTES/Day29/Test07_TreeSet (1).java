/*
 * TS is used for storing objects in sorting order [ASC or DESC]
 * It allows only Comparable homogeneous objects  
 * 
 * If we pass Heterogeneous objects -> throws CCE
 * If we pass null					-> throws NPE
 * If we non-comprable objects		-> throws CCE
 * 
 * we can store non-cmparable objects
 * with  custom comparator implementation
 * 
 * conclusion:
 * 	In TS we can store only Comparable objects or 
 * 	with custom comparator
 */

import java.util.TreeSet;

public class Test07_TreeSet {
	public static void main(String[] args) {
		
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		System.out.println(ts1);
		
		//ts1.add(5);		//RE: CCE
		//ts1.add(null);	//RE: NPE
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		System.out.println(ts2);
		
		TreeSet<Ex> ts3 = new TreeSet<>();  //default sorting order
		ts3.add(new Ex(5, 9));				//given in Ex class with 	
		ts3.add(new Ex(7, 2));				//Comparable interface
		ts3.add(new Ex(6, 3));				//that is x property ASE order
		System.out.println(ts3);
		
		TreeSet<Ex> ts4 = new TreeSet<>((e1, e2) -> e2.getX() - e1.getX());
										//for sorting object in different order
		ts4.add(new Ex(5, 9));			//we must take Comparator interface 	
		ts4.add(new Ex(7, 2));			//Comparator is a FI, we can implement it 
		ts4.add(new Ex(6, 3));			//by using LE
		System.out.println(ts4);
				
		TreeSet<Ex> ts5 = new TreeSet<>((e1, e2) -> e1.getY() - e2.getY());
		//for sorting object in different order
		ts5.add(new Ex(5, 3));			//we must take Comparator interface 	
		ts5.add(new Ex(7, 2));			//Comparator is a FI, we can implement it 
		ts5.add(new Ex(6, 9));			//by using LE
		System.out.println(ts5);
		
		TreeSet<Ex> ts6 = new TreeSet<>((e1, e2) -> e2.getY() - e1.getY());
		//for sorting object in different order
		ts6.add(new Ex(5, 3));			//we must take Comparator interface 	
		ts6.add(new Ex(7, 2));			//Comparator is a FI, we can implement it 
		ts6.add(new Ex(6, 9));			//by using LE
		System.out.println(ts6);
		
		TreeSet<String> ts7 = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
		ts7.add("a");
		ts7.add("c");
		ts7.add("b");
		System.out.println(ts7);
		
		TreeSet<Integer> ts8 = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
		ts8.add(5);
		ts8.add(7);
		ts8.add(6);
		System.out.println(ts8);
		
	}
}
