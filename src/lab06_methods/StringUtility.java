package lab06_methods;

public class StringUtility {
    public static void main(String[] args) {
        System.out.println(reverse("apple"));
    }


// RETURN THE FREQUENCY OF THE GIVEN WORD FROM A STRING

    public static int frequency(String word,  String sentence){
        int countWord = 0;

        for (int i = 0; i < sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());
            if(each.equalsIgnoreCase(word)){
                countWord++;
            }
        }
        return countWord;
    }


    public static String reverse(String word){
        String result = " ";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }

    public static String removeDup(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(result.indexOf(str.charAt(i)) < 0){
                result += str.charAt(i);
            }
        }

        return result;

    }


    public static int frequency(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }





    }





