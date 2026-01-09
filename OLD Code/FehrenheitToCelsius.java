import java.util.Scanner;

/**
 * FehrenheitToCelsius
 */
class FehrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fehrenhrit");
        float Fah = input.nextFloat();
        float cel = (Fah - 32)*5/9;
        System.out.println(cel);
    }    
}