import java.util.*;
public class palindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number of rows for the pattern
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
