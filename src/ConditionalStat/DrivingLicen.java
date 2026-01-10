package ConditionalStat;

import java.util.Scanner;

public class DrivingLicen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.print("Please Enter your Age: ");
        int age = sc.nextInt();

        if (age>= 18) {
            System.out.println("You are Eligible to drive");
        }else {
            System.out.println("Beta Cycle chalao");
        }
    }
}
