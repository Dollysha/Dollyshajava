import java.util.Scanner;

class cl {//custom class

    double area;


    public void set(double r) {
        double a = 3.14 * r * r;
        this.area = a;
    }

    public double getter() {
        return area;
    }
}

    public class getterandsetter {
        public static void main(String[] args) {
            Scanner s=new Scanner((System.in));
            System.out.println("Enter the radius");
            int r=s.nextInt();
            cl c = new cl();
c.set(11.6);
                 System.out.println(c.getter());
        }
    }


