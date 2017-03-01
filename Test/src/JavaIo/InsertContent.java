package JavaIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertContent {
	
	
	/*ʵ���ļ�ָ��λ��charugongn
	 * ͨ��������ʱ�ļ� ����ָ��λ���Ժ������
	 * �����¶�λ����� �������ݺ�
	 * �����ʱ�ļ�������ӵ��ļ����
	 * 
	 * 
	 * */
	public static void insert(String fileName,long pos,String insertContent){
		
		try {
			File tmp = File.createTempFile("tmp",null);//������ʱ�ļ������ȡλ���Ժ������
			tmp.deleteOnExit();//�˳���ɾ��
			FileOutputStream out = new FileOutputStream(tmp);
			FileInputStream in = new FileInputStream(tmp);
			RandomAccessFile  raf = new RandomAccessFile(fileName,"rw");
			
			raf.seek(pos);
			
			byte[] buf = new byte[64];
			int hasRead = 0 ;
			while((hasRead = raf.read(buf))>0){
				out.write(buf,0,hasRead);
			}
			
			//���¶�λλ��
			raf.seek(pos);
			raf.write(insertContent.getBytes());//����
			
			while((hasRead = in.read(buf))>0){
				
				raf.write(buf,0,hasRead);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String [] a){
		
		insert("test.txt",2,"��������\r\n");
		
		
	}
	
	

}
