package Revision;

public class RevStringEachWord {
	public static void main(String[] args) {
		String s="I love Indian";
		 s=s.toLowerCase();
		String str[]=s.split(" ");
		StringBuilder res=new StringBuilder();
		for(String word:str) {
			StringBuilder rev =new StringBuilder(word);
			rev.reverse();
			res.append(rev).append(" ");
		}
		System.out.println(res.toString());
	}

}
