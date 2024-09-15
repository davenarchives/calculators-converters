/*
 *The circumference is the distance around the edge of a circle. 
 *It is a measure of the perimeter or boundary length of the circle. 
 */ 


import java.util.Scanner;

public class circumference {
    public static void main(String[] args){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("======================================================");
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();

            double pi = 3.141592653589793238462643383279502884197;
    
            double circumference = 2*pi*radius;
            System.out.println("The circumference of the circle is: "+circumference);
        }
      
            
    }   
  
}
