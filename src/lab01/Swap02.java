package lab01;

public class Swap02 {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 20;
        n2 = n1 + n2; //35
        n1 = n2 - n1; // 20
        n2 = n2 - n1;

        System.out.println("n1: " + n1);
        System.out.println(("n2: " + n2));
    }
}
