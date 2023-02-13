package com.company;

public class ControlFlows {
    public static void main(String[] args) {

        /*
        while syntax:
        while(condition){
        statement(s)
        }
         */

        int a = 0;
        while (a <= 10){ // 0 1 2 3...9 10
            System.out.println(a); // 0 1 2 3 ... 9 10
            a++; // 1 2 3 4...11 // increment: ja zgolemuva vrednosta na a za 1 so sekoe naredno izvrsuvanje
        }

        /*
        do while syntax:
        do {
        statements
        }
        while(condition)
         */

        int b = 11;
        do {
            System.out.println(b); //0 1
            b++; //1
        }
        while (b <= 10);


        /*
        for(initialization; condition; incr/decr){
        statements;
        }
         */

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        /*
        if / else syntax:
        if(condition){
        statements}
        else{
        statements}
         */

        int number = 40;
        if (number % 2 == 0){ //modul operator: go zema ostatokot pri delenje na dva broja
            System.out.println(number+ " is even number");
        }
        else {
            System.out.println(number+ " is odd number");
        }

        /*
        switch syntax:
        Switch(expression){
        case value1:
        statement;
        break; / continue;
        case value2:
        statement;
        break; /continue;
        case value3:
        statement;
        break; /continue;
        case value4:
        statement;
        break; /continue;
        default:
        statement;
         */

        int num = 20;
        switch (num){
            case 10:
                System.out.println("vrednosta e 10");
                break;
            case 20:
                System.out.println("vrednosta e 20");
                break;
            case 30:
                System.out.println("vrednosta e 30");
            default:
                System.out.println("vrednosta ne e pronajdena");
        }

    }
}
