package www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args){
		
		try {
			Socket ss = new Socket("127.0.0.1",30000);//创建连接本机 30000端口的socket
			//socket对应输入流 包装成bufferedreader
			BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
			//普通的Io操作即可
			String line = br.readLine();
			System.out.print(line);
			br.close();
			ss.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
