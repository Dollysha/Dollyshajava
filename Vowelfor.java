import java.util.Scanner;

public class Vowelfor {
    public static void main(String[] args) {
        int m=0;
        System.out.println("Enter any String");
        Scanner s=new Scanner(System.in);
        String d=s.next();
        for(int i=0;i<d.length();i++)
        {
            char c=d.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='I'||c=='i'||c=='o'||c=='O'||c=='u'||c=='U')
            {
                m++;
            }

        }

        System.out.println("The total number of vowels in a sentence"+m);

    }
}
