package Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (arr[mid]==key){
                return mid;
            }if (arr[mid]>key) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int key = 40;
        int index = binarySearch(arr,key);
        if(index==-1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element Found At index: "+index);
        }
    }
}
