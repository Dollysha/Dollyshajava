import java.util.Scanner;

public class avg
{
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Enter five number");
        int p=a.nextInt();
        int q=a.nextInt();
        int r=a.nextInt();
        int s=a.nextInt();
        int t=a.nextInt();
        double av=(p+q+r+s+t)/5;
        System.out.println("Average is ="+av);
        if(av>=90)
        {
            System.out.println("Excellent");
        }
        else if(av>70 && av<90)
        {
            System.out.println("Average");

        }
        else {
            System.out.println("Work hard");
        }


    }
}
