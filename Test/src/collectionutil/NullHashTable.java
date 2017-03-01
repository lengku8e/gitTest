package collectionutil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;


public class NullHashTable {

	/*
	 * HashMap Hashtable 区别
	 * hashtable线程安全 所以性能低一点 如果有多线程访问的hashtable好一点
	 * hashtable不允许空key和value 而hashMap里的key最多只有一个null但是可以有无数个value为空
	 * 他们都不可以有重复的key，当插入重复key时 将会覆盖值钱的key和value
	 * 
	 * */

/*	public static void main(String [] args){
		
		Hashtable ht = new Hashtable();
		ht.put(1, 2);
		ht.put(1, 1);
		System.out.print(ht);
	}*/	
	
	//输入一串字符串用“，”隔开 存入数组中 遍历数组存入list中进行一系列操作，调用Collections类中的有些静态方法进行操作
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);

		String arr = sc.next();
		
		String[] ar = arr.split(",");

		ArrayList a = new ArrayList();
	
		for(int i =0;i<=ar.length-1;i++){
			a.add(i,ar[i]);
		}
		System.out.print(a);
		System.out.println(Collections.max(a));//返回自然顺序下最大
		Collections.reverse(a);//集合元素顺序反转
		System.out.println(Collections.frequency(a,"1"));//返回list中制定元素出现次数

}
}