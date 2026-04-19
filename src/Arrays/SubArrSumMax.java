package Arrays;
import java.sql.SQLOutput;
public class SubArrSumMax {
    public static void main(String[] args) {
        int arr[] = {1,-2, 6, -1, 3};
//        int ts=0;
//        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int totalSub = 0;
//                System.out.print("(");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                    totalSub += arr[k];

                }
//                if (min>totalSub){
//                    min = totalSub;
//                }
                if (max<totalSub){
                    max = totalSub;
                }
//                System.out.print(")");
                System.out.print(": "+totalSub);
                System.out.println();
//                ts++;
            }
            System.out.println();
        }
//        System.out.println("Total Sub Arrays: "+ts);
//        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);

    }
}
