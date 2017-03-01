package JavaIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zhuanhuanzijieliu {
/*
 * 字节流转换为字符流
 * 转换流：InputStreamReader   outPuTSREAMwRITER
 * */
	
	public static void main(String [] arge){
		
		
		InputStreamReader rd = new InputStreamReader(System.in);//输入字符串  转换为字符流读取0
		BufferedReader br = new BufferedReader(rd);
	String buf = null;
	try {
		while((buf=br.readLine())!=null){
			if(buf.equals("exit")){
				
				System.exit(1);
				}//退出
			System.out.print(buf);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		
		
		
		
		
	}
}
