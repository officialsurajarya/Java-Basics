package Learning;

public class instantVar {
    int a = 20;
    int b = 20;

    void Sum(){
        int z = a+b;
        System.out.println(z);
    }
    public static void main(String[] args) {
        instantVar obj1 = new instantVar();
        obj1.Sum();
    }
}
