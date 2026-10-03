String m1(){
	try{m2(); return "";}catch(ArithmeticException e){
	return e.getMessage();}
}
void m2() throws ArithmeticException {m3();}
void m3()throws ArithmeticException {m4();}
void m4(){
	int a=5;
	int b=-1;
	if(a<0|| b<0){
		throw new IllegalArgumentException();
	}
	int c=a/b;
	IO.println(c);
}   // exception propogation 
void main(){
	IO.println(m1());
	IO.println("kjkfgyhn");
}