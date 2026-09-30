import java.lang.NumberFormatException;
void main(){
	IO.println(m1());
}
public int m1(){
	try{
		int a=Integer.parseInt(IO.readln()); //"a" //1
		return a; //NFE
	}catch(ArithmeticException e){
		IO.println("value must be integer");
	}finally{  // Object jdh  [10] //jvm Default handler
	IO.println("i am in Finally block");//2
		return 10;
	}  //
// 1.IO.println("i am in Finally block"); 
// 2. NFE
//=====================
//1.IO.println("i am in Finally block"); 
//10
//NFE
	
}