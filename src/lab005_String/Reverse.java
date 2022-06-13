package lab005_String;

public class Reverse {

    public static void main(String[] args) {

        String word = "Wooden Spoon";
        String result = "";


        for (int i = word.length() - 1; i >= 0 ; i--) {
            char each = word.charAt(i);
            result += each;


        }
        System.out.println(result);

    }

}
