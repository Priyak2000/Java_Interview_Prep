package top_20_java_program;

public class NonRepChar {
	public static void main(String[] args) {
		String s="malayalam";
		char c=' ';
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				
			c=s.charAt(i);
			break;
			}
		}
		System.out.println(c);
	}

}
