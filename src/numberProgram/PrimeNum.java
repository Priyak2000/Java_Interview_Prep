package numberProgram;

public class PrimeNum {
	public static void main(String[] args) {
	int n=16;
	boolean res= isPrime(n);
	System.out.println(res);

}

	private static boolean isPrime(int n) {
		if(n<=1)
		return false;
		for(int i=2;i<=n;i++) {
			if(n%2==0)
				return false;
		}
		return true;
		
	}
}