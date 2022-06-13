package lab005_String;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby";

        int originalLength = sentence.length();

        String temp = sentence;

        temp = temp.replace("Java", "   ");
        int new_length= temp.length();
        System.out.println(originalLength);


        System.out.println();




    }
}
