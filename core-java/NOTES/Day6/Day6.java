class Day6{
	int num1; //field //instance variable
	int num2;
	
	public void set(int num1){
		//1010
		this.num1=num1;
	}
	public void  get(){
		System.out.println(num1);
	}
	public static void main(String args[]){
		    //1010
		Day6 d6=new Day6();
		d6.set(12);
		d6.get();
	}
}