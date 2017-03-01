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
		client.readAndSend();//定义一个不断读取键盘输入 并向网络发送的方法
	}



	public void init(){
		try {
			keyIn = new BufferedReader(new InputStreamReader(System.in));
			socket  = new Socket("127.0.0.1",SERVER_PORT);
			
			ps  = new PrintStream(socket.getOutputStream());//获取对应输出流，向服务器输出
			brServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));//获取对应输入流，向客户端输入
			
			String tip = "";
			//循环弹出对话框 要求输入用户名
			while(true){
				
				String userName = JOptionPane.showInputDialog(tip+"输入用户名");
				
				ps.print(CrazyitProtocao.USER_ROUND+userName+CrazyitProtocao.USER_ROUND);//向服务器输入用户名
				String result= brServer.readLine();//服务器的响应信息
				if(result.equals(CrazyitProtocao.NAME_REP)){
					
					
					tip = "用户名重复 重新输入";
					continue;
				}
				if(result.equals(CrazyitProtocao.LOGIN_SUCCESS)){
					
					break;//登陆成功 结束循环
				}
					
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
		System.out.print("找不到远程服务器请确定已经启动");
		closeRs();//关闭socket以及输入输出流的方法
		System.exit(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("找网络异常");
			closeRs();//关闭socket以及输入输出流的方法
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
			//不断读取键盘输入
			while((line = keyIn.readLine())!=null){
				//判断是 私聊信息
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
			System.out.print("网络异常 重新登陆");
			closeRs();
			System.exit(1);
		}
		
		
	}
	
	
}
