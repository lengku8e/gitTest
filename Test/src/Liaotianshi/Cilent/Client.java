package Liaotianshi.Cilent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import Liaotianshi.CrazyitProtocao;

public class Client {

	private static final int SERVER_PORT = 30000;
	private Socket socket ;
	private PrintStream ps ;
	private BufferedReader brServer;
	private BufferedReader keyIn;
	
	public static void main (String [] a){
		Client client = new Client();
	
		client.init();
		client.readAndSend();//����һ�����϶�ȡ�������� �������緢�͵ķ���
	}



	public void init(){
		try {
			keyIn = new BufferedReader(new InputStreamReader(System.in));
			socket  = new Socket("127.0.0.1",SERVER_PORT);
			
			ps  = new PrintStream(socket.getOutputStream());//��ȡ��Ӧ�����������������
			brServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));//��ȡ��Ӧ����������ͻ�������
			
			String tip = "";
			//ѭ�������Ի��� Ҫ�������û���
			while(true){
				
				String userName = JOptionPane.showInputDialog(tip+"�����û���");
				
				ps.print(CrazyitProtocao.USER_ROUND+userName+CrazyitProtocao.USER_ROUND);//������������û���
				String result= brServer.readLine();//����������Ӧ��Ϣ
				if(result.equals(CrazyitProtocao.NAME_REP)){
					
					
					tip = "�û����ظ� ��������";
					continue;
				}
				if(result.equals(CrazyitProtocao.LOGIN_SUCCESS)){
					
					break;//��½�ɹ� ����ѭ��
				}
					
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
		System.out.print("�Ҳ���Զ�̷�������ȷ���Ѿ�����");
		closeRs();//�ر�socket�Լ�����������ķ���
		System.exit(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("�������쳣");
			closeRs();//�ر�socket�Լ�����������ķ���
			System.exit(1);
		}
		
	new ClienThread(brServer).start();

	}
	
	
	private void closeRs() {
		// TODO Auto-generated method stub
		
		try {
			if(keyIn!=null){
				ps.close();
			}
			if(brServer!=null){
				ps.close();
				
			}
			if(ps!=null){
				
				ps.close();
			}
			if(socket !=null){
				keyIn.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}





	public void readAndSend(){
		String line = null;
		try {
			//���϶�ȡ��������
			while((line = keyIn.readLine())!=null){
				//�ж��� ˽����Ϣ
				if(line.indexOf(":")>0&&line.startsWith("/")){
					
					line = line.substring(1);
					ps.print(CrazyitProtocao.PRIVATE_ROUND+line.split(":")[0]
				 +CrazyitProtocao.SPLIT_SIGN+line.split(":")[1]+CrazyitProtocao.MSG_ROUND);
							
				}else{
					ps.print(CrazyitProtocao.MSG_ROUND+line+CrazyitProtocao.MSG_ROUND);				
				}	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("�����쳣 ���µ�½");
			closeRs();
			System.exit(1);
		}
		
		
	}
	
	
}
