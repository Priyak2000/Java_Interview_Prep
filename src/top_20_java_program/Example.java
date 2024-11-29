package top_20_java_program;

public class Example {
	public static void main(String[] args) {
		int beg=2;
		int end=8;
		for(int i=beg;i<end;i++) {
			
			if(i%3==0 && i%7==0) {
				System.out.println("CLOUDNIX");
			}
		
		else if(i%3==0) {
				System.out.println("CLOUD");
			}
		else if(i%7==0) {
		System.out.println("NIX");
		}
		else {
			System.out.println(i);
		}
		
		}	
	}

}
