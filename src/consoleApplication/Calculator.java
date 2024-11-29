package consoleApplication;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char operator;
		int num1, num2, result;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Choose the opertor");
		operator=scan.next().charAt(0);
		System.out.println("Enter the first number");
		num1=scan.nextInt();
		System.out.println("Enter the second number");
		num2=scan.nextInt();
		
		switch(operator){
		case '+':
			result=num1+num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
			default:
				System.out.println("Invalid operator");
				break;
			
		}
		scan.close();
	}

}
