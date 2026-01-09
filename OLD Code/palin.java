import java.util.Scanner;

class palin {
    public static void main(String[] args) {
        int r, rev = 0, temp;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = obj.nextInt();
        temp = n;
        while(n > 0) {
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        if (rev == temp) {
            System.out.println("It is palindrome");
            System.out.println(rev);
        } else {
            System.out.println("It is not palindrome");
        }
    }
}