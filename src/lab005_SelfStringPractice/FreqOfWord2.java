package lab005_SelfStringPractice;

public class FreqOfWord2 {


    public static void main(String[] args) {
        String str = "Java Java Java Python";

        int countJava = 0;

        while(str.indexOf("Java") >=0){
            str = str.replaceFirst("Java", "");
            countJava++;
        }
        System.out.println(countJava);
    }
}
