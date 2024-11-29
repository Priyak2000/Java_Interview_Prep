package top_20_java_program;
//If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5". 
//The string is compressed only when the repeated character count is more than 1.
public class StringCompression {
	public static void main(String[] args) {
		String s="xxxxxyyaaa";
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				sb.append(s.charAt(i));
				if(count>1)
					sb.append(count);
				count=1;
			}
			
				
		}
		System.out.println(sb.toString());
	}

}
