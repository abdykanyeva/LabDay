package lab03_LoopsMethods;

import java.util.Scanner;



public class MyPizzaOrderApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the best Pizza in Town");
        System.out.println("Please login before placing the order");

        // Create 3 variables named email(String), account number(int), password and assign values

        String email = "mike@gmail.com";
        int accountNum = 123;
        String password = "password";

        // Ask customer if he/she wants to login with email(1) or account number(2);
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose your login type? email:1 account number:2");
        int loginType = input.nextInt();


        // create the selection flow for the login type

        for(int i = 3; i > 0;) {

            switch (loginType) {
                case 1:

                    // Enter your email
                    System.out.println("Enter your email");
                    String givenEmail = input.next();

                    // check if the email address is valid ====> if @. available, and @ is before .



                    if(!isEmailValid(givenEmail)){
                        System.out.println("Invalid Email. PLease try again");
                        continue;
                    }



                    // check if the domain is valid // gmail, hotmail mike@gmail.com


                    // enter your password

                    System.out.println("Enter your password");
                    String givenPassword = input.next();

                    if (password.equals(givenPassword) && email.equals(givenEmail)) {
                        System.out.println("Successfully logged in");
                        break;
                    } else {
                        if(i != 1){
                            System.out.println("Invalid credentials " + (i - 1) + " !! chances left");
                            i--;
                            continue;
                        }else{
                            System.out.println("Please try after few hours");
                            System.exit(1);
                        }

                    }


                case 2:
                    System.out.println("Account number login was chosen");

                    break;

                default:

                    break;

            }
            break;
        }








    }
    public static boolean isEmailValid(String givenEmail){
        int firstSignOfIndex = givenEmail.indexOf('@');
        int secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

        if(checkEmail){
            return false;
        }

        return isDomainValid(givenEmail);



    }
    private static boolean isDomainValid(String givenEmail) {
        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

       return checkDomain;
    }



    }

