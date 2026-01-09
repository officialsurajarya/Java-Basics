
import java.io.*;

class Area {

    public static void main(String args[]) throws IOException {
        int a, b, c, ch;
        double r, s, ar;
        String choice;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        do {
            System.out.println("1. Area of Square\n2. Area of Circle\n 3. Area of Rectangle \n 4. Area of Triangle");
            System.out.println("Enter the Choice(1 to 4)");
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1: {
                    System.out.println("Enter the Side of Square");
                    a = Integer.parseInt(br.readLine());
                    ar = a * a;
                    System.out.println("Area of Square=" + ar);
                    break;
                }
                case 2: {
                    System.out.println("Enter the Radius of Circle");
                    r = Double.parseDouble(br.readLine());
                    ar = Math.PI * r * r;
                    System.out.println("Area of Circle=" + ar);
                    break;
                }
                case 3: {
                    System.out.println("Enter 2 Sides of Rectangle");
                    a = Integer.parseInt(br.readLine());
                    b = Integer.parseInt(br.readLine());
                    ar = a * b;
                    System.out.println("Area of Rectangle=" + ar);
                    break;
                }
                case 4: {
                    System.out.println("Enter 3 sides of Triangle");
                    a = Integer.parseInt(br.readLine());
                    b = Integer.parseInt(br.readLine());
                    c = Integer.parseInt(br.readLine());
                    s = (a + b + c) / 2.0;
                    ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("Area of Triangle=" + ar);
                    break;
                }
                default: {
                    System.out.println("Wrong choice, Try Again");
                }

            }
            System.out.println("Do you want of continue(y/n)");
            choice = br.readLine();
        } while (choice.equalsIgnoreCase("y"));
    }
}
