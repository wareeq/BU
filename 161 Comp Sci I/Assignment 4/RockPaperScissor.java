import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        String computer;
        String user;
        String result;

        // Play the game as long as there is a tie.
        do {
            // Get the computer's choice.
            computer = computerChoice();

            // Get the user's choice.
            user = userChoice();

            // Determine the winner.
            result = determineWinner(computer, user);

            // Show the choices of both computer and user as well as the result.
            displayWinner(computer, user, result);

        } while (result.equalsIgnoreCase("tie"));

        // Exit the program.
        System.exit(0);
    }

    // Method to get the computer's choice.
    public static String computerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3) + 1;

        switch (choice) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
            default:
                return ""; 
        }
    }

    // Method to get the user's choice.
    public static String userChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (rock, paper, or scissors): ");
        return scanner.nextLine().toLowerCase();
    }

    // Method to determine the winner.
    public static String determineWinner(String computer, String user) {
        if (computer.equals(user)) {
            return "tie";
        } else if ((computer.equals("rock") && user.equals("scissors")) ||
                   (computer.equals("scissors") && user.equals("paper")) ||
                   (computer.equals("paper") && user.equals("rock"))) {
            return "computer";
        } else {
            return "user";
        }
    }

    // Method to display the choices and result.
    public static void displayWinner(String computer, String user, String result) {
        System.out.println("\nThe computer's choice is " + computer + ".");
        System.out.println("The user's choice is " + user + ".");

        if (result.equalsIgnoreCase("tie")) {
            System.out.println("It's a tie, try again!\n");
        } else {
            System.out.println("The winner is " + result + ".\n");
        }
    }
}
