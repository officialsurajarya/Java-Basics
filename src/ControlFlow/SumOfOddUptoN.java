package ControlFlow;

import java.util.Scanner;

public class SumOfOddUptoN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <=num; i++) {
            if (i%2!=0) {
                sum+=i;
            }
        }
        System.out.println("Sum of odd number up to "+num+" = "+sum);
    }
}
