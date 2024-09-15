import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+ - * /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        
        switch (operator) {
            case '+': 
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-': 
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*': 
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/': 
            if (num2 != 0){
                result = num1 / num2;
                System.out.println(result);
            } else {
                System.out.println("Division by zero is invalid!");
            }
                break;        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
