abstract class MyAbstract{
	int num;
	String name;
	public MyAbstract(int num ,String name){
		this.num=num;
		this.name=name;
	}
	public void display(){
		IO.println(num +" "+name);
	}
}
abstract class MyAbstract2{
	
}
class ChildAb extends MyAbstract{
	
	ChildAb(int num ,String name){
		super(num,name);
	}
}
class Main2{
	void main(){
		MyAbstract mab=new ChildAb(1,"ABCD");
		mab.display();
	}
}