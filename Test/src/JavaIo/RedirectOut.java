package JavaIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectOut {

	
	/*System���ṩ��3���ض����׼��������ķ���
	 * setErr�����ض����׼���������
	 * setOut �ض����׼�����
	 * setin�ض����׼������
	 * 
	 * 
	 * 
	 * 
	 * /
	 */
	public static void main(String [] a) {
		
		
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
			
			System.setOut(ps);//��׼���out��ӡ����Ļ ��setout���¶���Ϊps��������������ش���Ŀ¼
			System.out.print("��ͨ�ַ���");//
			System.out.println(new RedirectOut());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
