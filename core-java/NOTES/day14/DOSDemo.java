import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class DOSDemo{
	public static void main(String args[])throws FileNotFoundException,IOException{

	DataOutputStream dos=new DataOutputStream(
	new FileOutputStream("abcd.text")
	); 
	  dos.writeInt(97);
	  dos.close();
	}
}