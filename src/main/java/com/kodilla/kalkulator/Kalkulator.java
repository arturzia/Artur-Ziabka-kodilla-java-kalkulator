package com.kodilla.kalkulator;

public class Kalkulator {

    public int sum(int a, int b){

        return a + b;
    }

    public int minus (int a, int b){

        return a - b;
    }

    public static void main(String [] args){

        Kalkulator calc = new Kalkulator();

        System.out.println("Suma: "+ calc.sum(2, 5));

        System.out.println("Roznica: "+ calc.minus(2, 5));
    }


}
