package Liaotianshi;

public interface CrazyitProtocao {
	/*
	 * 该类作用： 客户端发送的信息的特殊标识， 再客户端发送不同信息前进行处理 加上一些协议字符
	 * 判断是公聊信息 还是私聊信息
	 * 
	 * 
	 * 
	 * */
	

	
	int PROTOCOL_LEN = 2;//协议字符串长度
	//下面是一些协议字符串 服务端 客户端交换信息 都要在前后加这种字符
	String MSG_ROUND = "&&";
	String USER_ROUND="!@";
	String LOGIN_SUCCESS = "1";
	String NAME_REP = "-1";
	String PRIVATE_ROUND = "^%";
	String SPLIT_SIGN = "@";
	
	
}
