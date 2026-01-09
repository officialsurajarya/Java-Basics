class LargestFinder {
    int num1,num2,num3;
    public LargestFinder(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public int findLargest() {
        int largest = num1; 
        if (num2 > largest) {
            largest = num2; 
        }
        if (num3 > largest) {
            largest = num3; 
        }
        return largest;
    }
}
class largestThreeNo {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 25;
        int thirdNum = 15;
        LargestFinder largestFinder = new LargestFinder(firstNum, secondNum, thirdNum);
        int largest = largestFinder.findLargest();
        System.out.println("The largest number is: " + largest);
    }
}
