@FunctionalInterface
interface I1<T,R> {  // Generics <>
	R m1(T t);  
}

class FunctionalInterfaceDemo3{
	public static void main(String args[]){
	  I1<Integer,String> i1=a->(a%2==0)?"Even":"ODD";
	System.out.println(i1.m1(10));
	}
}

/*
// 
FunctionalInterfaceDemo2$ implements I1{
	
	
	
}




*/