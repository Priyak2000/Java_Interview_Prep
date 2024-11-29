package switchCase;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a, b, ch;
		
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Select your choice (1-4)");
		ch=scan.nextInt();
		switch(ch) 
		{
		case 1:
			System.out.println("Enter number 1");
			a=scan.nextInt();
			System.out.println("Enter number 2");
			b=scan.nextInt();
			System.out.println("Addition : " + (a+b));
			break;
		case 2:
			System.out.println("Enter number 1");
			a=scan.nextInt();
			System.out.println("Enter number 2");
			b=scan.nextInt();
			System.out.println("Substraction : " + (a-b));
			break;
		case 3:
			System.out.println("Enter number 1");
			a=scan.nextInt();
			System.out.println("Enter number 2");
			b=scan.nextInt();
			System.out.println("Multiplication : " + (a*b));
			break;
		case 4:
			System.out.println("Enter number 1");
			a=scan.nextInt();
			System.out.println("Enter number 2");
			b=scan.nextInt();
			System.out.println("Division : " + (a/b));
			break;

		 default:
             System.out.print("Invalid Choice...Please Try Again !!!");

			
		}
		
	}

}
