package Arrays2D;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Representation {
    public static void Search(int matrix[][], int key){
        boolean f = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key==matrix[i][j]){
                    System.out.println(key+" is found at Cell("+i+","+j+")");
                    f = true;
                }
            }
        }
        if (f == false){
            System.out.println("Element not Found");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter the Elements("+i+","+j+"): ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        //Output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int key = 4;
        Search(matrix,key);
    }
}
