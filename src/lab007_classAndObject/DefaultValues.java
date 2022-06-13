package lab007_classAndObject;

public class DefaultValues {
    public int anInt;
    public  String str;
    public char ch;
    public double aDouble;


    public String toString() {
        return "DefaultValues{" +
                "anInt=" + anInt +
                ", str='" + str + '\'' +
                ", ch=" + ch +
                ", aDouble=" + aDouble +
                '}';
    }

    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();
        System.out.println(defaultValues);
        System.out.println("\u0000");
    }
}
