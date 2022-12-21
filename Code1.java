import java.util.Scanner;

public class Code1 {
    public static void main(String[] args)
    {
        System.out.println("Enter the value of a");
        System.out.println("Enter the value of b");
        System.out.println("Enter the value of c");
        Scanner sd=new Scanner(System.in);
        int a=sd.nextInt();

        int b=sd.nextInt();
        int c=sd.nextInt();
        System.out.println(a>b && a>c);
        System.out.println(a>b || a>c);

    }

}
