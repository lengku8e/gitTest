package JavaIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RedirctIn {
	public static void main(String [] a) {
		
		
		FileInputStream f;
		try {
			f = new FileInputStream("out.txt");
		
		System.setIn(f);//�ض���f������
			Scanner sc = new Scanner(System.in);//��������
			sc.useDelimiter("\n");//����һ��
			while(sc.hasNext()){
				System.out.print(sc.next());
				
			}//�ж��Ƿ�����һ��������
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		
		}
		
		
	}
}
