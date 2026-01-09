package Learning;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if(age > 18) {
            System.out.println("Your Are Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}
