package lab06_methods;

public class CustomMethodPractice {
    public static void main(String[] args) {
        System.out.println( greeting("Dastan"));

        System.out.println("_________________________________________________________");

        System.out.println(makeAbba("Hi", "Bye"));

        System.out.println("___________________________________________________");

        System.out.println(lastChar("Hi"));
        System.out.println("_________________________________________");
        System.out.println(firsTwo("He"));
        System.out.println(firsTwo(" "));

        System.out.println("____________________________________");
        System.out.println(withoutFirstAndLast("Hello"));
    }



    public  static String greeting(String name){
        String greeting = "Hello " + name;
        return greeting;
    }

    public static String makeAbba(String a, String b){
        String result = "";
        result += a;
        result += b;
        result += b;
        result += a;

        return result;

    }

    public static String lastChar(String word){


        if(word.length() < 2){
            return word;
        }

        String substring = word.substring(word.length() - 2); // last two char of the string
        String result = substring.repeat(3);

        return result;
    }

    public static String firsTwo(String word){
        /*if(word.length() < 2){
            return word;
        }
        String substring = word.substring(0, 2);
        return substring;

         */

        if(word.length() >= 2){
            return word.substring(0, 2);
        }
        return word;
    }


    public static String withoutFirstAndLast(String word){

        if(word.length() >= 3) {
            return word.substring(1, word.length() - 1);
        }else{
            return word;
        }
    }



}
