package lab005_String;

public class FrequencyOfWOrd2 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Python";

        int countJava = 0;

        while(sentence.indexOf("Java") >= 0){
            sentence = sentence.replaceFirst("Java", "");
            countJava++;

        }
    }
}
