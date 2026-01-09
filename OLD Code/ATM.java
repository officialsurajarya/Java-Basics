import java.util.Scanner;

    class ATM{
        float balance;
        int PIN = 2024;

        public void checkPIN(){
            System.out.print("Enter Your PIN: ");
            Scanner input = new Scanner(System.in);
            int enterPIN = input.nextInt();
            if (enterPIN==PIN) {
                menu();
            } 
            else{
                System.out.println("Enter a Valid PIN");
                checkPIN();
            }
        }

        public void menu(){
            System.out.println("Enter Your Choice: ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");

            Scanner input = new Scanner(System.in);
            int opt = input.nextInt();

            if (opt == 1) {
                checkBalance();
            }
            else if(opt==2){
                withdrawMoney();
            }
            else if(opt==3){
                depositMoney();
            }
            else if (opt==4){
                return;
            }
            else{
                System.out.println("Invalid Choice !");
            }
        }

        public void checkBalance(){
            System.out.println("Balance: "+ balance);
            menu();
        }

        public void withdrawMoney(){
            System.out.print("Enter amount to withdraw: ");
            Scanner input = new Scanner(System.in);
            float amount = input.nextInt();
            if (amount>balance) {
                System.out.println("Insufficient Balance");
            }
            else{
                balance = balance-amount;
                System.out.println("Money Withdraw Successful");
            }
            menu();
        }
        
        public void depositMoney(){
            System.out.println("Enter the Amount: ");
            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();
            balance = balance+amount;
            System.out.println("Money Deposited Successful !");
            menu();
        }

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPIN();
    }
}