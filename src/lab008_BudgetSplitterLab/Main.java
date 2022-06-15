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

        ArrayList<User> userList = prepareUserLists(scan);

        // expense db
        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count: " + userList.size());

        String [] optionList = prepareOptionsList();

        while(true) {

        System.out.println("What would you like to do?");

            for (int i = 0; i < optionList.length; i++) {
                System.out.println(optionList[i] + ":" + (i + 1));
            }
            int request = scan.nextInt();


            switch (request - 1) {
                case 0:

                    // ask expense name, amount, user
                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scan.next();

                    System.out.println("Expense amount: ");
                    expense.amount = scan.nextInt();

                    System.out.println("Which user made this expense?  JUst type user id: ");

                    // i want to print user from system

                    for (User user:userList){
                        System.out.println("id:" + userList.indexOf(user) + "name: " + user.name);
                    }


                    int userId = scan.nextInt();
                    User user = userList.get(userId);

                    expense.user = user.name;


                    expenseList.add(expense);
                    break;

                case 1:
                    System.out.println("Please provide user name that you would like to search");
                    String userName = scan.next();

                    /*for(int i = 0; i< userList.size();i++){
                        if(!userList.contains(userList.get(i).name)){
                            System.out.println("Invalid user name");
                            continue;
                        }
                    }

                     */

                    User myUser = null;


                    for(User chosenUser : userList){
                        if(chosenUser.name.equals(userName)){
                            myUser = chosenUser;
                            break;
                        }
                    }
                    if(myUser == null){
                        System.out.println("User not exist");
                        break;
                    }


                    // List specific person Expense
                    //0 - expence amount: 100, expense by: ozzy
                    // 1 - expense amount, expense by: ozzy
                    // ozzy spent $200
                    int expenseAmount = 0;
                    int expenseCount = 0;;


                    for(int i = 0; i < expenseList.size(); i++){
                        if(expenseList.get(i).user.equals(userName)){
                            expenseAmount += expenseList.get(i).amount;
                            expenseCount++;
                            System.out.println( expenseCount + " - expense amount: " + expenseList.get(i).amount + ", expense by: " +
                                    expenseList.get(i).user);
                        }
                    }
                    System.out.println(myUser.name + " spent $ " + expenseAmount);





                    break;
                case 2:
                    for(int i = 0; i < expenseList.size();i++){
                        System.out.println(i + "expense amount: " + expenseList.get(i).amount +
                                ", expense by: " + expenseList.get(i).user );

                    }


                    break;
                case 3:
                    
                    double totalAmount = 0;

                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for(Split split: splitList){
                        totalAmount += split.amount;
                    }
                    makeSplit(totalAmount, splitList);




                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }












    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {


        double amount = totalAmount / splitList.size();

        for(Split split:splitList){

            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));

            }else{
                System.out.println(split.userName + " needs to give " + (-1 * (split.amount - amount)));
            }

        }







    }

    private static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for(Expense expense: expenseList){
            Split split = existSplitList(expense.user, splitList);

            if(split != null){
                split.amount += expense.amount;

            }else{
               Split willBeAdded = new Split();
               willBeAdded.userName = expense.user;
               willBeAdded.amount = expense.amount;
               splitList.add(willBeAdded);
            }



        }

        return splitList;

    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {


        for(Split split: splitList){
            if(split.userName.equals(userName)){
                return split;
            }
        }
        return null;

    }

    // create an arraylist to store in a database
    public static ArrayList<User> prepareUserLists(Scanner scan){  // Arraylist is a collection of objects

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


    public static String [] prepareOptionsList(){
         /*
        Creating options
        0: Make expenses
        1: List Specific Person Expense
        2: List All Expense
        3: Make Split
        4: List All Users
        5: Close the budget
         */
        String[]optionList = {"Make expenses", "List Specific Person Expense", "List All Expense",
                "Make Split", "List All Users", "Close the budget"};
        return optionList;

    }



}
