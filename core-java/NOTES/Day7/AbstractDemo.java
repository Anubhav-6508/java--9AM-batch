/*
// partially abstract class...
 <abstract> <class> <name>{
	 abstract void m1(); 
 }
*/

//
abstract class Demo{
	public Demo(String msg){
		System.out.println(msg);
	}
	abstract void m1();
}
class ChildDemo extends Demo{
	public ChildDemo(){
		super("Hy from Child");
	}
	public void m1(){
		System.out.println(withdraw());
	}
	
	private String withdraw(){
		return "withdraw succesfully..";
	}
	
}
class AbstractDemo{
	public static void main(String args[]){
		//Demo is abstract; cannot be instantiated
		Demo d=new ChildDemo();
		d.m1();
	}
}
