import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class DOS{
	public static void main(String args[])throws FileNotFoundException,IOException{
		DataOutputStream dos=new
			DataOutputStream(new FileOutputStream("E:/ZenInfoTechStudents/9am-Batch/core-java/NOTES/Day15/DataStream.txt"));
			
		dos.writeByte(97); // 1byte
		dos.writeShort(98);  // 2 byte [ ,a]
	    dos.writeInt(99);
		dos.writeChar(100);
		dos.writeLong(1000);
		dos.writeFloat(899.85f);
		dos.writeDouble(3666.56);
		dos.writeBoolean(true);
		dos.writeUTF("we learning DOS"); 
		dos.flush();
		dos.close();
		IO.println("DATA ADDED SUCCESSFUL");
		
	}
	
}