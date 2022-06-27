package lab09_classObject_encapsulation.ScrumTask;

public class Test {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Daniel", 28, 'M', "a01", "QA", 40);

        System.out.println(tester1);
        tester1.testing();

        Developer developer1 = new Developer("Munara", 25, 'F', "A07", "Software engineer", 70.5, "Java");

        System.out.println(developer1);

        developer1.coding();
        developer1.fixingBugs();

    }
}
