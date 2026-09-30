interface I1{
	public static void helper(){
		System.out.println(m1());
	}
	private static String m1(){
		return "we are private method of I1";
	}
}
class DefaultDemo3 implements I1{
	public static void main(String args[]){
		I1.helper();
	}
	
}
