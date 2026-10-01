interface i1{
	 void m1();
	 default void _5g(){
		 IO.println("khsdffheruo");
	 }
}
class DefaultDemo implements i1{
	public void m1(){  
		System.out.println("DefaultDemo in m1()");
	}
	void main(){
		i1 i=new DefaultDemo();
		i.m1();
		i._5g();
	}

} 