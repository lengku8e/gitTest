package Fanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
	
	
	/*集合的缺点：放入集合后，会忘记其类型，编译时候都会作为Object处理（运行类型没有变）
	 * 
	 * */
public static void main(String [] a){
	/*List arraylist = new ArrayList();
	
	arraylist.add("悟空");
	arraylist.add("八戒");
	arraylist.add("师傅");
	arraylist.add(5);
	for(int i=0;i<arraylist.size();i++){
		String s = (String) arraylist.get(i);//需要强制类型转换
		// 出现java.lang.ClassCastException异常，因为程序试图把integer对象转换为String对象
	}*/
	
List<String> arraylist = new ArrayList<String>();
	
	arraylist.add("悟空");
	arraylist.add("八戒");
	arraylist.add("师傅");
/*	arraylist.add(5);//出现编译错误
*/	
	for(int i=0;i<arraylist.size();i++){
		String s = arraylist.get(i);}//不需要强制类型转换了
	
}
	
	
	
}
