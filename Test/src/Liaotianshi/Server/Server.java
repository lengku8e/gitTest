package Liaotianshi.Server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import Liaotianshi.CrazyitMap;

import www.ServerThread;

public class Server {
	
	
	/*
	 * 创建CrazyitMap对象 用于存放每个用户以及对应输入流的映射
	 * */
	public static CrazyitMap<String,PrintStream>  clients = new CrazyitMap<String,PrintStream>();
	
	
	
	
	public static void main(String [] a){
		Server server = new Server();
		server.init();
		
		
	}

	private void init() {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket s = new ServerSocket(30000);
			while(true){
				
				Socket socket = s.accept();
				new ServerThreads(socket).start();	
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
	System.out.print("服务器失败 是否端口"+30000+"被占用");
		}
		
		
		
	}

}
