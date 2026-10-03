import java.util.Scanner;
void main(){
	int b=0;
	int c=0;
	int a=0;
	Scanner sc=new Scanner(System.in);
	try{
		IO.print("Enter Val1: ");
		a=sc.nextInt();
		IO.print("Enter Val2: ");
		 b=sc.nextInt();
		/*  if(b==0){
	    	System.exit(0);
		} */
		c=a/b;
			
		IO.println(c);
		for(;;){}
		
		
	
	}catch(ArithmeticException e){
		e.printStackTrace();
		try{
			IO.print("Enter once again Val2: ");
			b=sc.nextInt();
			
			c=a/b;
		}catch(ArithmeticException er){
			er.printStackTrace();
		}
		
	}catch(NumberFormatException e){
		e.printStackTrace();
	}/* catch(Exception e){
		IO.println(e.getMessage());
	} */
	
	finally{
		IO.println("I am in Finally...");
	}
}



/*
1. In catch also u can write the code.
2. if any exception rise in catch block
    catch can't handle Exception 
    if Exception is or diff

 3. if u want handle the Exception 
     Again we write try catch 
*/


