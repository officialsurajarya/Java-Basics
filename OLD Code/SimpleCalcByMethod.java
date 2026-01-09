import java.util.Scanner;

public class SimpleCalcByMethod {
    
    public static void sumof(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of A and B is: " + sum);
    }
    
    public static void differenceOf(int a, int b) {
        int diff = a - b;
        System.out.println("Difference of A and B is: " + diff);
    }
    
    public static void productOf(int a, int b) {
        int product = a * b;
        System.out.println("Product of A and B is: " + product);
    }
    
    public static void divisionOf(int a, int b) {
        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Division of A by B is: " + division);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What operation do you want to perform: + - * / ");
        String calc = input.nextLine();

        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        switch (calc) {
            case "+":
                sumof(a, b);
                break;
            case "-":
                differenceOf(a, b);
                break;
            case "*":
                productOf(a, b);
                break;
            case "/":
                divisionOf(a, b);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        input.close();
    }
}
