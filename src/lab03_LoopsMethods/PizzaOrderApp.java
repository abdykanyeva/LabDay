package lab03_LoopsMethods;

import java.util.Scanner;

public class PizzaOrderApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the best pizza in the town");
        System.out.println("Please login before placing the order");

        // Create 3 variables named email(string), account number(int), password and assign value, Data base values

        String email = "mike@gmail.com";
        int accountNumber = 123; // account number can be between >100 and <1000
        String password = "password";


        // ask customer if he/she wants to login with email(1) or account number(2)
        Scanner scanner = new Scanner(System.in);

        System.out.println("How you would like to login to the system? email(1) account number(2)");
        int loginType = scanner.nextInt();


        for(int i = 3; i>0;) {

            // create the selection flow for the login type

            switch (loginType) { // if I choose log in type -1, should do credentional check
                case 1:
                    // enter your email

                    System.out.println("Enter your email");
                    String givenEmail = scanner.next();

                    // Check if the email address is valid: if @. available and @ is before .

                    if(isEmailValid(givenEmail)) {
                        System.out.println("Invalid");
                        continue;
                    }

                    // check if domain is valid


                    // enter your password

                    System.out.println("Enter your password");
                    String givenPassword = scanner.next();
                    // check if login successful

                    if (email.equals(givenEmail) && password.equals(givenPassword)) {
                        System.out.println("Login was successful");
                        break;
                    } else {
                        if(i != 1){ // ask again
                            System.out.println("Invalid credentials !! left" + (i - 1) + "chances to try") ;
                            i--;
                            continue; // do  not go further after this point, go to the for loop
                            // break; stop the loop here, aand exit the loop
                            // return: stop the method that you are inside


                        }else{
                            System.out.println("TRy again tomorrow");
                           System.exit(2); // close the execution of jvm
                        }

                    }
                    case 2:

                    System.out.println("Account number login");
                    break;

            }
            break;
        }












    }
    public static boolean isEmailValid(String givenEmail){

        int firstSignOfIndex = givenEmail.indexOf("@");
        int secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

        if(checkEmail) {
            return false;
        }

        return isDomain((givenEmail));





    }

    public static boolean isDomain(String givenEmail){
        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        return checkDomain;
        }

    }




