public class Pattern1 {
    public static void main(String[] args) {
        int n = 9;
        for(int a = 1; a <= n; a++){
            for (int b = 1; b <= a; b++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
