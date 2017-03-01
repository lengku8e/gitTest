package CollictionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Demo {

	public static void main(String [] a){
		LinkedList arrayList = new LinkedList();

		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(26);
		arrayList.add(2); 

		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()){
			
			System.out.println(arrayList.removeLast());
			
		}
		
		

	}	
}
