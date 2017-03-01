package JavaIo;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {
public static void main(String [] args){
	FileOutputStream fo;
	try {
		fo = new FileOutputStream("test.txt");
		PrintStream ps = new PrintStream(fo);
		ps.println("asdadsad");
		FileReader f = new FileReader("test.txt");
		int hasRead = 0;
		char[] buf = new char[32];
		try {
			while((hasRead=f.read())>0){
				System.out.println(ps.toString());
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	
	
}
		
}
