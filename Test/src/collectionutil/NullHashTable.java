package collectionutil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;


public class NullHashTable {

	/*
	 * HashMap Hashtable ����
	 * hashtable�̰߳�ȫ �������ܵ�һ�� ����ж��̷߳��ʵ�hashtable��һ��
	 * hashtable�������key��value ��hashMap���key���ֻ��һ��null���ǿ�����������valueΪ��
	 * ���Ƕ����������ظ���key���������ظ�keyʱ ���Ḳ��ֵǮ��key��value
	 * 
	 * */

/*	public static void main(String [] args){
		
		Hashtable ht = new Hashtable();
		ht.put(1, 2);
		ht.put(1, 1);
		System.out.print(ht);
	}*/	
	
	//����һ���ַ����á��������� ���������� �����������list�н���һϵ�в���������Collections���е���Щ��̬�������в���
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);

		String arr = sc.next();
		
		String[] ar = arr.split(",");

		ArrayList a = new ArrayList();
	
		for(int i =0;i<=ar.length-1;i++){
			a.add(i,ar[i]);
		}
		System.out.print(a);
		System.out.println(Collections.max(a));//������Ȼ˳�������
		Collections.reverse(a);//����Ԫ��˳��ת
		System.out.println(Collections.frequency(a,"1"));//����list���ƶ�Ԫ�س��ִ���

}
}