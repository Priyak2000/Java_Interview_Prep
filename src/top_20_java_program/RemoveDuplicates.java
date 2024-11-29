package top_20_java_program;

import java.util.HashSet;
import java.util.Set;

//Remove all the dublicates in given string
public class RemoveDuplicates {
	public static void main(String[] args) {
		String str="PriyaPaunraj";
		StringBuilder res=new StringBuilder();
		Set<Character> set=new HashSet<>();
		for(char c:str.toCharArray()) {
			set.add(c);
		}
		
		for(char c:set) {
			res.append(c);
		}
		System.out.println("Before removing duplicates :"+ str);
		System.out.println("after removing dublicates :" +res.toString());
		
	}

}
