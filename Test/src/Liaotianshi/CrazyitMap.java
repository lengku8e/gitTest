package Liaotianshi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CrazyitMap<K,V> extends HashMap<K,V> {
	/*
	 * 继承hashmap 并重写 put方法  不允许存入Hashmap中的value重复
	 * 
	 * 
	 * */
	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		for(V v : valueSet()){
			
			if(v.equals(value)&&v.hashCode()==value.hashCode()){
				throw new RuntimeException("不允许重复value");	
			}	
		}

		return super.put(key, value);
	}

	/*获取value组成的set集合
	 * */
	public Set<V> valueSet() {
		// TODO Auto-generated method stub
	    Set s = new HashSet();//创建set集合，调用Hashmao的keyset（）方法获得key
	    for(K key:keySet()){
	    	s.add(get(key));
	    }
		return s;
	}
//根据value删除key
	public void removeByValue(Object value){
	for(Object key : keySet()){
		
		if(get(key)==value){
			
			remove(key);
			break;
		}		
	}		
	}
//根据value查找key
	public K getKeyByValue(V cal){	
		for(K key :keySet()){
			if(get(key).equals(cal)&&get(key)==cal){
				
				return key;
			}	
		}
		return null;
	
	}
	
}
