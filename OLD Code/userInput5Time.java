import java.util.Scanner;

public class userInput5Time {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a = 1;
        while(a<=5){
            int input = obj.nextInt();
            System.out.println("Your Number is "+ input); 
            input++;
        }
    }
}
