package collectionutil;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
/*迭代器必须依附于Collecton对象
 * hashset具有良好的存取合查找性能 ，不能保证元素的顺序 顺序可能合添加不同 不是同步的  集合中元素可以null；调用hashcode决定存储位置
 * 判断两元素相等条件是hashcode相等还有equal是方法也要相等
 * 
 * 
 * */
	public static void  main(String [] a){
		
		Collection books = new HashSet();//set中元素不允许重复 一般用set接口都是用hashset实现类
		books.add("孙悟空");
		books.add("zhubajie");
		books.add("tangseng");
		books.add("shaheshamng");
		Iterator it = books.iterator();
		while(it.hasNext()){
			String book = (String) it.next();
			System.out.print(book);
			if(book.equals("zhubajie")){
				it.remove();//remove方法 删除集合中上一次next（）方法返回的集合元素
			}
			book = "测试字符串知否可以改变集合元素";
		}
		System.out.print(books);
		
		
	}
	
}
