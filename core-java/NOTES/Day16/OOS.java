import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class OOS{
	public static void main(String args[])
	throws FileNotFoundException,IOException{
	//Student objects
	Student std1=new Student(101,"RJ",5000.356);
	
	
    //building connection to send object to file	
	FileOutputStream fos=
		new FileOutputStream("myObj.ser");
		ObjectOutputStream oos=new 
		ObjectOutputStream(fos);

		oos.writeObject(std1);
		oos.close();
		IO.println("Student Object Send to ser file succesfully......");
		
	}
}