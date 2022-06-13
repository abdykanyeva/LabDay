package lab02_SelectionStatements;

import java.util.Scanner;

public class MyTrainBookingApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a bag?(yes:true, no:false)");
        boolean haveBag = input.nextBoolean();

        System.out.println("Direct transport only? (Yes:true, No:false");
        boolean nonStop = input.nextBoolean();

        System.out.println("Choose your travel type? Train: , Bus:2, Flight:3");
        int travelTYpe = input.nextInt();

        System.out.println("From:");
        String from = input.next();

        System.out.println("To");
        String to = input.next();

        String train1 = "TR001";
        String train2 = "TR002";
        String train3 = "TR003";
        String train4 = "TR004";
        String bus1 = "BS001";
        String bus2 = "BS002";
        String bus3 = "BS003";
        String flight1 = "FL001";
        String flight2 = "FL002";
        String flight3 = "FL003";

        if(!from.equals("Berlin") && to.equals("Amsterdam")){
            System.out.println("For now we don't have other options");
            return; // stop JVM
        }

        switch(travelTYpe){
            case 1: //train
                if(nonStop && haveBag){
                    System.out.println("You can take " + train3);
                    return;
                }else if(!nonStop && haveBag){
                    System.out.println("You can take " + train4);
                }else if(nonStop && !haveBag){
                    System.out.println("You can take " + train1);
                }else{
                    System.out.println(train1 + train2 + train3 + train4);
                }
                break;

            case 2: // bus
                System.out.println("You can take" + bus1 + bus2 );
                break;

            case 3: // flight
                if(nonStop && haveBag){
                    System.out.println("Could not find any flight for you - please check your filters and retry it");
                    return;
                }else if(!nonStop && haveBag){
                    System.out.println("You can take" + flight1);
                }else if(nonStop && !haveBag){
                    System.out.println("You can take " + flight2);
                }else{
                    System.out.println("You can take" + flight1 + flight2 + flight3);
                }

                break;
            default:
                System.out.println("No travel type");


        }








    }
}
