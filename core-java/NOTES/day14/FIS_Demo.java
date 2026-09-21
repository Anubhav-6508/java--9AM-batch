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
		int val5=fis.read();
		int val6=fis.read();
		IO.println(val1 +"   "+ (char)val1);
		IO.println(val2+ "   "+ (char)val2);
		IO.println(val3+ "   "+ (char)val3);
		IO.println(val4+ "   "+ (char)val4);
		IO.println(val5+ "   "+ (char)val5);
		IO.println(val6+ "   "+ (char)val6);
		fis.close();
	}
	
}