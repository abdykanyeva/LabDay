package lab02_SelectionStatements;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Put your apple to the arm scale: ");
        int apple1 = input.nextInt();
        int apple2 = input.nextInt();
        int apple3 = input.nextInt();
        int apple4 = input.nextInt();
        int apple5 = input.nextInt();
        int apple6 = input.nextInt();
        int apple7 = input.nextInt();


        int sum1 = apple1 + apple2 + apple3;
        int sum2 = apple4 + apple5 + apple6;

        if(sum1 == sum2){
            System.out.println("Found it : Apple 7(" + apple7 + "gr) is heavier");
        }else{
            if(sum1 > sum2){
                if(apple1 == apple2){
                    System.out.println("Found it : Apple 7(" + apple3 + "gr) is heavier");
                }else{
                    if(apple1 > apple2){
                        System.out.println("Found it : Apple 7(" + apple1 + "gr) is heavier");
                    }else{
                        System.out.println("Found it : Apple 7(" + apple2 + "gr) is heavier");
                    }
                }
            }else{
                if(apple4 == apple5){
                    System.out.println("Found it : Apple 7(" + apple6 + "gr) is heavier");
                }else{
                    if(apple4 > apple5){
                        System.out.println("Found it : Apple 7(" + apple4 + "gr) is heavier");
                    }else{
                        System.out.println("Found it : Apple 7(" + apple5 + "gr) is heavier");
                    }
                }

            }
        }







    }
}
