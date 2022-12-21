public class vararg {
    public void prod(int ...arr){
       int product=1,c=0;
       for (int i=0;i<arr.length;i++){
            c++;
           product=product*arr[i];
           System.out.print(arr[i]+" ");
       }
        //return product;
        System.out.println(arr.length);
        System.out.println("Total numbers present="+c);

    }

    public static void main(String[] args) {
vararg v=new vararg();
v.prod(9,4,2,3,9,5,1,6,3,1,4);

    }
}
