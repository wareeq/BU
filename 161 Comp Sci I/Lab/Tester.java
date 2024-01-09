import java.util.Scanner;  // Import the Scanner class

public class Tester{
    public static void main(String[] args){

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Ask user to input circle radius
        System.out.print("Enter the radius of a circle: ");
        double radius = keyboard.nextDouble();

        // close keyboard
        keyboard.close();

        // Create a Circle object by calling no-arg constructor
        Circle circle = new Circle();

        // Create a Circle object passing in user input
        Circle circle1 = new Circle(radius);

        // Display circle information
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println("Are these Circles equal? " + circle.equals(circle1));
    }
}