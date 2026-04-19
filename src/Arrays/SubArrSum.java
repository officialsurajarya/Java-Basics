package Arrays;

public class SubArrSum {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int ts=0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int totalSub = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j;
//                System.out.print("(");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                    totalSub += arr[k];
                }
//                System.out.print(")");
                System.out.println();
                ts++;
            }
            System.out.println("total Sum of Sub Arrays "+totalSub);

            System.out.println();
        }
        System.out.println("Total Sub Arrays: "+ts);
    }
}
