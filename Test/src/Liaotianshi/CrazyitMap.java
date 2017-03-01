package Liaotianshi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CrazyitMap<K,V> extends HashMap<K,V> {
	/*
	 * �̳�hashmap ����д put����  ���������Hashmap�е�value�ظ�
	 * 
	 * 
	 * */
	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		for(V v : valueSet()){
			
			if(v.equals(value)&&v.hashCode()==value.hashCode()){
				throw new RuntimeException("�������ظ�value");	
			}	
		}

		return super.put(key, value);
	}

	/*��ȡvalue��ɵ�set����
	 * */
	public Set<V> valueSet() {
		// TODO Auto-generated method stub
	    Set s = new HashSet();//����set���ϣ�����Hashmao��keyset�����������key
	    for(K key:keySet()){
	    	s.add(get(key));
	    }
		return s;
	}
//����valueɾ��key
	public void removeByValue(Object value){
	for(Object key : keySet()){
		
		if(get(key)==value){
			
			remove(key);
			break;
		}		
	}		
	}
//����value����key
	public K getKeyByValue(V cal){	
		for(K key :keySet()){
			if(get(key).equals(cal)&&get(key)==cal){
				
				return key;
			}	
		}
		return null;
	
	}
	
}
