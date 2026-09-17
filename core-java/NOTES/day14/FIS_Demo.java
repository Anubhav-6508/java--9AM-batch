import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class FIS_Demo{
	public static void main(String args[]) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("abcd.text");
		int val1=fis.read();
		int val2=fis.read();
		int val3=fis.read();
		int val4=fis.read();
		String str="abcg";
	 byte[] byteValue= str.getBytes();
		int bval=fis.read(byteValue);
		IO.println(val1);
		IO.println(val2);
		IO.println(val3);
		IO.println(val4);
		IO.println(bval);
		fis.close();
	}
	
}