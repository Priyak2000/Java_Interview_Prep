package string;

import java.util.Arrays;

public class PasswordVerifacation {
	public static void main(String[] args) {
		String str1="abc123";
		String str2="abc123";

		passwordVerify(str1, str2);
	}

	private static void passwordVerify(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			System.out.println(str1+"_notVerified");
			return;
	
		}
		boolean isEqual=true;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i))
				isEqual=false;
		}
		if(isEqual)
			System.out.println(str1+"_verfied");
		else
			System.out.println(str2+"_notVerified");
}
}