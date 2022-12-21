class call{     // child
    // varible the class level in the chile class

    public  int cal_add(int x, int y){
        int sum=0;
        return sum;

    }
}


class call1 extends call{     // parent class

    public int cal_sub(int x,int y){
        sum=sum+3;     // we can access it in parent class
        System.out.println(sum);
        return x-y;

    }
}



public class Inheritsir {

    int s,v;   String str;
    public static void main(String[] args) {
        cal1 c=new cal1();
        c.cal_sub(2,5);
    }
}












