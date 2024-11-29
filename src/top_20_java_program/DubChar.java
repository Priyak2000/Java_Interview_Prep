package top_20_java_program;

import java.util.HashSet;
import java.util.Set;

public class DubChar {
public static void main(String[] args) {
	String s="java";
	Set<Character> set=new HashSet<>();
	for(char c:s.toCharArray()) {
		if(!set.add(c)) {
			System.out.println(c);
		}
	}
//	for(int i=0;i<s.length();i++) {
//		int count=0;
//		for(int j=0;j<s.length();j++){
//			if(s.charAt(i)==s.charAt(j)) {
//				count++;
//			}
//			if(count>1) {
//				System.out.print(s.charAt(i) + " ");
//			}
//			
//		}
	}
}

