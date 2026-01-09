public class mltplobj {
    int x = 5;
    public static void main(String[] args) {
        mltplobj obj1 = new mltplobj();
        mltplobj obj2 = new mltplobj();
        obj2.x=10;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
