package www;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPtest {
/*
 *TCP协议称作端到端协议，需要两个通信实体参与，一方发送乙方确认如果没有收到确认信息 则一直发送
 *
 * 使用serverSocket创建tcp服务器、用来接收其他通信实体的连接请求 监听客户端请求 
 * accept（）方法接收客户端请求
 * 一般程序会循环调用accept方法 不断接受请求
 * 
 * Socket通过两个方法获得输入流合输出流 getInputStream  getOutoutStream
 * */
	public static void main(String [] a){
		try {
			ServerSocket ss = new ServerSocket(30000);//创建ServerSocket服务器监听
			while(true){
				
				Socket s = ss.accept();//如果接收到请求 返回socket对象
				PrintStream ps = new PrintStream(s.getOutputStream());//输出流包装成Printstream
				ps.print("收到");//向客户端发送信息，调用print方法写入流
				ps.close();
				s.close();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	
	

}
