import java.util.Scanner;

public class runningRace{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        String runnerName1, runnerName2, runnerName3;
        double runnerTime1, runnerTime2, runnerTime3;

        // Ask user for runner input
        System.out.print("Enter the first runner's name: ");
        runnerName1 = keyboard.nextLine();

        System.out.print("Enter the first runner's time (in minutes): ");
        runnerTime1 = keyboard.nextDouble();
        keyboard.nextLine(); // Consume the remaining newline character

        System.out.print("Enter the second runner's name: ");
        runnerName2 = keyboard.nextLine();

        System.out.print("Enter the second runner's time (in minutes): ");
        runnerTime2 = keyboard.nextDouble();
        keyboard.nextLine(); // Consume the remaining newline character

        System.out.print("Enter the third runner's name: ");
        runnerName3 = keyboard.nextLine();

        System.out.print("Enter the third runner's time (in minutes): ");
        runnerTime3 = keyboard.nextDouble();

        // if condition to determine the order of finish
        if (runnerTime1 < runnerTime2 && runnerTime1 < runnerTime3) {
            System.out.println("1st place: " + runnerName1);
            if (runnerTime2 < runnerTime3) {
                System.out.println("2nd place: " + runnerName2);
                System.out.println("3rd place: " + runnerName3);
            } else {
                System.out.println("2nd place: " + runnerName3);
                System.out.println("3rd place: " + runnerName2);
            }
        } else if (runnerTime2 < runnerTime1 && runnerTime2 < runnerTime3) {
            System.out.println("1st place: " + runnerName2);
            if (runnerTime1 < runnerTime3) {
                System.out.println("2nd place: " + runnerName1);
                System.out.println("3rd place: " + runnerName3);
            } else {
                System.out.println("2nd place: " + runnerName3);
                System.out.println("3rd place: " + runnerName1);
            }
        } else {
            System.out.println("1st place: " + runnerName3);
            if (runnerTime1 < runnerTime2) {
                System.out.println("2nd place: " + runnerName1);
                System.out.println("3rd place: " + runnerName2);
            } else {
                System.out.println("2nd place: " + runnerName2);
                System.out.println("3rd place: " + runnerName1);
            }
        }
    }
}
