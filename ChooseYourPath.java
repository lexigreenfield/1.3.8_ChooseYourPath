import java.util.Scanner;

public class ChooseYourPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Welcome to the Haunted Mansion. Do you knock on the door or kick it down? Enter \"knock\" or \"kick\".");
        String userInput = scanner.nextLine();
        boolean a = userInput.equals("knock");
        boolean b = userInput.equals("kick");
        String c = "You didn't answer the question. You explode! The end.";
        if (a == true) {
            System.out.println(
                    "You knock on the door. It slowly opens and you see Dracula standing there. He offers to take you on a tour, and asks if you want to start upstairs or downstairs. What do you say? Enter \"upstairs\" or \"downstairs\".");
            userInput = scanner.nextLine();
            a = userInput.equals("upstairs");
            b = userInput.equals("downstairs");
            if (a == true) {
                System.out.println("You went upstairs.");
            } else if (b == true) {
                System.out.println("You went downstairs.");
            } else {
                System.out.println(c);
            }

        } else if (b == true) {
            System.out.println("you kicked");
        } else {
            System.out.println(c);
        }

    }
}