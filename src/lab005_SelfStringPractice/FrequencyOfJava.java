package lab005_SelfStringPractice;

import java.util.Locale;

public class FrequencyOfJava {

    public static void main(String[] args) {

        String str = "Java Java C"; // 11

        int countJava = 0;

        for (int i = 0; i < str.length() - 4; i++) {
            String each = str.toLowerCase().substring(i, i + 4);
            if(each.equals("java")){
                countJava++;
            }

        }
        System.out.println(countJava);

    }
}
