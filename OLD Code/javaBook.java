abstract class book{
    abstract void print();
}
class javaBook extends book{
    void print(){
        System.out.println("Java Programing");
    }
}

class test{
    public static void main(String[] args) {
        book obj = new javaBook();
        obj.print(); 
    }
}