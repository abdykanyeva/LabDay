package lab06_methods;

import java.util.Locale;

public class CustomMethodsPractice2 {
    public static void main(String[] args) {
        System.out.println(rotatedLeft("java"));
        System.out.println(right2("Hello"));

        System.out.println("__________________________________________");
        System.out.println(firstTwo("edit"));

        System.out.println(countHi("abc ho hi"));
        System.out.println("________________________________________");
        System.out.println(catDog("dogcatdogcat"));


        System.out.println("_______________________________________________");

        System.out.println(doubleChar("The"));

        System.out.println(endsLy("y"));
        System.out.println("__________________________________________");

        System.out.println(badAppear("xxbadxx"));

        System.out.println("_________________________________________");
        System.out.println(addString("h"));

        System.out.println(badAppear("ba"));
    }



    public static String shortToLong(String a, String b){
        if(a.length() > b.length()){
            return b + a + b;
        }else if(b.length() > a.length()){
            return a + b+ a;
        }else{
            return a + b;

        }
    }


    public static String rotatedLeft(String word){
        if(word.length() < 3){
            return word;
        }
        String s1 = word.substring(0, 2);
        String lastWords = word.substring(2);

        return lastWords + s1;

    }

    public static String right2 (String str){
        if(str.length()< 3){
            return str;
        }
        String s1 = str.substring(str.length() - 2); // lo
        String s2 = str.substring(0, str.length() - 2); // hel
        return s1  + s2;
    }


    public static boolean firstTwo(String str){
       /* boolean firstTwo = str.substring(0,2).equals(str.substring(str.length() - 2));
        if(str.length() >= 2){
            if(firstTwo){
                return true;
            }else{
                return false;
            }

        }return true;

        */

        if(str.length()<2){
            return false;
        }

        return str.substring(0, 2).equals(str.substring(str.length() - 2));





    }


    public static int countHi(String word){
/*
        int countHi = 0;

        while(word.contains("hi")){
            word = word.replace("hi", "");
            countHi++;
        }
        return countHi;

 */

        int countHi = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            String each = word.substring(i, i + 2);
            if(each.equalsIgnoreCase("hi")){
                countHi++;
            }
        }
        return countHi;



    }


    public static boolean catDog(String str){

        String countCat = " ";
        String countDog = " ";

        String temp = str.replace("cat", "aa");
        String temp1 = str.replace("dog", "dd");
       countCat += temp;
       countDog += temp1;
        if(countCat.length() == countDog.length()){
            return true;
        }
        return false;


    }


    public static boolean caatDog(String str){
        str = str.toLowerCase();
        int countCat = StringUtility.frequency(str, "cat");
        int countDog = StringUtility.frequency(str, "dog");
        return countDog == countCat;
    }

    public static String doubleChar(String word){

        String result = " ";

        for (int i = 0; i < word.length(); i++) {
            result += word.substring(i,i + 1).repeat(2);
        }
        return result;

    }


    public static boolean endsLy(String word){
        if(word.endsWith("ly")){
            return true;
        }
        return false;
    }

    public static boolean badAppear(String word){

        for (int i = 0; i < word.length() - 3; i++) {
            String each = word.substring(i, i +3);
            if(each.equals("bad")){
                return true;
            }
            return false;

        }return false;
    }


    public static String addString(String word){
        String result = " ";
        if(word.length() > 2){
            String firstTwo = word.substring(0, 2);
            result += firstTwo;

        }else{
            String add = word.charAt(0) + "@";
            result += add;
        }
        return result;

    }

    public static int countMi(String str){

        return StringUtility.frequency(str, "hi");

    }





}
