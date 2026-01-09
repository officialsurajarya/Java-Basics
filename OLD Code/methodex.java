
    public class methodex{
        public static void main(String[]args) {
            int x = 70;
            int y = 20;
            methodex obj1 = new methodex();
            int z = obj1.method12(x,y);
        }
        int max;
        public int method12(int a,int b){
            
            if (a>b)
                max=a;
             else if (b>a)
                    max=b;
                
                return max;
                System.out.println(z);
            }
    }