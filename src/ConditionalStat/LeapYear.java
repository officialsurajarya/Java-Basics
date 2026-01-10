package ConditionalStat;

import java.util.Scanner;

public class LeapYear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to leap year finder");
        System.out.print("Enter Year: ");
        int y = sc.nextInt();

        if((y%4==0 && y%100!=0) || y%400==0) {
            System.out.println("Leap Year: "+y);
        }else{
            System.out.println("Not Leap Year: "+y);
        }
    }
}
