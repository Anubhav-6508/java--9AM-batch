import static java.lang.IO.*;
void main(){
	// compiler and jvm
	try{
		int a=Integer.parseInt(readln("Enter Number1: "));
		int b=Integer.parseInt(readln("Enter Number2: "));
		
		int c=a/b; 
		println(c);
	}catch(NumberFormatException ne){
		println("Enter the number only");
	}catch(ArithmeticException ae){
		println("Enter the number2 must greater than Zero");
	}
	
	println("I have completed my operation....");
}