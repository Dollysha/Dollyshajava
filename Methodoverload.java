class Dolly {
    public static int cal(int a, int b, int c) {
        int l = a + b;
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


    public class Methodoverload {
        public static void main(String[] args) {
            System.out.println(Dolly1.cal(9, 5, 4));
            System.out.println(Dolly1.cal(9, 5));
            System.out.println(Dolly1.cal(9, 5, 4, 8));
            System.out.println(Dolly1.cal(9.8, 5));
        }
    }
}