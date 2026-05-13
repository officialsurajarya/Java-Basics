package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        int start = 0;
        int end = str.length()-1;
        boolean ans = true;
        while(start<end){
            if (str.charAt(start)!=str.charAt(end)) {
                ans=false;
                break;
            }
            start++;
            end--;
        }
        if (ans) {
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
