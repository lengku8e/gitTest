package www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable {

	BufferedReader br = null;
	Socket sc = null;
	public ClientThread(Socket s) {
		// TODO Auto-generated constructor stub
		this.sc = s;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));//包装从客户端socket传来的数据
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
String content = null;
		try {
			while((content = br.readLine())!=null){
				
				System.out.print(content);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
