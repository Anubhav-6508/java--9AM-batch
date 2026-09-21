import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class FOS_Demo{
	public static void main(String args[])throws FileNotFoundException,IOException{
	FileOutputStream fos=new FileOutputStream("abcd.text");
     fos.write(5);
	 String str="abcg";
	 byte[] byteValue= str.getBytes();
	 fos.write(byteValue);
	
     fos.close();
	 IO.println("data added Succesfully..");
	  	
	}
}