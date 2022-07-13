package labSelfPracticePizzaApp;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    private String email;
    private String password;

    public User(){
        setEmail(email);
        setPassword(password);
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        ArrayList<String> domain = new ArrayList<>(Arrays.asList("Gmail", "Hotmail", "Live"));
        if(email.contains(domain +"")){
            this.email = email;
        }else{
            System.out.println("Email domain can  only be \"Gmail\", \"Hotmail\", \"Live\"");
            System.exit(1);
        }
        int firstIndexOf = email.indexOf('@');
        int secondIndexOf = email.indexOf(".");

        boolean checkEmail = secondIndexOf < firstIndexOf || secondIndexOf < 0 || firstIndexOf < 0;

        if(checkEmail){
            this.email = email;
        }else{
            System.out.println("Invalid email credentials: " + email);
            System.exit(1);
        }



    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
