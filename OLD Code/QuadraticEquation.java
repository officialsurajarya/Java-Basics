import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class QuadraticEquation {
    public static void main(String[] args) throws IOException {
        // Using InputStreamReader and BufferedReader for input
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Enter coefficient b: ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("Enter coefficient c: ");
        double c = Double.parseDouble(br.readLine());

        // Calculate the discriminant
        double d = b * b - 4 * a * c;

        // Check the nature of the discriminant
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and different: " + root1 + " and " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and the same: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("The roots are complex: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
