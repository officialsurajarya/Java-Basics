package ControlFlow;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        boolean b = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println(num +" is Prime Number");
        }else {
            System.out.println(num +" is Not a Prime number");
        }
    }
}
