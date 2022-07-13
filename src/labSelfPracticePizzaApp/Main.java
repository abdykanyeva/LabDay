package labSelfPracticePizzaApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Cydeo Pizza Order App");

        ArrayList<User> user = new ArrayList<>();


    }

    public static ArrayList<User> userList(Scanner scan) {

        ArrayList<User> userList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            User user = new User();

            System.out.println("Email: ");

            //  user.getEmail() = scan.next();

            System.out.println("Password");
            //user.getPassword() ;
        }
        return userList;
    }
}








