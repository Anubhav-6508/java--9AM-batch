import java.io.*;
class Student implements Serializable{
	int sId;
	String sName;
	double fee;
	public Student(int sId,String sName,double fee){
		this.sId=sId;
		this.sName=sName;
		this.fee=fee;
	}
	public String toString(){
		return sId+" "+sName+" "+fee;
	}
}























//private static final long serialVersionUID = 1L;