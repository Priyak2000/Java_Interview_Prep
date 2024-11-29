package Revision;

public class CountWord {
	public static void main(String[] args) {
		String s="I love Indian";
		String str[]=s.split(" ");
		int count=0;
		for(String word:str) {
			count++;
		}
		System.out.println("Count of the word : " + count);
	}

}
