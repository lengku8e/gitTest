package Fanxing;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] a){
		/*
		 * 系统中不会真正产生泛型类
		 * */
	
	List<String> l1=new ArrayList<String>();
	List<Integer> l2=new ArrayList<Integer>();
	System.out.println(l1.getClass()==l2.getClass());//diaoyong getClass判断两个类是否相等，返回true。 因为不管反省参数是什么都运行同一个类
	
	}
}
