package Fanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
	
	
	/*���ϵ�ȱ�㣺���뼯�Ϻ󣬻����������ͣ�����ʱ�򶼻���ΪObject������������û�б䣩
	 * 
	 * */
public static void main(String [] a){
	/*List arraylist = new ArrayList();
	
	arraylist.add("���");
	arraylist.add("�˽�");
	arraylist.add("ʦ��");
	arraylist.add(5);
	for(int i=0;i<arraylist.size();i++){
		String s = (String) arraylist.get(i);//��Ҫǿ������ת��
		// ����java.lang.ClassCastException�쳣����Ϊ������ͼ��integer����ת��ΪString����
	}*/
	
List<String> arraylist = new ArrayList<String>();
	
	arraylist.add("���");
	arraylist.add("�˽�");
	arraylist.add("ʦ��");
/*	arraylist.add(5);//���ֱ������
*/	
	for(int i=0;i<arraylist.size();i++){
		String s = arraylist.get(i);}//����Ҫǿ������ת����
	
}
	
	
	
}
