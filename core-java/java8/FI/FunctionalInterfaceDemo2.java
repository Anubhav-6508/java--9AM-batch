@FunctionalInterface
interface I1{
	void m1(int a);  // 
	//-> they providing one work to one method
}

class FunctionalInterfaceDemo2{
	public static void main(String args[]){
		/*
				I1 i= new I1(){
				@Override
				public void m1(){
				  System.out.println("i am in proxy class");
					}
				};  
		
		*/ // lamda expression
	   I1 i= a->System.out.println("i am in proxy class"+ (a));
		
		
		i.m1(10);
	}
}

/*
// 
FunctionalInterfaceDemo2$ implements I1{
	
	
	
}




*/