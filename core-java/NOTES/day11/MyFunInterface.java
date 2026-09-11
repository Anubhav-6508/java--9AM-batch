/* @FunctionalInterface
interface myfirst1<T> {
	void m1(T t);
} */
/* @FunctionalInterface
interface myfirst1<T,U> {
	void m1(T t, U u);
} */
@FunctionalInterface
interface myfirst1<T,U,R> {
	R m1(T t, U u);
}
class MyFunInterface{
	public static void main(String args[]){
		//Anonnymous class
	/*  myfirst1<Integer,Integer,String> mm=new myfirst1<>(){
		 @Override
		public String m1(Integer a, Integer b){
			 return (a+b)%2==0?"even No":"Odd No";
		 }
		 
	 };
	IO.println(mm.m1(10,5)); */
	
	/* myfirst1<Integer,Integer,String> mm=(Integer num, Integer num2)->{
		return (num+num2)%2==0?"even No":"Odd No";
	};
	IO.println(mm.m1(10,5));  */
	
	/* myfirst1<Integer,Integer,String> mm=(num,num2)->{
		return (num+num2)%2==0?"even No":"Odd No";
	};
	IO.println(mm.m1(10,5));  */
	myfirst1<Integer,Integer,String> mm=(num,num2)->(num+num2)%2==0?"even No":"Odd No";
	IO.println(mm.m1(10,5)); 
	
 }
}