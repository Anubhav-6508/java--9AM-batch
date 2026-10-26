package com.nit.hk.customcollections;

public class NITMap {
	/**
	 * for storing objects without type limitation   
	 */
	private Object[] 	keys;
	private Object[] 	values;
	
	/**
	 * for maintaining size and index of current location to store
	 */
	private int 		size ;
	
	/**
	 * for creating empty collection with initial capacity 10 <BR>
	 * and incremental capacity double
	 */
	public NITMap() {
		keys 	= new Object[10];
		values 	= new Object[10];
		size 	= 0;
	}

	/**
	 * for adding entries to this map <BR>
	 * always stores entry at end of this map
	 *  
	 * @param key- key to be stored
	 * @param value- value to be stored
	 */
	public void put(Object key, Object value) {
		if(size == keys.length) {
			grow();
		}
		keys[size] = key;
		values[size] = value;
		size++;
	}
	
	/**
	 * for increasing capacity of this map </BR>
	 * it implements growable array algorithm 
	 */
	private void grow() {
		Object[] nextKeysArray = new Object[keys.length*2];
		Object[] nextValuesArray = new Object[values.length*2];
		
		for(int i=0; i<keys.length; i++) {
			nextKeysArray[i] = keys[i];
			nextValuesArray[i] = values[i];
		}
		
		keys = nextKeysArray;
		values = nextValuesArray;
	}
	
	/**
	 * for returning size of this map
	 * 
	 * @return int returning size of this collection
	 */
	public int  size() {
		return size;
	}

	/**
	 * returns this map elements in string format
	 * 
	 */	
	@Override
	public String toString() {
		
		if(size==0)
			return "{}";
		
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(int i=0; i<size; i++) {  //copying entries from map object
			sb.append(keys[i]);		//to StringBuilder object for printing
			sb.append("=");		
			sb.append(values[i]);		
			sb.append(", ");
		}
		
		int index = sb.lastIndexOf(", "); //for finding last , space
		sb.delete(index, index+2);        //removing last , space
		
		sb.append("}");
		
		return sb.toString();  //converting StringBulilder object o String object
	}

}
