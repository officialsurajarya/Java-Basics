class vehicle{
    int price;
    int mileage;
    String color;

    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}

class car extends vehicle{
    String ftype;
    boolean sunroof;
    String brand;

    void look(){
        System.out.println(ftype);
        System.out.println(sunroof);
        System.out.println(brand);
    }

}

public class inheritance {
    public static void main(String[] args) {
        car car1 = new car();
        car1.brand = "Tata";
        car1.price = 1000000;
        car1.mileage = 25;
        car1.color = "white";
        car1.sunroof = true;
        car1.ftype = "Petrol";
        
        
        car1.display();
        car1.look();
    }
}
