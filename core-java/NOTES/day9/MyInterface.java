interface Interface1{
	void m1();  // abstract method
}
interface Interface2{
	void m1();
	void m2();
}
class ChildInterface implements Interface1,Interface2{
	public void m1(){
			System.out.println("hi........");
	}
	public void m2(){
			System.out.println("hlo........");
	} 
}

class MyInterface{
	void main(){
		Interface2 it=new ChildInterface();
		it.m2();
	}
}

// if u creating abstract method the class must abstract or interface.
//in interface by default methos public abstract
// if ther abstract method in interface we must Override abstract method
// when u create interface and u are iheriting to concret class  it become 
  // contract between interface and class that they override there abstract method
// Interface support mutiple iheritance
  // why?
  // in interface there no constructer the no point of ambiguti

//how many types of interface are there in java ?
/*   
   there three type :
  1. Normal Interface
  2. Marker Interface
  3. Functional Interface 
  */
// Marker Interface
 //   : no abstract method  
/*  example:
 Interface abc{
	 
 }  */
 
  
// Functional Interface 
/*  A interface having only one abstract method is called 
 Functional Interface  */