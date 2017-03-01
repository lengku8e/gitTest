package JavaIo;

import java.io.File;
import java.io.IOException;

public class FileTest {

//File��javaio������ƽ̨�޹ص��ļ���Ŀ¼�����½�ɾ���������ļ���Ŀ¼ �����Ҫ�����ļ���������Ҫ���������
	
	public static void main (String [] args) throws IOException{
		
		File file = new File(".");//��ǰ·���´���file����
		System.out.print(file.getName());
		
		System.out.print(file.getParent());//��ȡ���·���ĸ�·�� Ϊnull
		
		System.out.print(file.getAbsoluteFile());//��þ���·��
		System.out.print(file.getAbsoluteFile().getParent());//��ǰʱ��һ��
		
		File tmpFile = File.createTempFile("aaa", ".text",file);//��ǰ·��������ʱ�ļ�
/*		tmpFile.deleteOnExit();//jvm�˳�ʱɾ��
*/		File newFile =  new File(System.currentTimeMillis()+"");//��ʱ�������ļ�
		System.out.println("newFie�����Ƿ����"+newFile.exists());
		newFile.createNewFile();//�ƶ�newfile���󴴽��ļ�
		
		/*newFile.mkdir();//һnewfile���󴴽�Ŀ¼����Ϊnewfile������� ���Ը÷�������false
*/		
		String [] fileList=file.list();//list�����г���ǰ·���������ļ���·��
		System.out.print("=========��ǰĿ¼�������ļ�=============");
		for(String fileName :fileList){
			
			System.out.println(fileName);
			
			
			
			
		}
		
		
		File [] roots = File.listRoots();
		System.out.print("ϵͳ���и�Ŀ¼��");
		for(File root:roots){
			System.out.print(root);
			
			
			
			
		}
		
		
		
		
		
	}
	
	
}
