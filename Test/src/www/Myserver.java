package www;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Myserver {
  
	
	public static ArrayList<Socket> socketlist = new ArrayList<Socket>();
	public static void main(String [] a) throws IOException{
		
		ServerSocket s = new ServerSocket(3000);
		
	while(true){
		Socket sc = s.accept();
		socketlist.add(sc);
		new Thread(new ServerThread(sc)).start();//ÿ���ͻ�������һ�� ��������һ���߳� Ϊ�ÿͻ��˷���
		
		
	}
		
		
	}

}
