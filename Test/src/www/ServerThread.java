package www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable {

	BufferedReader br = null;
	Socket s= null;
	public ServerThread(Socket sc) throws IOException {
		
		this.s = sc;
		 br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
String content = null;
		while((content = readFromClient())!=null){
			
			for(Socket s : Myserver.socketlist){
				
			
					try {
						PrintStream ps = new PrintStream(s.getOutputStream());//向每个客户端发送信息
						ps.print(content);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				
			}
			
		}
		
	}
/*
 * 读取客户端数据的方法
 * 
 * 
 * */
	private String readFromClient() {
		// TODO Auto-generated method stub
		
		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Myserver.socketlist.remove(s);//出现异常就再socketlist中移除
		}
		
		
		return null;
	}

}
