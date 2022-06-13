package lab008_BudgetSplitterLab;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Budget Planner!");


        // Ask how many people in the budget palnner?
        System.out.println("How many people will split the budget?");


        //  Create user








    }
    public static ArrayList<User> prepareUserLists(Scanner scan){

        ArrayList<User>userList = new ArrayList<>();
        int userCount = scan.nextInt();


        for (int i = 0; i < userCount; i++) {

            User user = new User();

            System.out.println("Name: ");
            user.name = scan.next();


            System.out.println("Email: ");
            user.email = scan.next();

            userList.add(user);   // object



        }
        return userList;
    }



}
