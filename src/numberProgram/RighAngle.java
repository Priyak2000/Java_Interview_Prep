package numberProgram;

public class RighAngle {
    public static void main(String[] args) {
        int n = 5; // Number of lines (adjust as needed)
        
        for (int i = n-1; i >= 1; i--) {
            // Print spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            
            // Move to the next line after each row of stars
            System.out.println();
        }
    }
}

