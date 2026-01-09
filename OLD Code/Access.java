public class Access {

    String name;
    int roll;
    
    public void print(){
        System.out.println(name);
        System.out.println(roll);
    }

    public static void main(String[] args) {
        
        Access obj = new Access();
        obj.name="Suraj Arya";
        obj.roll=49;
        obj.print();

        Access obj1 = new Access();
        obj1.name="Saurav Arya";
        obj1.roll=45;
        obj1.print();
    }
}
