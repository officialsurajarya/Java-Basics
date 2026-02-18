package FunctionAndMethods;

public class BinomialCoff {

    public static int Fact(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact*i;
        }
        return fact;
    }

    public static int BinomialCof(int n, int r) {
        int BinomialCoffi = Fact(n) / (Fact(r) * Fact(n-r));
        return BinomialCoffi;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int BinomialCoffic = BinomialCof(n,r);
        System.out.println(BinomialCoffic);
    }
}
