class Demo{
	private int num1; //field //instance variable
	private int num2;
	
	public void setNum1(int num1){
		//1010
		this.num1=num1;
	}
	public int  getNum1(){
		return num1;
	}
	public void setNum2(int num2){
		this.num2=num2;
	}
	public int getNum2(){
		return num2;
	}
}
class Day6Part2{
	public static void main(String args[]){
		//1010
		Demo d6=new Demo();
		//d6.num1=100;
		d6.setNum1(Integer.parseInt(IO.readln("Enter num1 : ")));
		int num1=d6.getNum1();
		System.out.println(num1);
	}
	
}