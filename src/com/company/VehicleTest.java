package com.company;

import java.util.Scanner;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle();
        Scanner input = new Scanner(System.in);

        System.out.print ("Please enter the vehicle brand >>");
        String brand = input.next();
        vehicle.setBrand(brand);

        System.out.print ("Please enter the vehicle color >>");
        String color = input.next();
        vehicle.setColor(color);

        System.out.print ("Please enter the vehicle Year >>");
        int year = input.nextInt();
        vehicle.setYear(year);

        System.out.print ("Please enter the vehicle price >>");
        double price = input.nextDouble();
        vehicle.setPrice(price);

        System.out.println("Vehicle Information:");
        System.out.println("*************************");
        System.out.println("Brand:" + vehicle.getBrand());
        System.out.println("Color:" + vehicle.getColor());
        System.out.println("Year:" + vehicle.getYear());
        System.out.println("Price: $ " + vehicle.getPrice());
        System.out.println("*************************");
        System.out.println("Simon Tosanov");
    }
}
