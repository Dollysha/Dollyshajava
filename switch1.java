import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        System.out.println("Enter the day number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
                switch(num){
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                    default -> System.out.println("invalid");
                }
    }
}
