package ControlFlow;

public class Table {

    public static void TablePrint(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }

    static void main(String[] args) {
       TablePrint(7);
    }
}
