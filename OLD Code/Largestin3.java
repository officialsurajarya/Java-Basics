/*public class Largestin3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 9;

        if(a>b && a>c){
                System.out.println("A is greater");
        }
        else if(b>c){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is Greater");
        }
    }
}
*/

public class Largestin3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        int c = 39;

        if(a>b){
                System.out.println("A is greater than B");
                if(a>c){
                    System.out.println("A is Greater Than C");
                    System.out.println("A is Greatest");
                }
                else{
                    System.out.println("C is Graeter than A");
                }
        }
        else{
            if(b>c){
                System.out.println("B is Greater than A");
                System.out.println("B is Greater than C");
                System.out.println("B is Greatest");
            }
            else{
                System.out.println("C is Greater than A");
                System.out.println("C is Graeter than B");
                System.out.println("C is Greatest");
            }
        }
    }
}
