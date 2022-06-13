package lab006_methodsSelfPractice;

public class StringUtility1 {




    public static int frequencyMy(String sentence, String word){  // hi hi - 5 - 2 = 3
        int countFreq = 0;                                          // 3, 5

        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());
            if(each.equals(word)){
                countFreq++;
            }
        }
        return countFreq;


    }

    public static String reverse1(String word){

        String result = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            result += word.charAt(i);

        }
        return result;

    }

    public static String removeDup(String str){  // aabbccdd abcd
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(each + "")){
                result += each;

            }
        }
        return result;



    }

                                    // aaabacddd d
    public static int frequencyChar(String word, char ch){
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if(each == ch){
                count++;
            }
        }
        return count;


    }

}
