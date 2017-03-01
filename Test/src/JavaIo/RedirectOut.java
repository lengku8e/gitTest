package JavaIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectOut {

	
	/*System类提供了3个重定向标准输入输出的方法
	 * setErr（）重定向标准错误输出流
	 * setOut 重定向标准输出流
	 * setin重定向标准输入流
	 * 
	 * 
	 * 
	 * 
	 * /
	 */
	public static void main(String [] a) {
		
		
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
			
			System.setOut(ps);//标准输出out打印到屏幕 而setout重新定向为ps对象上输出到本地磁盘目录
			System.out.print("普通字符串");//
			System.out.println(new RedirectOut());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
