class Student{
	int id;
    String name;
	boolean attendence;
	float percentage;
	char grade;
	long phoneNumber;
	double fee;
	
	public Student(int id ,String name,boolean attendence,float percentage,char grade,
	long phoneNumber,double fee){
		this.id=id;
		this.name=name;
		this.attendence=attendence;
		this.percentage=percentage;
		this.grade=grade;
		this.phoneNumber=phoneNumber;
		this.fee=fee;
	}
	
	@Override
	public String toString(){
		return id +" "+ name+" "+attendence+" "+
		percentage+" "+grade+" "+phoneNumber+
		" "+fee;
	}
	
	
}