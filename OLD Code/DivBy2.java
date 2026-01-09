package Learning;

import java.util.Scanner;

/**
 * DivBy2
 */
public class DivBy2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int b = a/2;

        System.out.println(b);
    }
}