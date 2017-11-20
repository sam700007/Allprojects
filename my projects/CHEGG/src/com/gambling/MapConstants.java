package com.gambling;

import java.util.HashMap;
import java.util.Map;

public class MapConstants {
	Map<Integer,String> map;
	public MapConstants(){
		map=new HashMap<Integer,String>();
		map.put(0, "Cherries");
		map.put(1,"Oranges");
		map.put(2,"Plums");
		map.put(3,"Bells");
		map.put(4,"Melons");
		map.put(5,"Bars");
	}
	public String getGame(int num){
		return map.get(num);
	}
	
}
