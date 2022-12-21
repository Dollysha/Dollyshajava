class Area{
    double Area(double r){
        double a=3.14*Math.pow(r,2);
        return (a);
    }
}
public class Areaofcircle {
    public static void main(String[] args) {
        Area a =new Area();
        System.out.println(a.Area(5));

    }
}
