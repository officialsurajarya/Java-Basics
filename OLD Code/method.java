public class method {
        static void smethod(){
            System.out.println("It is Static");;
        }
        public void pmethod(){
            System.out.println("It is Public");
        }
        public static void main(String[] args) {
            smethod();
            method mn=new method();
            mn.pmethod();
        }
    }
