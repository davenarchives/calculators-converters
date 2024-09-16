/*
 *The volume of a sphere is the amount of space enclosed within it. 
 *It is determined by its radius, which is the distance from the center of the sphere to any point on its surface. 
 *The calculation involves considering the sphere's three-dimensional nature and the mathematical relationship between its radius and the total space it occupies.
*/

import java.util.Scanner;

public class volumeSphere {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        final double pi = 3.14159;

        double cube = radius*radius*radius;

        final double volume = (4.0/3.0)*pi*cube;

        System.out.println("The volume of a sphere is: "+volume);

    }
}
