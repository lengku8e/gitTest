package JavaIo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	
	/*
	 * ʹ��randomaccessfile�ļ����ݷ�����  �����漴����  ���Դ��ļ�����λ�ÿ�ʼ��д����
	 * 
	 * getFilePointer() �����ļ���¼ָ�뵱ǰλ��
	 * seek()��ת��ָ����ְ
	 * 
	 * 
	 * 
	 * 
	 * */

	
	public static void main(String[] args) throws IOException{
		
		try {
			RandomAccessFile  a = new RandomAccessFile("test.txt", "rw");//r Ϊֻ����ʽ��ȡ
			System.out.println(a.getFilePointer());
			a.seek(a.length());
		/*	a.seek(1);//������һ���ֽ�
*/			byte[] ref = new byte[1024];
			a.write("׷�ӵ�����\r\n".getBytes());
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
