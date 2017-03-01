package JavaIo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	
	/*
	 * 使用randomaccessfile文件内容访问类  允许随即访问  可以从文件任意位置开始读写数据
	 * 
	 * getFilePointer() 返回文件记录指针当前位置
	 * seek()跳转到指定文职
	 * 
	 * 
	 * 
	 * 
	 * */

	
	public static void main(String[] args) throws IOException{
		
		try {
			RandomAccessFile  a = new RandomAccessFile("test.txt", "rw");//r 为只读形式读取
			System.out.println(a.getFilePointer());
			a.seek(a.length());
		/*	a.seek(1);//跳过第一个字节
*/			byte[] ref = new byte[1024];
			a.write("追加的内容\r\n".getBytes());
			int hasRead = 0 ;
			while((hasRead = a.read(ref))>0){
				System.out.println(new String(ref,0,hasRead));

			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
