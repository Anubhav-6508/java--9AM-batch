void main(){
	// Function is predefine functional interface
	// Function<T,R>  R apply(T t)
	Function<String,String>  fun =str->(str.length()<10)?"String length lessthan 10": "String length greater 10";
	String s=fun.apply("abcdefghi");
	IO.println(s);
}