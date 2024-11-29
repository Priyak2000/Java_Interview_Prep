package arrayInterviewQstns;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		System.out.println("Enter your password :");
		Scanner scan =new Scanner(System.in);
		String password=scan.next();
		boolean result=isValidPassword(password);
		if(result) {
			System.out.println("Your password is valid");
		}
		else  {
			 System.out.println("Password is invalid. Please ensure it meets the following criteria:");
	            System.out.println("1. At least 8 characters long.");
	            System.out.println("2. Contains at least one uppercase letter.");
	            System.out.println("3. Contains at least one lowercase letter.");
	            System.out.println("4. Contains at least one digit.");
	            System.out.println("5. Contains at least one special character (e.g., !@#$%^&*()).");
		}
		scan.close();
	}

	private static boolean isValidPassword(String password) {
		if(password.length()<8)
		return false;
		boolean hasUpperCase=false;
		boolean hasLowerCase=false;
		boolean hasDigit=false;
		boolean hasSpecialChar=false;
		for(char c:password.toCharArray()) {
			if(Character.isUpperCase(c))
				hasUpperCase= true;
			else if(Character.isLowerCase(c))
				hasLowerCase= true;
			else if(Character.isDigit(c))
				hasDigit= true;
			else if(isSpecial(c))
				hasSpecialChar= true;
			
		}
		return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
	}

		private static boolean isSpecial(char c) {
		String specialCharacters = "!@#$%^&*()-+";
		return specialCharacters.indexOf(c)>=0;
	}

}
