package Arrays;

import java.util.Scanner;

public class InpOup {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Data: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
}
