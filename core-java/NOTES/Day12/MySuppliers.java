void main(){
	// Supplier is predefine FI 
	// having single abstract method
	// T supplier() T get
	
    Supplier<Double> sup=()->56.55;
	Double d=sup.get();
	IO.println(d);
}