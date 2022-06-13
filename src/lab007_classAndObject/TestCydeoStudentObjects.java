package lab007_classAndObject;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();
        student1.setInfo("Naran", 30, 'm', true, true, "Java developer batch1", 2, "Jva");
        System.out.println(student1);

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("Vasyl", 30, 'm', true, true, "Java developer batch1", 2, "Jva");
        System.out.println(student2);


        System.out.println("_______________________________________________________");

        CydeoStudent student5 = new CydeoStudent();
        CydeoStudent student6 = student5;

        student5.setInfo("Vasyl", 30, 'm', true, true, "Java developer batch1", 2, "Jva");
        System.out.println(student5);
        System.out.println(student6);


    }
}
