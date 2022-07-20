package labSelfPracticePizzaApp;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the best pizza in town");
        System.out.println("Please login before placing the order");

        Scanner input = new Scanner(System.in);


        System.out.println("Please choose your login type? email:1 account number:2");
        int loginType = input.nextInt();


        switch(loginType){
            case 1:

                ArrayList<User> userList = userList(input);
                System.out.println(userList);

                break;
            case 2:
                System.out.println("Account number was choosen");
                break;
        }








    }

    public static ArrayList<User> userList(Scanner scan){

        ArrayList<User> userList = new ArrayList<>();


        for(int i = 0; i < 3; i++){
            User user = new User();

            System.out.println("Email:");
            user.setEmail(scan.next());

            System.out.println("Password");

            userList.add(user);


        }
        return userList;


    }
}








