package lab005_SelfStringPractice;

public class FrequencyOfWord1 {

    public static void main(String[] args) {
/*
        String str = "Java Python"; //16
        String temp = str.replace("Java", "aaaaa"); //17
        int countJava = temp.length() - str.length();
        System.out.println(countJava);

 */

        String str = "aaabbcaa";

        String temp = str.replace("a", "");
        int countChar = str.length() - temp.length();
        System.out.println(countChar);
    }
}
