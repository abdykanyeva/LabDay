package lab005_String;

import javax.xml.catalog.Catalog;

public class FrequencyOfWord3 {
    public static void main(String[] args) {

        String sentence = "Java Java JAva Python Java";

        int countJava = 0;

        for (int i = 0; i <= sentence.length() - 4; i++) {
            String each = sentence.substring(i, i + 4);


            if(each.equals("Java")){
                countJava++;
            }
        }
        System.out.println(countJava);

        System.out.println("________________________________________________________");

        String s = "Cat Cat Cat Dog Dog Dog";

        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < s.length() - 3; i++) {
            String each = s.substring(i, i +3);

            if(each.equals("Cat")){
                catCount++;
            }

        }
        System.out.println(catCount);


    }
}
