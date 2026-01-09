import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of A & B is : " + sum);
    }
}
