public class FirstPtrn {
    public static void main(String[] args) {
        firstPattern();
    }

    public static void firstPattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
