import java.util.function.*;
void main(){
	// predicate is predefine Functional Interface
	// having only abstract method 
	//   test method
	// boolean test(T t);
	Predicate<String>  pp=str->str.length()<10;
	
	boolean bb=pp.test("sdyajgbdskab");
	if(bb){
		IO.println("String length less 10");
	}
	else{
		IO.println("String length greater 10");
	}
}