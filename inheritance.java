class cal {
public int cal_add(int x, int y) {
    return (x + y);
}
    public boolean cal_boo(){
        boolean b = true;
        return b;
    }
}

class cal2 extends cal{
    public int cal_sub(int x,int y){
        return (x-y);
    }
}
class cal3 extends cal2{
    public int cal_mul(int x,int y){
        return (x*y);
    }
}
class cal1 extends cal3{
public int cal_div(int x,int y){
    return x-y;
}
}
public class inheritance {
    public static void main(String[] args) {
        cal1 c=new cal1();
        int s=c.cal_add(7,8);
        int d=c.cal_div(8,4);
        boolean f=c.cal_boo();
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
    }
}
