package Learning;

import java.util.Scanner;

/**
 * Avg
 */
public class Avg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of elements: ");
        int numOfElement = input.nextInt();
        double sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < numOfElement; i++) {
            sum += input.nextDouble();
        }
            System.out.println("The Average is "+(sum/numOfElement));
    }
}