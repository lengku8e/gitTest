package JavaIo;

import java.io.File;
import java.io.IOException;

public class FileTest {

//File是javaio包下与平台无关的文件和目录，能新建删除重命名文件和目录 如果需要访问文件内容则需要输入输出流
	
	public static void main (String [] args) throws IOException{
		
		File file = new File(".");//当前路径下创建file对象
		System.out.print(file.getName());
		
		System.out.print(file.getParent());//获取相对路径的父路径 为null
		
		System.out.print(file.getAbsoluteFile());//获得绝对路径
		System.out.print(file.getAbsoluteFile().getParent());//当前时上一级
		
		File tmpFile = File.createTempFile("aaa", ".text",file);//当前路径创建临时文件
/*		tmpFile.deleteOnExit();//jvm退出时删除
*/		File newFile =  new File(System.currentTimeMillis()+"");//以时间命名文件
		System.out.println("newFie对象是否崔仔"+newFile.exists());
		newFile.createNewFile();//制定newfile对象创建文件
		
		/*newFile.mkdir();//一newfile对象创建目录，因为newfile对象存在 所以该方法返回false
*/		
		String [] fileList=file.list();//list方法列出当前路径下所有文件和路径
		System.out.print("=========当前目录下所有文件=============");
		for(String fileName :fileList){
			
			System.out.println(fileName);
			
			
			
			
		}
		
		
		File [] roots = File.listRoots();
		System.out.print("系统所有根目录下");
		for(File root:roots){
			System.out.print(root);
			
			
			
			
		}
		
		
		
		
		
	}
	
	
}
