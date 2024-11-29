package top_20_java_program;

//Reverse each word in string
public class RevString {
	public static void main(String[] args) {
		String str= "To became a software developer";
		StringBuilder res =new StringBuilder();
		String strArr[]=str.toLowerCase().split(" ");
		for(String s:strArr) {
			StringBuilder rev =new StringBuilder(s);
			rev.reverse();
			res.append(rev+ " ");	
		}
		System.out.println(res.toString());
	}

}
