interface I1{
	public default void m1(){
		System.out.println("M1() in I1");
	}
	public String m2();
}
interface I2{
	public default void m1(){
		System.out.println("M1() in I1");
	}
	public String m2();
}
class DefaultDemo2 implements I1,I2{
	@Override
	public void m1(){
		I2.super.m1();
		System.out.println("M1() in DefaultDemo2");
	} 
	@Override
	public String m2(){
		return "m2() in DefaultDemo2";
	}
	
	public static void main(String args[]){
		I1 i=new DefaultDemo2(); //uc
		i.m1();
		System.out.println( i.m2());
	}
	
}
// in interface
// two we can override 
// default , abstract

//


/*
java 8 new method{
		1. static 
		2. private
	    3. default
			
			
	}

*/


