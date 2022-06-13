package lab004_debug;

public class Debug {
    public static void main(String[] args) {
        System.out.println("Hello");

        String name = "Mike";
        int age = 30;

        if(name.equals("Mike") && age == 30){
            System.out.println("Correct info");
        }else{
            System.out.println("Wrong info");
        }

        for (int i = 0; i < 3; i++) {
            if(i == 2){
                method1();
            }else{
                method2();
            }
        }
    }
    private static void method1(){
        System.out.println("I am inside the method1");
    }

    private static void method2(){
        System.out.println("I am inside the method2");
    }

}
