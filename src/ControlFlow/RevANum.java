package ControlFlow;

public class RevANum {
    public static void main(String[] args) {
        int num = 78542;
        int rev = 0;

        while (num!=0) {
//            System.out.print(num%10);
//            num /= 10;
            int last = num%10;
            rev = rev*10+last;
            num/=10;
        }
        System.out.println(rev);
    }
}
