package collectionutil;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;import java.util.Set;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class SynchronizedTest {

	
	/*collections�����ṩ���syschronizedXXX()�������øշ����Խ��ƶ����ϰ�װ���߳�ͬ���ļ���
	 * ���洴�����ĸ�ͬ�����϶���
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
