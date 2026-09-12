void main(){
  // Consumer is predefine Functional interface
  // having only one abstract method
  // Consumer<T>  
  //  public abstract void accept(T);
     Consumer<Character> cc = chars ->System.out.println(chars);
	 cc.accept('A');
}

/*
/The additional functional interfaces for two arguments
//1. BiConsumer<T, U>
//2. BooleanSupplier
//3. BiFunction<T, U, R>
//4. BiPredicate<T, U>
*/