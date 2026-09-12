void main(){
	
	BiConsumer<String,Integer> bic=(str,num)->
	System.out.println(str+" "+num);
	
	bic.accept("abc",123);
	
}