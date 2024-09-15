/* A base converter is a tool or process used to convert numbers between different numeral systems or bases.
 * Numeral systems represent numbers using various symbols or digits and include systems such as binary, decimal, octal, and hexadecimal.
 * The base converter translates a number from one system to another by recalculating its value according to the rules and structure of the target base, 
 * facilitating applications across different fields, such as computing and mathematics, where different numeral systems are commonly used.
 */

import java.util.Scanner;

public class BaseConverter {

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\nBase Converter");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Binary");
            System.out.println("3. Decimal to Octal");
            System.out.println("4. Octal to Decimal");
            System.out.println("5. Decimal to Hexadecimal");
            System.out.println("6. Hexadecimal to Decimal");
            System.out.println("0. Exit");
            System.out.print("Choose the conversion:");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 0) {
                continueRunning = false;
                System.out.println("Exiting...");
                continue;
            }

            String input;
            String result;

            switch (choice) {
                case 1:
                    System.out.print("Enter binary number: ");
                    input = scanner.nextLine();
                    result = String.valueOf(binaryToDecimal(input));
                    break;
                case 2:
                    System.out.print("Enter decimal number: ");
                    int decimal = scanner.nextInt();
                    result = decimalToBinary(decimal);
                    scanner.nextLine(); 
                    break;
                case 3:
                    System.out.print("Enter decimal number: ");
                    decimal = scanner.nextInt();
                    result = decimalToOctal(decimal);
                    scanner.nextLine(); 
                    break;
                case 4:
                    System.out.print("Enter octal number: ");
                    input = scanner.nextLine();
                    result = String.valueOf(octalToDecimal(input));
                    break;
                case 5:
                    System.out.print("Enter decimal number: ");
                    decimal = scanner.nextInt();
                    result = decimalToHexadecimal(decimal);
                    scanner.nextLine(); 
                    break;
                case 6:
                    System.out.print("Enter hexadecimal number: ");
                    input = scanner.nextLine();
                    result = String.valueOf(hexadecimalToDecimal(input));
                    break;
                default:
                    result = "Invalid choice";
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
