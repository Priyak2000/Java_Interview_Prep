package Revision;

public class PalindromeString {
	public static void main(String[] args) {
		String s="ammqa";
		boolean res=isPalindrome(s);
		if(res)
			System.out.println("Given String is palindrome");
		else
			System.out.println("given String is not palindrome");
	}
		public static boolean isPalindrome(String s) {
		int start=0;
		int end=s.length()-1;	
		while(start<end) {
			if(s.charAt(end)!=s.charAt(start))
					return false;
			else
			{
				start++;
				end--;
			}
		}
		return true;
	}
	

}
