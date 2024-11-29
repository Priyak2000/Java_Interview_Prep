package top_20_java_program;

import java.util.HashSet;

public class CommonCharOfTwoString2 {
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		String common= commonChar(s1,s2);
		System.out.println("Common characters : " + common);
	}

	private static String commonChar(String s1, String s2) {
		StringBuilder sb=new StringBuilder();
		HashSet<Character> set=new HashSet<>();
		for(char c:s1.toCharArray())
		{
			set.add(c);
		}
		for(char c:s2.toCharArray()) {
			if(set.contains(c)) {
				sb.append(c);
				//set.remove(c);
			}
		}
		return sb.toString();
		

	}
	
}
