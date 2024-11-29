package top_20_java_program;

import java.util.HashSet;
import java.util.Set;

public class DubChar2 {
	public static void main(String[] args) {
		String s="hello world";
		Set<Character> set=new HashSet<>();
		char[] strArr=s.toCharArray();
		for(int i=0;i<strArr.length;i++) {
			int count=0;
			for(int j=1;j<strArr.length;j++) {
				if(strArr[i]==strArr[j] && strArr[i]!=' ') {
					count++;
				}
			}
			if(count>1) {
				set.add(strArr[i]);
				//System.out.print(strArr[i]);
		}
		
		}
		for(char i:set) {
			System.out.print(i + " ");
		}
	}

}
