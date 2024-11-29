package top_20_java_program;
//Count no.of digits
public class CountDigits {
	public static void main(String[] args) {
		int num=65122;
		int count=0;
		while(num!=0) {
			num=num/10; 
			count++;
		}
		System.out.println("No.of digits =" +count);
		
	}

}
