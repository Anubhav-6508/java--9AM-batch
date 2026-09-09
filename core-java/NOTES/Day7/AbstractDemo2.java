/*
abstract class Parent{
	public abstract String m1();
	public abstract String m2();
}
class Child extends Parent{
	public String m1(){
		return "hlo ....";  //15000
	}
	public String m2(){
		return "hllo ....";//1000
	}
	
}
class SubChild extends Parent{// multiple inheritance
	public String m1(){
		
		return "hy ....";  //15000
	}
	public String m2(){
		return "hy ....";//1000
	}
}
class Main{
	void main(){
		String str=IO.readln("Enter sub/child");
		if(str.equals("sub")){
			Parent p=new SubChild();
			IO.println(p.m1());
			IO.println(p.m2());
		}else if(str.equals("child")){
			Parent p=new Child();
			IO.println(p.m1());
			IO.println(p.m2());
		}
		
		
	}
}

*/
//---
final abstract class Parent{
	//public static abstract void m1();
	//public private abstract void m1();
	//public final abstract void m1();
	public static abstract void m1();
	public void m2(){
		System.out.println("kvgrj3huon");
	}
	
}
 
