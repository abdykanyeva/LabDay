package lab007_classAndObject;

public class TestAddress {

    public static void main(String[] args) {

        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();

        address1.setInfo("12327", "Ashford", "Sugarland", "TX", "77478");
        address2.setInfo("879654", "Ashford", "Sugarland", "TX", "77478");
        address3.setInfo("777985", "Ashford", "Sugarland", "TX", "77478");


        System.out.println(address1);


    }
}
