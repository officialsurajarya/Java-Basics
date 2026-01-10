package Operators;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to compund Interest Calc");
        System.out.print("Please Enter your principle amount Rs: ");
        int p = inp.nextInt();
        System.out.print("Rate of Interest in  %: ");
        float r = inp.nextFloat();
        System.out.print("Time in year: ");
        float t = inp.nextFloat();

        double CI = p * Math.pow(1 + r / 100, t);
        System.out.println("Compound Interest is: "+ CI);
    }
}
