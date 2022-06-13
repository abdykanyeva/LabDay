package lab01;

public class AddNumbers {
    public static void main(String[] args) {


        int num = 12345;

        int tenThousand = num / 10000;
        int thousand = (num % 10000) / 1000;
        int hundred = (num % 1000) / 100;
        int decimal = (num % 100) / 10;
        int digit = (num % 10) / 1;

        System.out.println(tenThousand + thousand + hundred + decimal + digit);
    }
}