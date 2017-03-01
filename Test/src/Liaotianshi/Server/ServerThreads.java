package Liaotianshi.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import Liaotianshi.CrazyitProtocao;

public class ServerThreads extends Thread{

	public Socket socket;
	BufferedReader br = null;	
	PrintStream ps = null;
	public ServerThreads(Socket s){
		
		this.socket = s;
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			//��ȡ��Ӧ������
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//��ȡ��Ӧ�����
			ps = new PrintStream(socket.getOutputStream());
			String readLine = null;
			while((readLine = br.readLine())!=null){
				String userName = getRealMsg(readLine);//�����û���Э���ַ���ʼ�Ͻ��������� ��ȷ����½��Ϊ�û���
				
				if(readLine.startsWith(CrazyitProtocao.USER_ROUND)&&readLine.endsWith(CrazyitProtocao.USER_ROUND)){
					
					
					if(Server.clients.containsKey(userName)){
						System.out.print("�û��ظ�");
						ps.print(CrazyitProtocao.NAME_REP);
						
					}
					
				}else{
					System.out.print("�ɹ�");
					ps.print(CrazyitProtocao.LOGIN_SUCCESS);
					Server.clients.put(userName, ps);//����Ӧ�û� �Լ�socket�����뼯��
					
				}
				
				/*
				 * ����˽�Ķ���Ĺ���
				 * 
				 * */
				/*�������String PRIVATE_ROUND ��ʼ����� ��Ϊ˽����Ϣ
				 * ֻ��ָ�������������
				 * 
				 * */
	       if(readLine.startsWith(CrazyitProtocao.PRIVATE_ROUND)&&readLine.endsWith(CrazyitProtocao.PRIVATE_ROUND)){
					String userAndMsg = getRealMsg(readLine);//�õ�������˽����Ϣ
					
					//�ָ��ַ��� ǰ����˽�Ķ�����û��� ����� ������Ϣ
					String user = userAndMsg.split(CrazyitProtocao.SPLIT_SIGN)[0];
					String msg =  userAndMsg.split(CrazyitProtocao.SPLIT_SIGN)[1];
					Server.clients.get(user).print(Server.clients.getKeyByValue(ps)+"���Ķ���˵"+msg);
					
					
					
				}
	       /*
	        * ���� Ҫ��ÿ��socket���������
	        * 
	        * 
	        * **/
	       else{
					
					String msg = getRealMsg(readLine);
					for(PrintStream clientPs :Server.clients.valueSet()){
						
						
						clientPs.print(Server.clients.getKeyByValue(ps)+"˵"+msg);
						
					}
					
					
					
				}
			}
				
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
		Server.clients.removeByValue(ps);//ɾ����Ӧ�����
			System.out.print(Server.clients.size());
			
			try {
				if(br!=null){
					br.close();
	
				}
				if(ps!=null){
					ps.close();
				}
				if(socket!=null){
					socket.close();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
		
		
	}
	
	
	private String getRealMsg(String readLine) {
		// TODO Auto-generated method stub������ȥ��Э���ַ� �ָ�����������
		
		return readLine.substring(CrazyitProtocao.PROTOCOL_LEN,readLine.length()-CrazyitProtocao.PROTOCOL_LEN);
	}
	
	
	
	

}
