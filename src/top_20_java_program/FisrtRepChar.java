package top_20_java_program;

import java.util.HashMap;
import java.util.Map;

public class FisrtRepChar {
	public static void main(String[] args) {
		String s="hello world";
		Map<Character, Integer> map=new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		char ch=' ';
		for(char c:s.toCharArray()) {
			if(map.get(c)>1) {
				ch=c;
			break;
			}
		}
		System.out.println(ch);
	}

}
