/*
 *The hypotenuse is the longest side of a right-angled triangle, located opposite the right angle. 
 *It is the side that connects the two legs (the other two sides) of the triangle
 *and is fundamental in the Pythagorean theorem, which states that the square of the hypotenuse
 *is equal to the sum of the squares of the other two sides. 
 */

import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is: "+c);
    }
}
