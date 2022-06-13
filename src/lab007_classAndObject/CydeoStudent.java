package lab007_classAndObject;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isMarried, isEmployed;
    public String batch;
    public int groupNumber;
    public String programLang;

// sets all the fields
    public void setInfo(String name, int age, char gender, boolean isMarried, boolean isEmployed, String batch, int groupNumber, String programLang) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.batch = batch;
        this.groupNumber = groupNumber;
        this.programLang = programLang;
    }


    public void study(){
        System.out.println(name + " is studying " + programLang);

    }

// displays student info when the object is passed in print statement
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                ", programLang='" + programLang + '\'' +
                '}';
    }
}
