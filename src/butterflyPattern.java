import java.util.*;
public class butterflyPattern {
    public static void main(int args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int n = sc.nextInt();
//upper half ke liye
        for (int i = 1; i <= n; i++) {
            //left pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for space in middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // Left part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
