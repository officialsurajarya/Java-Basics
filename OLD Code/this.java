class Number {

    int a, b;//Instance Variable
//int a; Error

    void getdata(int a, int b)//Local Variable
    {
        this.a = a;
        this.b = b;
    }

    void putdata() {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

class thisCode{

    public static void main(String args[]) {
        Number N = new Number();
        N.getdata(20, 50);
        N.putdata();

    }
}
