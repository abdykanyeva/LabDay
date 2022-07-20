package labSelfPracticePizzaApp;


import java.util.ArrayList;
import java.util.Arrays;

public class User {

    private String email, accNum, password;


    public User() {
        setEmail(email);
        setAccNum(accNum);
        setPassword(password);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if(!isEmailValid(email)){
            throw new InvalidInputException("Email is invalid");
        }

        this.email = email;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(!isStrongPassword(password)){
            throw new InvalidInputException("Password is not strong enough");
        }
        this.password = password;

    }

    private static boolean isStrongPassword(String password){

        int countLetter = 0;
        int countDigit = 0;
        int countSpecChar = 0;
        boolean strongPassword = false;

        if(password.length() >= 8 && !password.contains(" ")){
            for(char each:password.toCharArray()){
                if(Character.isLetter(each)){
                    countLetter++;
                }else if(Character.isDigit(each)){
                    countDigit++;
                }else {
                    countSpecChar++;
                }
            }

        }
        if(countLetter > 0 && countDigit > 0 && countSpecChar > 0){
            strongPassword = true;
        }
        return strongPassword;



    }

    private static boolean isDomainValid(String email){

        String domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        return checkDomain;
    }

    private static boolean isEmailValid(String email){

        int firstSignOfIndex = email.indexOf('@');
        int secondSignOfIndex = email.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

        if(checkEmail){
            return false;
            }

        return isDomainValid(email);
    }





    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", accNum='" + accNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
