import java.util.ArrayList;

public class Arraylistdemo {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("India"); arr.add("World");
        System.out.println(arr.get(0));
        arr.add("America"); arr.add("China");
        System.out.println(arr.get(3));
        arr.add(3,"Italy");
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.remove(4);
        System.out.println(arr);
    }
}
