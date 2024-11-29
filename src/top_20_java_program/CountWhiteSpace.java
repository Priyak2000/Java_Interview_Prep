package top_20_java_program;

public class CountWhiteSpace {
public static void main(String[] args) {
	String s= "Not today but one day you will";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++; 
		}
	}
	System.out.println("Count of white spaces : " + count);
	
}
}
