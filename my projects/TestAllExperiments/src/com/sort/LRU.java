package com.sort;

import java.util.LinkedHashMap;
import java.util.Map;
//Least Recently Used
public class LRU {

	private static final int MAX_ENTRIES = 5;
	Map<Integer,Integer> m = new LinkedHashMap<Integer, Integer>(MAX_ENTRIES){

		//Override this , if it returns true the eldest entry in the map is removed
		protected boolean removeEldestEntry(Map.Entry eldest) {
		       return m.size() > MAX_ENTRIES;
		    }
	};
		

    
	// model function
	int getValue(int x){
		//some complex calculations
		return ++x;
	}
	//to get value from cache
	int getCacheValue(int x){
		return m.get(x);
	}
	
	int get(int x){
		int result=0;
		if(m.containsKey(x)){
			result=getCacheValue(x);
		
		}else{
			result=getValue(x);
		}
		m.put(x, result);
		return result;
	}
	
	
	public static void main(String[] args) {
		LRU obj = new LRU();
		for (int i = 1; i <= 5; i++) {
			obj.get(i);
			System.out.println(obj.m);
		}
		
	}
}
