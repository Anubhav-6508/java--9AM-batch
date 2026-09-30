import java.lang.*;
void main(){
	try{
		int  num1=Integer.parseInt
		(IO.readln("Enter num1")); //10
		int num2 =Integer.parseInt
		(IO.readln("Enter num2"));// 22
		   int num3=num1/num2;  //1
		   
		return;
	}
	catch(ArithmeticException e){  // JDH[NumberFormatException]
	//JDH[return ]
		e.printStackTrace();
	}
	finally{
		System.out.println("To close the Resource");
		
		// resource clean up
	}
	
	
	
}