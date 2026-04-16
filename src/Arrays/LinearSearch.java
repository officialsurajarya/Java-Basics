package Arrays;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70,80};
        int key = 40;
        int index = linearSearch(numbers,key);

        if (index == -1) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index "+index);
            int pos = index+1;
            System.out.println("And it's Position is: "+ pos);
        }
    }
}
