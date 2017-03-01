package UDPxieyi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class Udp {
	


	/*
	 * 用户数据报协议 主要作用是完成网络数据流和数据报之间的转换--
	 * 发送端UDP将数据流封装成数据报 接收端 将数据报装换成实际数据内容
	 * 
	 * TCP HE UDP对比
	 * tcp  可靠 无限制  连接需要时间 差错控制开销大
	 * udp  不可靠 差错开销小 大小限制再64k 不需要建立连接
	 *  
	 *  通过DatagtamSocket对象 建立连接
	 *   receive()  send()两个方法用来发送和接收数据报
	 *  DatagramPacket 代表数据报 
	 *  
	 *  由于接收方不知道数据报来自哪里 datagramPacket 提供 三个方法
	 *  getAddress() 返回ip地址
	 *  getPort()    返回端口号
	 *  getSocketAddress()  返回socketAddress
	 * */

	
	
	private static final int PORT = 30000;
	public static final int DATA_LEN=4096;//定义数据报的长度
	
	byte [] inBuff = new byte[DATA_LEN];//定义接收网络数据的字节数组
	
	private DatagramPacket inPacket = new DatagramPacket(inBuff, inBuff.length);//为指定字节数组创建准备接收数据的对象
	
	
	private DatagramPacket outPacket ;//准备发送数据的对象
	
	String [] books = new String[]{
			"孙悟空","猪八戒"
	};//服务端发送该字符串
	
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
			//循环接收数据
			for(int i = 0 ;i<1000;i++){
				
			socket.receive(inPacket);//socket接收的数据 放入到inPacket对象中
				System.out.print(inBuff==inPacket.getData());//判断是否是同一个数组
				
				System.out.print(new String(inBuff,0,inPacket.getLength()));//接收到的内容转换成字符串
				
				byte [] senddata = books[i%4].getBytes();
			}
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
 