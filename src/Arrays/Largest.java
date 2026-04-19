package Arrays;

public class Largest {
    public static int getMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static int getMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4,5};
        int min = getMin(arr);
        int max = getMax(arr);
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
    }
}
