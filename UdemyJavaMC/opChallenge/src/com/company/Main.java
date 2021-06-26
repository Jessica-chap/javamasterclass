package com.company;

public class Main {

    public static void main(String[] args) {

        double opdouble = 20.00;
        double opdoubletwo = 80.00;

        double doubleTotal = (opdouble + opdoubletwo) * 100.00;
        double opremainder = doubleTotal % 40.00;
        System.out.println(opremainder);


        if (opremainder == 0) {
            boolean isItZero = true;
            System.out.println(isItZero);
        }
        if (opremainder != 0) {
            boolean isItZero = false;
            System.out.println("Got Some remainder");
        }

    }
}
