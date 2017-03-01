package JavaIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RedirctIn {
	public static void main(String [] a) {
		
		
		FileInputStream f;
		try {
			f = new FileInputStream("out.txt");
		
		System.setIn(f);//重定向到f输入流
			Scanner sc = new Scanner(System.in);//键盘输入
			sc.useDelimiter("\n");//增加一行
			while(sc.hasNext()){
				System.out.print(sc.next());
				
			}//判断是否还有下一个输入相
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		
		}
		
		
	}
}
