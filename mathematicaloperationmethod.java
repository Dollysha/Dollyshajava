import java.util.Scanner;

public class mathematicaloperationmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter THe value of a and b");
       int a=sc.nextInt();
       int  b=sc.nextInt();
        abc h=new abc();
        int j=h.Add(a,b);
        int l=h.Subtract(a,b);
        int m=h.Multiply(a,b);
        int n=h.Divide(a,b);
       // int d = abc.Add(7, 5);
       // int e = abc.Subtract(9, 8);
       // int f = abc.Multiply(5, 4);
       // int g = abc.Divide(8, 4);
        //abc.Mod(10,2);
       // System.out.println(d);
        System.out.println(j);
        System.out.println(l);
       System.out.println(m);
       System.out.println(n);

    }

   public static class abc {
        int z;
         int Add(int a, int b) {
           int z = a + b;
return (z);
        }

        int Subtract(int a, int b) {
           int z = a - b;
            return (z);
        }

        static int Multiply(int a, int b) {
          int  z = a * b;
            return (z);
        }

         int Divide(int a, int b) {
           int z = a / b;
            return (z);
        }
        public  void Mod(int a, int b)
        {
            int z=a%b;
            System.out.println(z);
        }
    }
}
