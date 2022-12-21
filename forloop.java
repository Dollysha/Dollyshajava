import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        int c=0;
        System.out.println("Enter any string");
        Scanner s=new Scanner(System.in);
        String d=s.next();
        for(int i=0;i<d.length();i++) {

            c++;
        }
            System.out.println(c);

    }
}
