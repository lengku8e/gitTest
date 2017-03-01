package JavaIo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Javaioliu {

	/*
	 * 输入流基类 InputStream Reader----------内存读取数据
	 * 输出流基类OutputStream Writer----------内存向外部写数据 即传出
	 * */
	
	/*字节流 字符流 用法几乎完全一样 区别是数据单元不同 字节流 8位字节 字符流 16位字符
	 * 字节流用InputStream 和 outputsteam
	 * 字符流用reader合writer、作为基类
	 * 
	 * InputStream Reader- 本身不能创建实例 都是抽象类 他们分别有一个用于读取文件的输入流 Fileinputstream  he  filereader
	 * 
	 * 
	 * */
	
	
	public static void main(String [] a) {
		FileWriter fw;
		try {
			fw = new FileWriter("2.txt");
			fw.write("jijdioajdoi");
			fw.write("锦瑟无端五十选");
		FileReader fis = new FileReader("1.txt");
				byte[] buf = new byte[1024];
				
				int hasRead= 0;//用于保存实际读取的字节数
				while((hasRead = fis.read())>0){
					
					//取出字节，将字节数组装换成字符串输入
					System.out.println(new String(buf,0,hasRead));
		
		} 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
		



			
	
}


