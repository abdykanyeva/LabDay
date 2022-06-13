package lab006_methodsSelfPractice;

import javax.sound.midi.Soundbank;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));

        System.out.println(extraEnd("Hello"));

        System.out.println(firstTwo("Hello"));
        System.out.println(countHi("AVBCD HIHI CVF HI", "HI"));

    }




    public static String helloName(String name){
        return "Hello" + name;
    }


    public static String extraEnd(String str){

        if(str.length() < 2){

            return str;
        }
        str = str.substring(str.length() - 2).repeat(2);
        return str;


    }

    public static String firstTwo(String str){

        if(str.length() < 2){
            return str;
        }
        return str.substring(0, 2);
    }

    public static boolean frontAgain(String word){
        if(word.length() < 2){
            return false;
        }
        return(word.substring(0, 2).equals(word.substring(word.length() - 2)));
    }

    public static int countHi(String sentence, String word){

        int count = 0;

        for (int i = 0; i < sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());
            if(each.equals(word)){
                count++;
            }

        }return count;
    }




}
