package Operators;

import java.util.Scanner;

public class FahrenheitToCelsius {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Fahrenheit to celsius Converter");
        System.out.print("Enter Faharenheit: ");
        float f = sc.nextFloat();

        float cel = (f-32)*5/9;
        System.out.println("Celsius is: "+ cel+"\u00B0C");
    }
}
