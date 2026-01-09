package Learning;

public class staticVar {
    static int count = 0;

    public staticVar(){
        count++;
    }

    public static void main(String[] args) {
        new staticVar();
        new staticVar();
        new staticVar();

        System.out.println("Counter: " + staticVar.count);
    }
}
