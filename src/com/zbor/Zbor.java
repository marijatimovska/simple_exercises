package com.zbor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Zbor {
	int count;

	public int zbor(String zbor, char bukva) {

		int count = 0;

		for (int i = 0; i < zbor.length(); i++) {
			if (zbor.charAt(i) == bukva)
				count++;
		}
		return count;

	}

	public void duplikat(String zbor) {
		count = 0;
		char[] inp = zbor.toCharArray();

		for (int i = 0; i < zbor.length() - 1; i++) {
			for (int j = i + 1; j < zbor.length(); j++) { 
				if (inp[i] == inp[j]) {
					System.out.println(inp[j]);
					count++;
					break;
				}
			}
		}
	}

	public void dupli(String zbor) {

		for (int i = 0; i < zbor.length() - 1; i++) {
			for (int j = i + 1; j < zbor.length(); j++) {
				if (zbor.charAt(i) == zbor.charAt(j)) {
					System.out.print(zbor.charAt(j));
					count++;
				}
			}
		}

	}

	public void duplikatDva(String zbor) {

		char[] chars = zbor.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : chars) {
			if (map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			} else {
				map.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", zbor);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}

		System.out.println("\nWhile Loop:");
		Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Character, Integer> me = (Map.Entry<Character, Integer>) itr.next();
			System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
		}
		
		System.out.println("\nFor Loop:");
		for (Map.Entry<Character, Integer> me2 : map.entrySet()) {
			System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());

		}
	}

}
