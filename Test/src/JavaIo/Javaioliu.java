package JavaIo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Javaioliu {

	/*
	 * ���������� InputStream Reader----------�ڴ��ȡ����
	 * ���������OutputStream Writer----------�ڴ����ⲿд���� ������
	 * */
	
	/*�ֽ��� �ַ��� �÷�������ȫһ�� ���������ݵ�Ԫ��ͬ �ֽ��� 8λ�ֽ� �ַ��� 16λ�ַ�
	 * �ֽ�����InputStream �� outputsteam
	 * �ַ�����reader��writer����Ϊ����
	 * 
	 * InputStream Reader- �����ܴ���ʵ�� ���ǳ����� ���Ƿֱ���һ�����ڶ�ȡ�ļ��������� Fileinputstream  he  filereader
	 * 
	 * 
	 * */
	
	
	public static void main(String [] a) {
		FileWriter fw;
		try {
			fw = new FileWriter("2.txt");
			fw.write("jijdioajdoi");
			fw.write("��ɪ�޶���ʮѡ");
		FileReader fis = new FileReader("1.txt");
				byte[] buf = new byte[1024];
				
				int hasRead= 0;//���ڱ���ʵ�ʶ�ȡ���ֽ���
				while((hasRead = fis.read())>0){
					
					//ȡ���ֽڣ����ֽ�����װ�����ַ�������
					System.out.println(new String(buf,0,hasRead));
		
		} 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
		



			
	
}


