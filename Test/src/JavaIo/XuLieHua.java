package JavaIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class XuLieHua {

	
	/*�����󱣴浽���̻������紫�� ��ô�����Ӧ��ʵ��serializable����externalizable�ӿ�֮һ
	 * ����ʵ���κη���
	 * ���л�����Ĺ���
	 * ObjectOutputOutStream o = new ObjectOutputOutStream (new FileOutputStream("object.txt"));
	 * o.writeObject(����)
	 * */
	public static void main(String [] a){
		
		try {
			ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("object.txt"));
			Person p = new Person("sun", 0);
			
			o.writeObject(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
