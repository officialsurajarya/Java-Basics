package DataTypes_Var_Inp;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String str = sc.nextLine();
        System.out.println("Welcome "+str);
        Double db = sc.nextDouble();
        Float f = sc.nextFloat();
        Long l = sc.nextLong();
        Short s = sc.nextShort();
        String ch = sc.next();
    }
}
