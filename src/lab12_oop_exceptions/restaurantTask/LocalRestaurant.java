package lab12_oop_exceptions.restaurantTask;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class LocalRestaurant {


    public static void main(String[] args) {
        Employee employee1 = new Server("Emily", 35, 'F', "A01", 55000);
        System.out.println(employee1);


        employee1.work();
        ((Server)employee1).takeOrder();
        ( (Server) employee1).cleanTable();


        Employee employee2 = new Chef("Daniel", 42, 'M',  "B01", "Chef", 85000);
        System.out.println(employee2);

        employee2.work();
        ((Chef)employee2).makeOrder();
        ((Chef)employee2).washDishes();


        Restaurant restaurant = new Restaurant("Josh", "7925 Jones Branch Dr", 4.5);

        System.out.println(restaurant);

        restaurant.hireServer((Server)employee1);
        restaurant.hireChef((Chef) employee2);



        System.out.println(restaurant);

        //restaurant.terminateChef("B01");
        //restaurant.terminateServer("A01");
        System.out.println(restaurant);


        System.out.println("________________-");

        for (Chef chef : restaurant.getChefs()) {
            System.out.println(chef);
        }

        System.out.println("________________-");


        for (Server server : restaurant.getServers()) {
            System.out.println(server);
        }


    }
}
