import java.util.Arrays;
class Day8{
	//RD type
	public static void main(String args[]){
		// array
		// String
		// class
	
		//int a=10;
		//int []a={1,2,3,5,7,9876};
		//int [] a=new int[5];
		//Array--> 
		//Day8 obj=new Day8();
		//int [] obj =new int[5];
		//int a=10;
		      //1010
		/* int [] abc =new int[10];
		abc[0]=10;
		abc[1]=20;
		abc[2]=30;
		abc[3]=40;
		abc[4]=50;
		abc[5]=60;
		abc[6]=70;
		abc[7]=80;
		abc[8]=90;
		abc[9]=100; */
		/* System.out.println(Arrays.toString(abc));
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		//....
		System.out.println(abc[9]); */
		/* for(int i=0;i<abc.length;i++){
			System.out.println(abc[i]);
		}  */
		
		//String str="fffgg";
		//String val='jsdghb';
		
		//String str2="""";
		
		/* String str="fffgg";
		String str2="1223344"; */
		//Student std1 =new Student();
	/*
	
	public Student(int id ,String name,boolean attendence,float percentage,char grade,
	long phoneNumber,double fee)
	
	*/
	 Student [] std1=new Student[6];
		std1[0]=new Student(1,"jhhgu",true,65.8f,'A',
		7879898l,89000.56);
			std1[1]=new Student(2,"ABC",false,68.89f,'B',
			78255666l,9666.86);
		std1[2]=new Student(3,"lkjsh",true,75.52f,'c',56622366l,25000.226);
		std1[3]=new Student(4,"khsdgb",true,70.56f,'D',54613562l,3526.255);
		std1[4]=new Student(5,"abcdf",false,70.56f,'D',54613562l,3526.255);
		//Student[5]=new Teacher(1,"Aj");
		System.out.println(Arrays.toString(std1));
		Student stdObj=new Student(5,"abcdf",false,70.56f,'D',54613562l,3526.255);
		System.out.println(stdObj.id);
		for(int i=0;i<std1.length;i++){
			System.out.println(std1[i]);
		}

	}
}