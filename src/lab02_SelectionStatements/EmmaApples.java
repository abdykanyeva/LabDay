package lab02_SelectionStatements;

public class EmmaApples {
    public static void main(String[] args) {
        int apple1 = 1;
        int apple2 = 1;
        int apple3 = 1;
        int apple4 = 3;
        int apple5 = 1;
        int apple6 = 1;
        int apple7 = 1;


        int sum1 = apple1 +apple2 + apple3;
        int sum2 = apple4 + apple5 + apple6;

        if(sum1 == sum2){
            System.out.println( apple7 + " is heavier ");
        }else if(sum1 > sum2){
            if(apple1 == apple2){
                System.out.println( apple3 + " is heavier");
            }else{
                if(apple1 > apple2){
                    System.out.println(apple1 + " is heavier");
                }else{
                    System.out.println(apple2 + " is heavier");
                }
            }
        }else{
            if(apple4 == apple5){
                System.out.println(apple6 + "is heavier");
            }else{
                if(apple4 > apple5){
                    System.out.println("Apple 4" + apple4 + "is heavier");
                }else{
                    System.out.println(apple5 + " is heavier");
                }
            }
        }
    }
}

