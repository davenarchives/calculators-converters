/* A temperature converter is a tool or software that allows you to convert temperature values from one unit to another. 
 * Since temperature can be measured in different units, like Celsius (°C), Fahrenheit (°F), and Kelvin (K), 
 * a converter helps you easily switch between these units.
 */

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Temperature Converter");
            System.out.println("1. Celcius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celcius");
            System.out.println("3. Celcius to Kelvin");
            System.out.println("4. Kelvin to Celcius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.print("Enter choice: ");
    
            int choice = scanner.nextInt();
            scanner.nextLine(); 
    
            switch (choice) {
                case 1: 
                    System.out.print("Enter the temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = 9/5 * (celsius + 32);
                    System.out.println("Fahrenheit: "+fahrenheit);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    double fahrenheitInput = scanner.nextDouble();
                    double celsiusInput = 5/9 * (fahrenheitInput - 32);
                    System.out.println("Celcius: "+celsiusInput);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Enter the temperature in Celsius: ");
                    double celsiusKelvin = scanner.nextDouble();
                    double kelvinInput = celsiusKelvin + 273.15;
                    System.out.println("Kelvin: "+kelvinInput);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Enter the number in Kelvin: ");
                    double kelvinCelsius = scanner.nextDouble();
                    double celsiusOutput = kelvinCelsius - 273.15;
                    System.out.println("Celsius: "+celsiusOutput);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.print("Enter the number in Fahrenheit: ");
                    double fahrenheitKelvin = scanner.nextDouble();
                    double kelvinOutput = (fahrenheitKelvin - 32) * 5/9 + 273.15;
                    System.out.println("Kelvin: "+kelvinOutput);
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.print("Enter the number in Kelvin: ");
                    double kelvinFarenheit = scanner.nextDouble();
                    double fahrenheitOutput = (kelvinFarenheit - 273.15) * 9/5 + 32;
                    System.out.println("Fahrenheit: "+fahrenheitOutput);
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    System.out.println("\n");
                    break;
            }
            
        }

    }
}
