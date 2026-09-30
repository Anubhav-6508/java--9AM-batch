import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;
class ExceptionDemo2{
	int a;
	int b;
	public static void main(String arr[]){	
	ExceptionDemo2 ed=new ExceptionDemo2();
// String arr[]={1,2}
// java.lang.ArrayIndexOutOfBoundsException
// if u try access index which not present in array
//  then u get ArrayIndexOutOfBoundsException
	try{// javaED2 A 
		 ed.a =Integer.parseInt(arr[0]); 
		  IO.println("abc"+" i am in first try block ");
		//1---------------
		//]]]]]]]]]]]
		}catch(NumberFormatException e){
			//e.printStackTrace();   //handle it
			IO.println("abc"+" i am in catch NumberFormatException ");
			
			IO.println(e.getLocalizedMessage());	
		}catch(ArrayIndexOutOfBoundsException e){
				//e.printStackTrace();
			IO.println("abc"+" i am in catch ArrayIndexOutOfBoundsExceptio ");
				IO.println(e.getLocalizedMessage());	
	}
		
	try{
		ed.b =Integer.parseInt(arr[1]);  //2
		 IO.println("bcd"+" i am in sec try block ");
		int c=ed.a/ed.b;
		 IO.println("cef"+" i am in sec2 try block ");
		IO.println(c);
	}catch(NumberFormatException e){
		//e.printStackTrace();
		IO.println(e.getLocalizedMessage());	
	}catch(ArrayIndexOutOfBoundsException e){
			//e.printStackTrace();
			IO.println(e.getLocalizedMessage());	
	}
		
		IO.println("Hello World");
		
	}
	
}