import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int i=1;
        while(i<11){
            System.out.println(d*i);
            i++;

        }
    }
}
