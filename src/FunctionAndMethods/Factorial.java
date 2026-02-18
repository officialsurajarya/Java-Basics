package FunctionAndMethods;

public class Factorial {

    public static int Fact(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int a = 9;
        int fact = Fact(a);
        System.out.println(fact);
    }
}
