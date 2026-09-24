import java.io.*;
class OIS{
	public static void main(String args[])
	throws FileNotFoundException,IOException,ClassNotFoundException{
		FileInputStream fis=
		new FileInputStream("myObj.ser");
	ObjectInputStream ois=new 
		ObjectInputStream(fis);
		Object obj=ois.readObject();
		Student std=(Student)obj;
		IO.println(std);
		
		
	}
}