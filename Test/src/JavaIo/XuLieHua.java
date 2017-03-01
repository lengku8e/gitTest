package JavaIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class XuLieHua {

	
	/*将对象保存到磁盘或者网络传输 那么这个类应该实现serializable或者externalizable接口之一
	 * 无需实现任何方法
	 * 序列化对象的过程
	 * ObjectOutputOutStream o = new ObjectOutputOutStream (new FileOutputStream("object.txt"));
	 * o.writeObject(对象)
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
