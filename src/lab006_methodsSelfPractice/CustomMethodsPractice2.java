package lab006_methodsSelfPractice;

public class CustomMethodsPractice2 {


    public static void main(String[] args) {
//        System.out.println(countHi("hi hi hi hi hi"));
//
//
//        System.out.println(catDog("cat dog cat dog"));
//
//
//        System.out.println(doubleChar("The"));
//
//        System.out.println(ly("friend"));
//
//        System.out.println(hasBad("xxxbad"));
//        System.out.println(atFirst("hello"));
        System.out.println(isPalindrome("javac"));
    }

    public static int countHi(String str) {

        return StringUtility1.frequencyMy(str, "hi");

    }


    public static boolean catDog(String str) {
        str = str.toLowerCase();
        int countCat = StringUtility1.frequencyMy(str, "cat");
        int countDOg = StringUtility1.frequencyMy(str, "dog");

        return countCat == countDOg;
    }


    public static String doubleChar(String word) { // the tthhee tt

        String result = " ";

        for (int i = 0; i < word.length(); i++) {
            result += word.substring(i, i + 1).repeat(2);


        }
        return result;

        /*
         String result = " ";

        for (int i = 0; i < word.length(); i++) {
            result += word.substring(i,i + 1).repeat(2);
        }
        return result;
         */
    }

    public static boolean ly(String word) {
        return word.endsWith("ly");
    }

    public static boolean hasBad(String word) {
        if (word.equals("bad")) {
            return true;
        }
        if (word.length() < 4) {
            return false;

        }
        if (word.substring(0, 3).equals("bad")) {
            return true;
        }
        if (word.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;


    }

    public static String atFirst(String str) {
        String result = " ";


        if (str.isEmpty()) {
            return result += "@@";
        }
        if (str.length() < 3) {
            return result += "@";
        }
        if (str.length() > 2) {
            return result += str.substring(0, 2);
        }
        return result;
    }

    public static boolean isPalindrome(String str) {

        return StringUtility1.reverse1(str).equalsIgnoreCase(str);


    }
}
