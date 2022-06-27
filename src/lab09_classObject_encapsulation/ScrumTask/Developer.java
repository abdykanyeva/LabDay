package lab09_classObject_encapsulation.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {
    private String name;
    private int age;
    private char gender;
    private String employeeID;
    private String jobTitle;
    private double hourlyRate;
    private String programmingLanguage;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.isEmpty() || name.isBlank()){
            System.out.println("Name can not be set to null/empty/blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 18){
            System.out.println("age can not be less than 18: " + age);
            System.exit(1);
        }
        this.age = age;
    }


    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        if( !(gender == 'M' || gender == 'F') ){ // invalid
            System.out.println("gender can only be set to 'M' or 'F': " + gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        if(jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()){
            System.out.println(" jobTitle can not be set to null/empty/blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate){
        if(hourlyRate < 0){
            System.out.println("Hourly Rate can not be negative");
            System.exit(1);
        }

        this.hourlyRate = hourlyRate;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    
    public void setProgrammingLanguage(String programmingLanguage){

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.addAll(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));
        
        if(!programmingLanguages.contains(programmingLanguage)){
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
        
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int age, char gender, String employeeID, String jobTitle, double hourlyRate, String programmingLanguage) {
        setName(name);
        setAge(age);
        setGender(gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
        setProgrammingLanguage(programmingLanguage);
    }

    public double getSalary(){
        double annualSalary = hourlyRate * 40 * 52;
        return annualSalary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=" + getSalary() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    public void coding(){
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }

    public void fixingBugs(){
        System.out.println(name + " is fixing bugs");
    }
}

/*
 2. create a class named Developer
            Attributes:
                name, age, gender, employeeID, jobTitle, hourlyRate , programmingLanguage

            Encapsulate all the fields
              Conditions for setting the fields:
                  1. name can not be set to null/empty/blank
                  2. age can not be less than 18
                  3. gender can only be set to 'M' or 'F'
                  5. jobTitle can not be set to null/empty/blank
                  6. hourlyRate  can not be negative
                  7. programmingLanguage must be one of those programming language:
                          languages = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}
            Method:
              getSalary(): returns the annual salary
              coding()
              fixingBug()
              toString()

 */