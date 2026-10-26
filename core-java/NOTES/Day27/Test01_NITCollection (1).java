package com.nit.hk.customcollections;

public class Test01_NITCollection {
	public static void main(String[] args) {
		
		NITCollection col = new NITCollection();
		
		System.out.println("capacity : " + col.capacity());
		System.out.println("size     : " + col.size());
		System.out.println("eles     : " + col);
		System.out.println();
		
		col.add("a"); 	System.out.println("eles     : " + col);
		col.add("b"); 	System.out.println("eles     : " + col);
		col.add(5);		System.out.println("eles     : " + col);
		col.add(6.7);	System.out.println("eles     : " + col);
		col.add('p');	System.out.println("eles     : " + col);
		col.add(true);	System.out.println("eles     : " + col);
		col.add(null);	System.out.println("eles     : " + col);
		col.add(new Ex(5,6));	System.out.println("eles     : " + col);
		col.add("a");	System.out.println("eles     : " + col);
		col.add(5);		System.out.println("eles     : " + col);
		System.out.println();
		System.out.println("size     : " + col.size());
		System.out.println("capacity : " + col.capacity());
		System.out.println();

		col.add(new Ex(7,8));	System.out.println("eles     : " + col);
		col.add(6.7);	System.out.println("eles     : " + col);
		col.add(null);	System.out.println("eles     : " + col);
		col.add(40.5f);	System.out.println("eles     : " + col);
		
		System.out.println();		
		System.out.println("size     : " + col.size());
		System.out.println("capacity : " + col.capacity());
		System.out.println();
		
		System.out.println(col.contains("a"));
		System.out.println(col.contains("A"));
		System.out.println(col.contains(new String("a")));
		System.out.println(col.contains(5));
		System.out.println(col.contains(new Integer(5)));
		System.out.println(col.contains(new Ex(5, 6)));
		System.out.println(col.contains(new Ex(9, 8)));
		System.out.println(col.contains(null));
		System.out.println();
		System.out.println(col);
		System.out.println(col.indexOf("a"));
		System.out.println(col.indexOf("A"));
		System.out.println(col.indexOf(new String("a")));
		System.out.println(col.indexOf(null));
		System.out.println(col.indexOf(new Ex(5, 6)));
		System.out.println();
		System.out.println(col);
		System.out.println(col.indexOf("a"));
		System.out.println(col.lastIndexOf("a"));
		System.out.println(col.indexOf(new Ex(5,6)));
		System.out.println(col.lastIndexOf(new Ex(5,6)));
		System.out.println(col.indexOf("A"));
		System.out.println(col.lastIndexOf("A"));
		System.out.println();
		
		System.out.println(col.get(0));
		System.out.println(col.get(4));
		System.out.println(col.get(10));
		//System.out.println(col.get(15));
		//System.out.println(col.get(-1));
		System.out.println();
		
		System.out.println(col);		
		System.out.println(col.remove(2));
		System.out.println(col);		
		System.out.println(col.remove("a"));
		System.out.println(col);		
		System.out.println(col.remove(new Ex(5, 6)));
		System.out.println(col);		
		System.out.println(col.remove(null));
		System.out.println(col);
		
		col.add(2, "X");
		System.out.println(col);		
		
		col.set(6, "Y");
		System.out.println(col);
	}
}


















