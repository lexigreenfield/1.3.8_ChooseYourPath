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
                System.out.println(
                        "You go upstairs. At the top of the staircase, you see a mummy! Do you try and unravel it? Type yes or no.");
                userInput = scanner.nextLine();
                a = userInput.equals("yes");
                b = userInput.equals("no");
                if (a == true) {
                    System.out.println("You unravel it. It gets really mad and puts you in a sarcophagus. The end.");
                } else if (b == true) {
                    System.out.println(
                            "You're a kind person and don't unravel it. It gives you a suspicious looking biscuit as a reward. Do you eat it? Type yes or no.");
                    userInput = scanner.nextLine();
                    a = userInput.equals("yes");
                    b = userInput.equals("no");
                    if (a == true) {
                        System.out.println("It's delicious, and you made a new friend! The end!");
                    } else if (b == true) {
                        System.out.println(
                                "It's feelings are really hurt and it cries, and then dracula eats you. The end.");
                    } else {
                        System.out.println(c);
                    }
                } else {
                    System.out.println(c);
                }
            } else if (b == true) {
                System.out.println(
                        "You go downstairs, and at the bottom of the staircase you see Bigfoot. He looks a lot like Chewbacca. Do you ask if they're related? Type yes or no.");
                userInput = scanner.nextLine();
                a = userInput.equals("yes");
                b = userInput.equals("no");
                if (a == true) {
                    System.out.println(
                            "It says no, but they're best friends! It invites you for dinner. Do you accept? Type yes or no.");
                    userInput = scanner.nextLine();
                    a = userInput.equals("yes");
                    b = userInput.equals("no");
                    if (a == true) {
                        System.out.println("You have a great time together! The end!");
                    } else if (b == true) {
                        System.out.println("It eats you. The end.");
                    } else {
                        System.out.println(c);
                    }
                } else if (b == true) {
                    System.out.println("It notices you staring silently and eats you. The end.");
                } else {
                    System.out.println(c);
                }
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