package com.zbor;

import java.util.HashMap;
import java.util.Map;

public class DupliMap {

	public static void main(String[] args) {

		String sentance = "This is test exc exc Hi Hi";
		Map<String, Integer> map = new HashMap<>();
		String[] split = sentance.split(" ");
		
		for (String string : split) {
			if (map.containsKey(string)) {
				int count = map.get(string);
				map.put(string, ++count);
			} else {
				map.put(string, 1);
			}
		}

		Map<String, Integer> mapThree = new HashMap<>();	
		for (int i = 0; i < split.length; i++) {
			if (mapThree.containsKey(split[i])) {
				int count = mapThree.get(split[i]);
				mapThree.put(split[i], ++count);
			} else {
				mapThree.put(split[i], 1);
			}
		}
		
		String word = "Helooo";
		char[] res = word.toCharArray();
		Map<Character, Integer> mapTwo = new HashMap<>();
		
		for(char c : res) {
			if(mapTwo.containsKey(c)) {
				int count = mapTwo.get(c);
				mapTwo.put(c, ++count);
			}
			else {
				mapTwo.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println(mapTwo);
		System.out.println(mapThree);
		
		
	}
	

}