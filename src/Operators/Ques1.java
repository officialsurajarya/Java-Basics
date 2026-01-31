package Operators;

public class Ques1 {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f =3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        //Ans         (3.14*4) + (1000%97)- (99.9954*512)
        //            12.56 + 30 - 51197.6448
        //            42.56 - 51197.6448
        //            -51155.084
        System.out.println(result);
        int $ = 24;

    }
}
