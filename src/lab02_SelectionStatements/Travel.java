package lab02_SelectionStatements;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the train number: ");
        String trainNum = input.next();



        switch(trainNum){
            case "TR001":
                System.out.println("Boarding Time: 07:15 AM\nHas Bags: No\nNonStop: Yes " +
                        "\nTransport type: Train\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "TR002":
                System.out.println("Boarding Time: 09:30 AM\nHas Bags: No\nNonStop: NO " +
                        "\nTransport type: Train\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "TR003":
                System.out.println("Boarding Time: 08:24 AM\nHas Bags: Yes\nNonStop: Yes " +
                        "\nTransport type: Train\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "TR004":
                System.out.println("Boarding Time: 01:30 PM\nHas Bags: Yes\nNonStop: No " +
                        "\nTransport type: Train\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "BS001":
                System.out.println("Boarding Time: 07:00 AM\nHas Bags: Yes\nNonStop: Yes " +
                        "\nTransport type: Bus\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "BS002":
                System.out.println("Boarding Time: 06:15 PM\nHas Bags: Yes\nNonStop: Yes " +
                        "\nTransport type: Bus\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "BS003":
                System.out.println("Boarding Time: 10:30 PM\nHas Bags: Yes\nNonStop: Yes " +
                        "\nTransport type: Bus\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "FL001":
                System.out.println("Boarding Time: 05:45 AM\nHas Bags: Yes\nNonStop: No " +
                        "\nTransport type: Flight\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "FL002":
                System.out.println("Boarding Time: 09:35 AM\nHas Bags: No\nNonStop: Yes " +
                        "\nTransport type: Flight\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
            case "FL003":
                System.out.println("Boarding Time: 02:45 AM\nHas Bags: No\nNonStop: No " +
                        "\nTransport type: Flight\nDeparture: Berlin\nDestination: Amsterdam" );
                break;
        }
    }
}
