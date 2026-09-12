@FunctionalInterface
interface FIP{
	void m1(int a);
}
void main(){
	// FIP fip=new FIP(){
      // public void m1(int a){
		  // IO.println(a);
	  // }
	// };
	
	FIP fip=a->IO.println(a);
	//FIP fip= a ->{System.out::println;};
	fip.m1(10);
}

// predifine Functional Interface.

// 1.Predicate<T>
// public interface java.util.function.Predicate<T> {
  // public abstract boolean test(T);
  // public default java.util.function.Predicate<T> and(java.util.function.Predicate<? super T>);
  // public default java.util.function.Predicate<T> negate();
  // public default java.util.function.Predicate<T> or(java.util.function.Predicate<? super T>);
  // public static <T> java.util.function.Predicate<T> isEqual(java.lang.Object);
  // public static <T> java.util.function.Predicate<T> not(java.util.function.Predicate<? super T>);
// }


// 2.Function<T,R>
// public interface java.util.function.Function<T, R> {
  // public abstract R apply(T);
  // public default <V> java.util.function.Function<V, R> compose(java.util.function.Function<? super V, ? extends T>);
  // public default <V> java.util.function.Function<T, V> andThen(java.util.function.Function<? super R, ? extends V>);
  // public static <T> java.util.function.Function<T, T> identity();
// }


// 3.supplier<T>
// public interface java.util.function.Supplier<T> {
  // public abstract T get();
// }
// 4.consumer<T>
// public interface java.util.function.Consumer<T> {
  // public abstract void accept(T);
  // public default java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T>);
// }














