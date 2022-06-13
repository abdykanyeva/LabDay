package lab005_String;

public class StringMethodsPractice {

    public static void main(String[] args) {


        String name = "JOsh Daniel";

        char ch = name.charAt(4);

        System.out.println(ch);

        char lastChar = name.charAt(name.length() - 1);

        System.out.println(lastChar);

        System.out.println("_______________________________________");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');
        System.out.println(index1);

        int index2 = school.indexOf('j');
        System.out.println(index2);


        String str1 = "Java Programming language";

        int index3 = str1.indexOf("va") + 1;
        System.out.println(index3);

        System.out.println("__________________________________________________________");

        String s1 = "WOODEN SPOON";
        s1 = s1.toLowerCase();
        System.out.println(s1);


        System.out.println("_________________________________________________________");

        String sentence = "Today is Thursday, and Thursday is a lab day";
        sentence = sentence.replace("Thursday", "Friday");
        System.out.println(sentence);

        System.out.println("__________________________________________________________");

        String email = "cydeo_school@gmail.com";

        email  = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        System.out.println(email);


        String s2 = "I stude at Cydeo";
        String result = s2.substring(s2.indexOf('C'));

        System.out.println(result);

        System.out.println("________________________________________________________");

        String a1 = "DOG";

        String a2 = "dog";


        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));


        String s3 = "Java is my favorite programming language";

        System.out.println(s3.equals("Java"));
        System.out.println(s3.contains("Java"));







    }
}
