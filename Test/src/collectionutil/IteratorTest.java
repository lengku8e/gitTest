package collectionutil;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
/*����������������Collecton����
 * hashset�������õĴ�ȡ�ϲ������� �����ܱ�֤Ԫ�ص�˳�� ˳����ܺ���Ӳ�ͬ ����ͬ����  ������Ԫ�ؿ���null������hashcode�����洢λ��
 * �ж���Ԫ�����������hashcode��Ȼ���equal�Ƿ���ҲҪ���
 * 
 * 
 * */
	public static void  main(String [] a){
		
		Collection books = new HashSet();//set��Ԫ�ز������ظ� һ����set�ӿڶ�����hashsetʵ����
		books.add("�����");
		books.add("zhubajie");
		books.add("tangseng");
		books.add("shaheshamng");
		Iterator it = books.iterator();
		while(it.hasNext()){
			String book = (String) it.next();
			System.out.print(book);
			if(book.equals("zhubajie")){
				it.remove();//remove���� ɾ����������һ��next�����������صļ���Ԫ��
			}
			book = "�����ַ���֪����Ըı伯��Ԫ��";
		}
		System.out.print(books);
		
		
	}
	
}
