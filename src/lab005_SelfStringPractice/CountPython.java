package lab005_SelfStringPractice;

public class CountPython {
    public static void main(String[] args) {

        String str = "python c python python java";



        String temp = str.replace("python", "abcab");
        int countPython = str.length() - temp.length();
        String temp1 = str.replace("java", "aaa");
        int countJava = str.length() - temp1.length();


        if(countJava == countPython){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
