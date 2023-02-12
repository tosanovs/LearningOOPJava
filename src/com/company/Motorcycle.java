package com.company;

    public class Motorcycle {

        String model;
        String color;
        boolean engineState = false;

        void startEngine(){
            if (engineState ==true)
                System.out.println("The engine is already on.");
            else {
                engineState = true;
                System.out.println("The engine is now on.");
            }
        }

        void showAtts(){
            System.out.println("This motorcycle is a " + color + " " +model);
            if (engineState == true)
                System.out.println("The engine is on.");
            else
                System.out.println("The engine is off.");
        }
        public static void main(String[] args) {

            Motorcycle motor = new Motorcycle(); // creates an object of Motorcycle class
            motor.model = "Yamaha";
            motor.color = "Red";
            System.out.println("Calling showAtts...");
            motor.showAtts();
            System.out.println("-----------------------------");
            System.out.println("Starting engine...");
            motor.startEngine();
            System.out.println("-----------------------------");
            System.out.println("Calling show Atts...");
            motor.showAtts();
            System.out.println("------------------------------");
            System.out.println("Staring Engine...");
            motor.startEngine();

        }
    }
