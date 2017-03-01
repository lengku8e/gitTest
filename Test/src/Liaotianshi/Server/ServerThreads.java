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
			//获取对应输入流
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//获取对应输出流
			ps = new PrintStream(socket.getOutputStream());
			String readLine = null;
			while((readLine = br.readLine())!=null){
				String userName = getRealMsg(readLine);//读到用户名协议字符开始合结束的数据 则确定登陆的为用户名
				
				if(readLine.startsWith(CrazyitProtocao.USER_ROUND)&&readLine.endsWith(CrazyitProtocao.USER_ROUND)){
					
					
					if(Server.clients.containsKey(userName)){
						System.out.print("用户重复");
						ps.print(CrazyitProtocao.NAME_REP);
						
					}
					
				}else{
					System.out.print("成功");
					ps.print(CrazyitProtocao.LOGIN_SUCCESS);
					Server.clients.put(userName, ps);//将对应用户 以及socket流存入集合
					
				}
				
				/*
				 * 处理私聊对象的过程
				 * 
				 * */
				/*如果读到String PRIVATE_ROUND 开始或结束 则为私有信息
				 * 只向指定的输出流发送
				 * 
				 * */
	       if(readLine.startsWith(CrazyitProtocao.PRIVATE_ROUND)&&readLine.endsWith(CrazyitProtocao.PRIVATE_ROUND)){
					String userAndMsg = getRealMsg(readLine);//得到处理后的私聊信息
					
					//分割字符串 前边是私聊对象的用户名 后边是 聊天信息
					String user = userAndMsg.split(CrazyitProtocao.SPLIT_SIGN)[0];
					String msg =  userAndMsg.split(CrazyitProtocao.SPLIT_SIGN)[1];
					Server.clients.get(user).print(Server.clients.getKeyByValue(ps)+"悄悄对你说"+msg);
					
					
					
				}
	       /*
	        * 公聊 要向每个socket输出流发送
	        * 
	        * 
	        * **/
	       else{
					
					String msg = getRealMsg(readLine);
					for(PrintStream clientPs :Server.clients.valueSet()){
						
						
						clientPs.print(Server.clients.getKeyByValue(ps)+"说"+msg);
						
					}
					
					
					
				}
			}
				
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
		Server.clients.removeByValue(ps);//删除对应输出流
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
		// TODO Auto-generated method stub将内容去掉协议字符 恢复成真是数据
		
		return readLine.substring(CrazyitProtocao.PROTOCOL_LEN,readLine.length()-CrazyitProtocao.PROTOCOL_LEN);
	}
	
	
	
	

}
