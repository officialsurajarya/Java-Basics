class Shape {
    int a, b;
    double ar;

    void getData(int x, int y) {
        a = x;
        b = y;
    }

    void areaRect() {
        ar = a * b;
        System.out.println("Area of rectangle = " + ar);
    }

    void areaTr() {
        ar = a * b / 2.0;
        System.out.println("Area of triangle = " + ar);
    }
}

class RunShape {
    public static void main(String[] args) {
        Shape ob = new Shape();
        ob.getData(8, 9);
        ob.areaRect();
        ob.areaTr();
    }
}
