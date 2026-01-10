package ControlFlow;

import java.util.Scanner;

public class FactorialUptoN {

    static int fact(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int ans = fact(num);
        System.out.println(ans);
    }
}
