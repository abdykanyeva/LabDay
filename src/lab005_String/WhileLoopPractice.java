package lab005_String;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Would you like to continue? yes/no");
        String a = input.nextLine();

        while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry! WOuld you like to continue? yes/no");
            a = input.nextLine();

        }
    }
}