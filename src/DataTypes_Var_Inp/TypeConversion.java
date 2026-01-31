package DataTypes_Var_Inp;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 23;
        long b = a;//Implicit or Coercion
        System.out.println(b);
        int c = (int)b;//Explicit or Casting
        System.out.println(c);
    }
}
