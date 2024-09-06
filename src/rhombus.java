import java.util.Scanner;

class rhombus {

    // Function to print a solid rhombus
    public static void printSolidRhombus(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print trailing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars after spaces
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            // Move to the next line/row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the number of rows
        System.out.print("Enter the number of rows for the solid rhombus: ");
        int rows = scanner.nextInt();

        // Print the solid rhombus
        printSolidRhombus(rows);

        // Close the scanner
        scanner.close();
    }
}
