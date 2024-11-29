package top_20_java_program;

public class CommonCharOfTwoString {
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		String common= commonChar(s1,s2);
		System.out.println("Common characters : " + common);
	}

	private static String commonChar(String s1, String s2) {
		String res="";
		for(char c:s1.toCharArray()) {
			if(s1.indexOf(c)!=-1&&s2.indexOf(c)!=-1)
				res=res+c;
		}
		return res;

	}
	
}
