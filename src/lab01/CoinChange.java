package lab01;

public class CoinChange {
    public static void main(String[] args) {
        int priceInCents = 30;
        int change = 100 - priceInCents; // 1quarter, 1 dime 0 nickles
        int quarter = change / 25; //35/25
        int dime = (change % 25) / 10;
        int nickle = ((change % 25) % 10) / 5;

//
//
        System.out.println("quarte: " + quarter + "dimes: " + dime + " nickle: " + nickle);



    }
}
