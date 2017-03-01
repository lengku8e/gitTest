package JavaIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertContent {
	
	
	/*实现文件指定位置charugongn
	 * 通过创建临时文件 保存指定位置以后的内容
	 * 再重新定位插入点 插入内容后
	 * 最后将临时文件内容添加到文件后边
	 * 
	 * 
	 * */
	public static void insert(String fileName,long pos,String insertContent){
		
		try {
			File tmp = File.createTempFile("tmp",null);//创建临时文件保存读取位置以后的内容
			tmp.deleteOnExit();//退出即删除
			FileOutputStream out = new FileOutputStream(tmp);
			FileInputStream in = new FileInputStream(tmp);
			RandomAccessFile  raf = new RandomAccessFile(fileName,"rw");
			
			raf.seek(pos);
			
			byte[] buf = new byte[64];
			int hasRead = 0 ;
			while((hasRead = raf.read(buf))>0){
				out.write(buf,0,hasRead);
			}
			
			//重新定位位置
			raf.seek(pos);
			raf.write(insertContent.getBytes());//插入
			
			while((hasRead = in.read(buf))>0){
				
				raf.write(buf,0,hasRead);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String [] a){
		
		insert("test.txt",2,"插入内容\r\n");
		
		
	}
	
	

}
