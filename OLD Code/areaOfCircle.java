import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter th Radius Of Circle: ");
        Double rad = input.nextDouble();
        Double area = 3.14*rad*rad;
        System.out.println("Your Area Of Circle is :"+area);
    }
}
