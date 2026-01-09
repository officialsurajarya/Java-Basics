package Operators_IfElse_NumSys;

public class Swap2Num {
    static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("a: " + a +"\nb: " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap");
        System.out.println("a: " + a + "\nb: " + b);
    }
}
