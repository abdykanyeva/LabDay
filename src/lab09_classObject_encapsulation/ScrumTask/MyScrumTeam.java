package lab09_classObject_encapsulation.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester [] testers = {
                new Tester("JOsh", 28, 'M', "a1", "QA", 45),
                new Tester("Emily", 35, 'F', "a2", "SDET", 42),
                new Tester("Bella", 28, 'F', "a3", "QA", 45),
        };

        Developer [] developers = {
                new Developer("Shukur", 28, 'M', "b1", "FrontendDev", 50, "Java"),
                new Developer("Huseiyn", 30, 'M', "b1", "FrontendDev", 50, "Java"),

        };

        ScrumTeam scrumTeam1 = new ScrumTeam("Bilal", "Hasan", "Lucy", 14);

        scrumTeam1.addTester(testers);
        scrumTeam1.addDevelopers(developers);

        System.out.println(scrumTeam1);


        System.out.println("Testers: ");

        for (Tester tester : scrumTeam1.getTesters()) {
            System.out.println("\t" + tester.getName() + " : " + tester.getSalary());
        }

        for (Developer developer : scrumTeam1.getDevelopers()) {
            System.out.println("\t" + developer.getName() + " : " + developer.getSalary());
        }


    }
}
