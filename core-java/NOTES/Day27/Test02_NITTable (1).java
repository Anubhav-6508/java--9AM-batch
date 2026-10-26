package com.nit.hk.customcollections;

public class Test02_NITMap {
	public static void main(String[] args) {
		
		NITTable map = new NITTable();
		System.out.println(map.size());
		System.out.println(map);
		System.out.println();
		
		map.put("a", 1);
		map.put("b", 2);
		map.put(5, 3);
		map.put(6.7, 4);
		
		System.out.println(map);
		System.out.println(map.size());
		
		
	}
}
