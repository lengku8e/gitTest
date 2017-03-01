package www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {

	public static void main(String [] a) throws IOException, IOException{
		
		Socket s = new Socket("127.0.0.1",3000);
		
		new Thread(new ClientThread(s)).start();//客户端启动线程 不断读取来自服务端的数据
		PrintStream ps  = new PrintStream(s.getOutputStream());
		
		
		//键盘输入内容包装成bufferdreader 并读取写入socket对应的输出流
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine())!=null){
			ps.print(line);
			
			
			
			
		}
		
		
	}
}
