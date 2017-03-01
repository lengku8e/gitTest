package UDPxieyi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class Udp {
	


	/*
	 * �û����ݱ�Э�� ��Ҫ������������������������ݱ�֮���ת��--
	 * ���Ͷ�UDP����������װ�����ݱ� ���ն� �����ݱ�װ����ʵ����������
	 * 
	 * TCP HE UDP�Ա�
	 * tcp  �ɿ� ������  ������Ҫʱ�� �����ƿ�����
	 * udp  ���ɿ� �����С ��С������64k ����Ҫ��������
	 *  
	 *  ͨ��DatagtamSocket���� ��������
	 *   receive()  send()���������������ͺͽ������ݱ�
	 *  DatagramPacket �������ݱ� 
	 *  
	 *  ���ڽ��շ���֪�����ݱ��������� datagramPacket �ṩ ��������
	 *  getAddress() ����ip��ַ
	 *  getPort()    ���ض˿ں�
	 *  getSocketAddress()  ����socketAddress
	 * */

	
	
	private static final int PORT = 30000;
	public static final int DATA_LEN=4096;//�������ݱ��ĳ���
	
	byte [] inBuff = new byte[DATA_LEN];//��������������ݵ��ֽ�����
	
	private DatagramPacket inPacket = new DatagramPacket(inBuff, inBuff.length);//Ϊָ���ֽ����鴴��׼���������ݵĶ���
	
	
	private DatagramPacket outPacket ;//׼���������ݵĶ���
	
	String [] books = new String[]{
			"�����","��˽�"
	};//����˷��͸��ַ���
	
	public static void main (String [] a){
		try {
			new Udp().init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void init() throws IOException {
		// TODO Auto-generated method stub
		try {
			DatagramSocket socket = new DatagramSocket(PORT);
			//ѭ����������
			for(int i = 0 ;i<1000;i++){
				
			socket.receive(inPacket);//socket���յ����� ���뵽inPacket������
				System.out.print(inBuff==inPacket.getData());//�ж��Ƿ���ͬһ������
				
				System.out.print(new String(inBuff,0,inPacket.getLength()));//���յ�������ת�����ַ���
				
				byte [] senddata = books[i%4].getBytes();
			}
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
 