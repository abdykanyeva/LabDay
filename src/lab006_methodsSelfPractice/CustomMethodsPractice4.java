package lab006_methodsSelfPractice;

public class CustomMethodsPractice4 {

    public static void main(String[] args) {

        String str = "aaaaabccdeeef"; // bdf

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            /*
            char each = str.charAt(i);
            int f = StringUtility1.frequencyChar(str, each);

            if(f == 1){
                result += each;
            }

             */

            if(StringUtility1.frequencyChar(str, str.charAt(i) ) == 1){
                result += str.charAt(i);
            }
        }
        System.out.println(result);











        System.out.println("____________________________________________");

        String s = "aaabbc"; // a3b2c1
        String result1 ="";

        String nonDup = StringUtility1.removeDup(s); // abc

        for (int i = 0; i < nonDup.length(); i++) {
            char each = nonDup.charAt(i);

            int f = StringUtility1.frequencyChar(s, each);
            result1 +=""+each + f;

        }
        System.out.println(result1);





    }







}
