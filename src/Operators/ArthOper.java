package Operators;

import java.util.Scanner;

public class ArthOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Digit: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Digit: ");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

    }
}
