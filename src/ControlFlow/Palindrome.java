package ControlFlow;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1234321;
        int temp = num;
        int rev = 0;

        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        if (temp == rev) {
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not a palindrome");
        }
    }
}
