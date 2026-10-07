void main(){
	int age=Integer.parseInt
	(IO.readln("Enter your Age : "));
	if(age>18){
		IO.println("Your are Eligible for vote. ");	
	}else{
		throw new 
		AgeLess18Exception("Age must begreater than 18");
	}
}