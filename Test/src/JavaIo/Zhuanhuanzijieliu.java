package JavaIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zhuanhuanzijieliu {
/*
 * �ֽ���ת��Ϊ�ַ���
 * ת������InputStreamReader   outPuTSREAMwRITER
 * */
	
	public static void main(String [] arge){
		
		
		InputStreamReader rd = new InputStreamReader(System.in);//�����ַ���  ת��Ϊ�ַ�����ȡ0
		BufferedReader br = new BufferedReader(rd);
	String buf = null;
	try {
		while((buf=br.readLine())!=null){
			if(buf.equals("exit")){
				
				System.exit(1);
				}//�˳�
			System.out.print(buf);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		
		
		
		
		
	}
}
