package www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {

	public static void main(String [] a) throws IOException, IOException{
		
		Socket s = new Socket("127.0.0.1",3000);
		
		new Thread(new ClientThread(s)).start();//�ͻ��������߳� ���϶�ȡ���Է���˵�����
		PrintStream ps  = new PrintStream(s.getOutputStream());
		
		
		//�����������ݰ�װ��bufferdreader ����ȡд��socket��Ӧ�������
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine())!=null){
			ps.print(line);
			
			
			
			
		}
		
		
	}
}
