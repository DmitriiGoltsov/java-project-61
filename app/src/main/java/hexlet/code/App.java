package hexlet.code;

import java.util.Scanner;

public class App {
    public static String playerInput;
    public static void main(String[] args) {
        Scanner initialScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter. "
                + "\n 0 - Exit"
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 3 - Calc");
        playerInput = initialScanner.next();
        System.out.println("Your choice is " + playerInput);
        Engine.startEngine();
    }
}
