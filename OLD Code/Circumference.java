public class Circumference {

    public static void main(String arg[]) {
        double r = Double.parseDouble(arg[0]);
        double pi = Math.PI;

        double ans = 2*pi*r;
        
        System.out.println(ans);
    }
}