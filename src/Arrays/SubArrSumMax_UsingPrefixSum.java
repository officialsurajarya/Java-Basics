package Arrays;

public class SubArrSumMax_UsingPrefixSum {
    static void main(String[] args) {

        int arr[]={1,-2,6,-1,3};
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        int prefixArr[] = new int[arr.length];
        prefixArr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curSum = start ==0 ? prefixArr[end]:  prefixArr[end] - prefixArr[start-1];
                if (max<curSum){
                    max = curSum;
                }
            }
        }
        System.out.print("Max is: "+max);
    }
}
