import java.io.*;
class Student implements Serializable{
	private static final long serialVersionUID = 200L;
	transient int sId;
	String sName;
	double fee;
	int age;
	public Student(int sId,String sName,double fee){
		this.sId=sId;
		this.sName=sName;
		this.fee=fee;
	}
	public String toString(){
		return sId+" "+sName+" "+fee;
	}
}























//