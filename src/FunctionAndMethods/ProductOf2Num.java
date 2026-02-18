package FunctionAndMethods;

public class ProductOf2Num {

    public static int Product(int a, int b) {
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int product = Product(3,5);
        System.out.println(product);
    }
}
