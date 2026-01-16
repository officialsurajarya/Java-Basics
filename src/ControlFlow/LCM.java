package ControlFlow;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        for (int i = max; i <= num1*num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("LCM of "+num1+" and " +num2+" is: "+i);
                break;
            }
        }
    }
}
