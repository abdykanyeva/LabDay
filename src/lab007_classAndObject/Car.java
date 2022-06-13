package lab007_classAndObject;

public class Car {

    public String brand, model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String brand, String model, int year, String color, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }



    public String toString(){

        return "Brand: " + brand +
                " Model: " + model +
                " Year: " + year +
                " Color: " + color +
                " price: " + price;
    }

    public void drive(){
        System.out.println("Driving" + brand + "" + model);
    }



}
