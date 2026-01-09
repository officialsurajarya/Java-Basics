import java.util.Scanner;

public class game1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int userNum;

        do{
            System.out.print("Guess My Number(1 - 100): ");
            userNum = input.nextInt();

            if(myNum == userNum){
                System.out.println("\nWOOHOO......  Correct Number!!!");
                break;
            }
            else if(userNum > myNum ) {
                System.out.println("Your Number is Too Large \nTry again \n");
            }
            else{
                System.out.println("Your Number is too Small\nTry again\n");
            }
        } while(userNum>=0);
        System.out.println("My Number is: " + myNum+ "\nCongrats You Win !");
        
    }
}