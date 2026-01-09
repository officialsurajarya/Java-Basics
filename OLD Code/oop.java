class Car {
    String name;
    String color;
    int speed;

    public void run() {
        System.out.println("Running");
    }

    public void printcolor(){
        System.out.println(this.color);
        System.out.println(this.name)
        ;
    }
}

public class oop {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.name = "Creta";
        obj1.color = "Black";
        obj1.speed = 200;

        obj1.run();
        obj1.printcolor();
        
    }
}
