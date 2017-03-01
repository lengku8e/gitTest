package collectionutil;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;import java.util.Set;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class SynchronizedTest {

	
	/*collections类中提供多个syschronizedXXX()方法，该刚发可以将制定集合包装成线程同步的集合
	 * 下面创建了四个同步集合对象
	 * 
	 * 
	 * */
	public static void main (String [] arhs){
		Collection a = Collections.synchronizedCollection(new ArrayList());
		List list = (List) Collections.synchronizedList(new ArrayList());
			Set e = Collections.synchronizedSet(new HashSet());
			Map m = Collections.synchronizedMap(new HashMap());
			
			
		
		
	}
	
	
}
