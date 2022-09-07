import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class AskUserForColour {
    public enum Colour {
        B, /*BLACK*/
        G, /*GREEN*/
        R, /*RED*/
        Y, /*YELLOW*/
        W, /*WHITE*/
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write first letter of colour");
            String letter = scanner.nextLine().trim().toUpperCase();
            if (letter.length() == 1) {
                switch (letter) {
                    case "B":
                        System.out.println("BLACK");
                        break;
                    case "G":
                        System.out.println("GREEN");
                        break;
                    case "R":
                        System.out.println("RED");
                        break;
                    case "Y":
                        System.out.println("YELLOW");
                        break;
                    case "W":
                        System.out.println("WHITE");
                        break;
                    default:
                        System.out.println("I DON'T KNOW COLOUR WHICH STARTS WITH THIS LETTER " + letter + " .");
                        break;
                }
                return;
            }
            System.out.println("OLNY ONE LETTER, PLEASE.");
        }
    }
}

