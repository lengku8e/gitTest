package www;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPtest {
/*
 *TCPЭ������˵���Э�飬��Ҫ����ͨ��ʵ����룬һ�������ҷ�ȷ�����û���յ�ȷ����Ϣ ��һֱ����
 *
 * ʹ��serverSocket����tcp��������������������ͨ��ʵ����������� �����ͻ������� 
 * accept�����������տͻ�������
 * һ������ѭ������accept���� ���Ͻ�������
 * 
 * Socketͨ�������������������������� getInputStream  getOutoutStream
 * */
	public static void main(String [] a){
		try {
			ServerSocket ss = new ServerSocket(30000);//����ServerSocket����������
			while(true){
				
				Socket s = ss.accept();//������յ����� ����socket����
				PrintStream ps = new PrintStream(s.getOutputStream());//�������װ��Printstream
				ps.print("�յ�");//��ͻ��˷�����Ϣ������print����д����
				ps.close();
				s.close();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	
	

}
