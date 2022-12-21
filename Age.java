import java.util.Scanner;

public class Age
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=s.nextInt();
        if(a>=60) {
            System.out.println("Retired");
        }
        else if(a>=30 && a<60)
        {
            System.out.println("Focus on your job");
        }
        else if(a>=20 && a<30) {
            System.out.println("Study hard");
        }
        else if(a<20) {
            System.out.println("Enjoy your life");
        }
        else
        {
            System.out.println("Invalid age");
        }

    }
}
