import java.util.Scanner;

public class ChooseYourPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you excited to play? Type yes or no.");
        String userInput = scanner.nextLine(); // using scanner
        boolean e = userInput.equals("yes");
        System.out.println("Are you ready? Type yes or no.");
        userInput = scanner.nextLine();
        boolean d = userInput.equals("yes");
        if (e && d) { // compound boolean expression
            System.out.println("Awesome!");
        } else if (e || d) {
            System.out.println("Here we go!");
        } else {
            System.out.println("Too bad.");
        }
        System.out.println(
                "Welcome to the Haunted Mansion. Do you knock on the door or kick it down? Enter \"knock\" or \"kick\".");
        userInput = scanner.nextLine();
        boolean a = userInput.equals("knock");
        boolean b = userInput.equals("kick");
        String c = "You didn't answer the question. You explode! The end.";
        if (a == true) {
            System.out.println(
                    "You knock on the door. It slowly opens and you see Dracula standing there. He offers to take you on a tour, and asks if you want to start upstairs or downstairs. What do you say? Enter \"upstairs\" or \"downstairs\".");
            userInput = scanner.nextLine();
            a = userInput.equals("upstairs"); // reassigning the variables, not creating new ones
            b = userInput.equals("downstairs");
            if (a == true) {
                System.out.println(
                        "You go upstairs. At the top of the staircase, you see a mummy! Do you try and unravel it? Type yes or no.");
                userInput = scanner.nextLine();
                a = userInput.equals("yes");
                b = userInput.equals("no");
                if (a == true) { // I have a ton of nested if statements
                    System.out.println("You unravel it. It gets really mad and puts you in a sarcophagus. The end.");
                } else if (b == true) { // also else if statements
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
            } else if (b == true) { // lots of choices and branches off into the story
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
            System.out.println(
                    "You kick down the door. On either side of a massive staircase in the middle, there are two fancy looking doors. Do you go left or right? Type left or right.");
            userInput = scanner.nextLine();
            a = userInput.equals("left");
            b = userInput.equals("right");
            if (a == true) {
                System.out.println(
                        "You go through the door and see a witch making a bubbling potion. Do you offer to help? Type yes or no.");
                userInput = scanner.nextLine();
                a = userInput.equals("yes");
                b = userInput.equals("no");
                if (a == true) {
                    System.out.println(
                            "You make a delicious soup together, and she tells you how grateful she is to finally have a friend. The end!");
                } else if (b == true) {
                    System.out.println("She curses you for being unhelpful. The end.");
                } else {
                    System.out.println(c);
                }
            } else if (b == true) {
                System.out.println(
                        "You open the door and see a spider making a web. The web looks shiny and beautiful. Do you try to touch it? Type yes or no.");
                userInput = scanner.nextLine();
                a = userInput.equals("yes");
                b = userInput.equals("no");
                if (a == true) {
                    System.out.println("You get stuck for eternity. The end.");
                } else if (b == true) {
                    System.out.println(
                            "You leave the spider and its web alone and continue on. You find a talking pumpkin. Do you try and befriend it? Type yes or no.");
                    userInput = scanner.nextLine();
                    a = userInput.equals("yes");
                    b = userInput.equals("no");
                    if (a == true) {
                        System.out.println("It says yes! You have a party!!! The end!");
                    } else if (b == true) {
                        System.out.println("It eats you. The end.");
                    } else {
                        System.out.println(c);
                    }
                } else {
                    System.out.println(c);
                }
            } else {
                System.out.println(c);
            }
        } else {
            System.out.println(c);
        }

    }
}