import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
    String userName = myObj.nextLine();  // Read user input

    Scanner myObj1 = new Scanner(System.in);
    System.out.println("Enter Age");
    String Age = myObj1.nextLine();

    Scanner myObj2 = new Scanner(System.in);
    System.out.println("Enter Mobile No.");
    String Mobile_No = myObj2.nextLine();

    System.out.println("Username is: " + userName);  // Output user input
    System.out.println("Age is: " + Age);
    System.out.println("Phone Number is: " + Mobile_No);
  }
}