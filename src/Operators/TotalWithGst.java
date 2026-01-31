package Operators;

public class TotalWithGst {
    public static void main(String[] args) {
        float apple = 23.2f;
        float mango = 32.1f;
        float litchi = 11.4f;
        double subtotal = apple + mango + litchi;
//        System.out.println(subtotal);
        double total = (subtotal*0.18)+subtotal;
        System.out.println(total);
    }
}
