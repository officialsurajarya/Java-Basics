package Operators_IfElse_NumSys;

public class SimpleInterest {
    static void main(String[] args) {
        double P = 1000;  // Principal
        double R = 5;     // Rate of interest in %
        double T = 3;     // Time in years

        double SI = (P * R * T) / 100;
        System.out.println(SI);
    }
}
