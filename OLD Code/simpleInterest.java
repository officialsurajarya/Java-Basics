package Learning;

import java.util.Scanner;

/**
 * simpleInterest
 */
public class simpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int P = input.nextInt();

        System.out.print("Rate of Interest in % per annum: ");
        int R = input.nextInt();

        System.out.print("Enter Time: ");
        int T = input.nextInt();

        double ans = (P*R*T)/100;

        System.out.println("Simple Interest is: "+ans);
    }
}