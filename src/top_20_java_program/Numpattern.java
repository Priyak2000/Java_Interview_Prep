package top_20_java_program;

public class Numpattern {
	public static void main(String[] args) {
		
	
	int c=1;
	for(int i=1;i<=5;i++) {
		for(int k=1;k<=5-i;k++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			if(i%2==0) {
				System.out.print("# ");
			}
			else {
			System.out.print(i+ " ");
			}
			//c++;
		}
		System.out.println();
	}

}
}
