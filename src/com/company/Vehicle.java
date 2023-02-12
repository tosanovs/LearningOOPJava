package com.company;

public class Vehicle {
    private String brand;
    private String color;
    private int year;
    private double price;


    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
      return this.brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    public void setYear(int year){
      this.year=year;
    }
    public int getYear(){
      return this.year=year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}