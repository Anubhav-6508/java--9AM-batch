@FunctionalInterface
interface MyFirstGen<A,T,R>{
	R m1(T t,A a);
}
class Teacher{
	public static void main(String args[]){
		MyFirstGen<Integer,Integer,Integer> mfg=new MyFirstGen<>(){
			 public Integer m1(Integer num1,Integer num2) {
				return num1+num2;
			}
		};
		IO.println(mfg.m1(10,20));
	}
}