@FunctionalInterface
interface I1{
	void m1();
}
class A implements I1{
	@Override
	public void m1(){
		System.out.println("class A m1()");
	}
}
class FunctionalInterfaceDemo{
	public static void main(String args[]){
		I1 i= new A();
		i.m1();
	}
}