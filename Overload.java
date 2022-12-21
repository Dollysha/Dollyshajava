import java.util.Scanner;

class Dolly1 {
    public static int cal(int a, int b, int c) {
        int l = a + b + c;
        return l;
    }

    public static int cal(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int cal(int a, int b, int c, int d) {
        int f = a * b * c * d;
        return f;
    }

    public static double cal(double a, int b) {
        double f = a / b;
        return f;
    }
}
    public class Overload {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the value of a,b ,c and d");
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int d=s.nextInt();
            System.out.println(Dolly1.cal(9, 5, 4));
            System.out.println(Dolly1.cal(9, 5));
            System.out.println(Dolly1.cal(9, 5, 4, 8));
            System.out.println(Dolly1.cal(9.8, 5));
        }
    }





