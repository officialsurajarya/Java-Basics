import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Wlcm to new Year Calculator");
        System.out.print("Plz Enter Year that you want to check leap year : ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0 ) ){
            System.out.println("Your Year is a leap year");
        } else {
            System.out.println("Your Year is not a leap year");
        }
    }    
}
