import static java.lang.IO.*;
import java.io.*;
class FileDemo{
	void main() throws IOException{
		File f1=new File("abc.text");
		println(f1.exists());
		println(f1.createNewFile());
		
		File f2=new File("TEXT_FOLDER");
		println(f2.exists());
		println(f2.mkdir());
		
	File f3=new File("TEXT_FOLDER","First");
	println(f3.mkdir());
	File f4=new File("TEXT_FOLDER\\First","aj.text");
	println(f4.createNewFile());
	
	File f5=new File("abc.text");
	println(f5.delete());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}