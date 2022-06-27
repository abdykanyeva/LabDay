package lab09_classObject_encapsulation.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {      // ScrumTeam HAS A Tester

    private String PO, BA, SM;

    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();

    private int dayOfSprint;

    public String getPO(){
        return PO;
    }

    public void setPO(String PO){
        terminate(PO, "iNVALID po name: " + PO);
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        terminate(BA, "iNVALID po name: " + BA);
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        terminate(SM, "iNVALID po name: " + SM);
        this.SM = SM;
    }

    public int getDayOfSprint() {
        return dayOfSprint;
    }

    public void setDayOfSprint(int dayOfSprint) {

        if(dayOfSprint <= 0){
            System.out.println("Invalid input");
            System.exit(1);
        }
        this.dayOfSprint = dayOfSprint;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    private static void terminate(String arg, String err){
        if(arg == null || arg.trim().isEmpty()){
            System.err.println(err);
            System.exit(1);
        }
    }

    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDayOfSprint(dayOfSprint);
    }


    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTester(Tester [] tester){
        this.testers.addAll(Arrays.asList(tester));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer [] developer){
        this.developers.addAll(Arrays.asList(developer));
    }

    public void removeTester(String id){
        testers.removeIf(p -> p.getEmployeeID().equals(id));
    }

    public void removeDeveloper(String id){
        developers.removeIf(p -> p.getEmployeeID().equals(id));
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}


/*
3. create a class called ScrumTeam
            Attributes:
                PO (String), BA (String), SM (String)
                testers (ArrayList<Tester>)
                developers(ArrayList<Developer>)
                daysOfSprint (int)

            Encapsulate the fields PO, BA, SM and daysOfSprint
                Conditions:
                  PO, BA, SM can not be null/empty/blank
                  days of sprint can not be 0 or negative

            Encapsulate tester and developers but ONLY generate getters
                (we do not set them by setters we will use add and remove functions instead)

            Add a constructor that can set the names of PO, BA and SM

            Methods:
                addTester(Tester tester): adds the given tester to the testers ArrayList

                addTester(Tester[] testers): adds the given testers to the testers ArrayList

                addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                addDeveloper(Developer[] developers): adds the given developers to the developers ArrayList

                removeTester(long employeeID): removes the given tester from the testers ArrayList

                removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                toString(): prints PO name, SM name, BA name, number of tester, and number of developers

 */