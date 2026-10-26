package com.nit.hk.customcollections;

/**
 * This class is a custom collection class. 
 * It means it is developed by a programmer in his project 
 * specific to this project. <BR><BR>
 * 
 * This class is meant for storing multiple 
 * Homogeneous, Heterogeneous, Unique and Duplicate objects 
 * without size limitation. <BR>This class implements growable 
 * array algorithm for storing objects without size limitation. <BR><BR>
 * 
 * This collection stores objects without mappings <BR> 
 * with index in insertion order.<BR><BR>
 * 
 * This collection allows null and multiple nulls<BR><BR>
 * 
 * This collection supports adding, counting, printing <BR>
 * searching, retrieving, removing, inserting and replacing operations<BR><BR>
 * 
 * @author HK
 *  
 */
public class NITCollection {
	/**
	 * for storing objects without type limitation   
	 */
	private Object[] 	elementData;
	
	/**
	 * for maintaining size and index of current location to store
	 */
	private int 		elementCount ;
	
	/**
	 * for creating empty collection with initial capacity 10 <BR>
	 * and incremental capacity double
	 */
	public NITArrayList() {
		elementData = new Object[10];
	}

	/**
	 * for adding object to this collection <BR>
	 * always stores object at end of last element
	 *  
	 * @param obj object to be stored
	 */
	public void add(Object obj) {
		if(size() == capacity()) {
			increaseCapacity();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}
	
	/**
	 * for increasing capacity of this collection </BR>
	 * it implements growable array algorithm 
	 */
	private void increaseCapacity() {
		Object[] nextArray = new Object[capacity()*2];
		
		for(int i=0; i<elementData.length; i++) {
			nextArray[i] = elementData[i];
		}
		
		elementData = nextArray;
	}
	
	/**
	 * for returning capacity of this collection
	 * 
	 * @return int returning capacity of this collection
	 */
	public int capacity() {
		return elementData.length;
	}

	/**
	 * for returning size of this collection
	 * 
	 * @return int returning size of this collection
	 */
	public int  size() {
		return elementCount;
	}

	/**
	 * returns this collection elements in string format
	 * 
	 */	
	@Override
	public String toString() {
		
		if(elementCount==0)
			return "[]";
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<elementCount; i++) {  //copying data from Collection object
			sb.append(elementData[i]);		//to StringBuilder object for printing
			sb.append(", ");
		}
		
		int index = sb.lastIndexOf(", "); //for finding last , space
		sb.delete(index, index+2);        //removing last , space
		
		sb.append("]");
		
		return sb.toString();  //converting StringBulilder object o String object
	}

	/**
	 * for searching given object in this collection
	 * 
	 * @param obj the object for finding
	 * @return 	true if object is found
	 * 			false if not found
	 */
	public boolean contains(Object obj) {
		return indexOf(obj)>=0;
	}
	
	/**
	 * returns the first occurrence of this given object
	 * 
	 * @param obj the object for finding its index 
	 * @return index number 
	 * 			-1 if object is not found
	 */
	public int indexOf(Object obj) {
		if(obj == null) {
			for(int i=0; i<elementCount; i++) {
				if(obj==elementData[i])
					return i;
			}
			return -1;
		}else {
			for(int i=0; i<elementCount; i++) {
				if(obj.equals(elementData[i]))
					return i;
			}
			return -1;
		}
	}
	
	/**
	 * returns the last occurrence of this given object
	 * 
	 * @param obj the object for finding its index 
	 * @return index number 
	 * 			-1 if object is not found
	 */
	public int lastIndexOf(Object obj) {
		if(obj == null) {
			for(int i=elementCount-1; i>=0; i--) {
				if(obj==elementData[i])
					return i;
			}
			return -1;
		}else {
			for(int i=elementCount-1; i>=0; i--) {
				if(obj.equals(elementData[i]))
					return i;
			}
			return -1;
		}
	}
	
	/**
	 * returns the object from the given index location 
	 * 
	 * @param index for retrieving object
	 * @return object available in this given index
	 * @throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 */
	public Object get(int index) {
		checkIndex(index);
		
		return elementData[index];
	}
	
	/**
	 * removes and returns the object from the given index location 
	 * 
	 * @param index for removing object
	 * @return object available in this given index
	 * @throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 */
	public Object remove(int index){
		checkIndex(index);
		
		Object ele = elementData[index]; 				/* retrieving object */
		
		for( int i=index ; i<elementCount-1; i++)  { 	/*removing object */
			elementData[i] = elementData[i+1];
		}
		 
		elementData[elementCount-1] = null;  /* assigning null to last location */
		elementCount--; 					/* decreasing size */
		
		return ele; 						/* returning the removed object */
	}
	
	/**
	 * removes the given object from this collection 
	 * 
	 * @param obj object for removing
	 * @return true if object is removed
	 * false if object is not removed
	 */	
	public boolean remove(Object obj) {
		int index = indexOf(obj); //searching object and retrieving index
		
		if(index>=0) {		//if found
			remove(index);		//removing that object from collection
			return true;		//and returning true	
		}
		return false;		//if not found, returning false
	}
	
	/**
	 * inserts the given object in the given index
	 * 
	 * @param index index in which location object to be inserted 
	 * @param obj object for inserting
	 * @throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 */
	public void add(int index, Object obj) {
		if(index<0 || index>elementCount)
			throw new IndexOutOfBoundsException(index); 
		
		if(size()==capacity()) {
			increaseCapacity();
		}
		
		for(int i=elementCount-1; i>=index; i--) {
			elementData[i+1] = elementData[i];
		}
		
		elementData[index] = obj;
		elementCount++;
	}

	/**
	 * replaces the given object in the given index
	 * 
	 * @param index index in which location object to be replaced 
	 * @param obj object for replacing
	 * @return replaced object
	 * @throws IndexOutOfBoundsException if index is &lt;0 || &gt;=size
	 */
	public Object set(int index, Object obj) {
		checkIndex(index);
		
		Object ele = elementData[index];
		elementData[index] = obj; 
		return ele;
	}

	/**
	 * for throwing exception if index is wrong
	 * 
	 * @param index to be checked
	 * @throws IndexOutOfBoundsException if index<0 || >=size
	 */
	private void checkIndex(int index) {
		if(index<0 || index>=elementCount)
			throw new IndexOutOfBoundsException(index);
	}
	
}
