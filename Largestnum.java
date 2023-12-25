package Array;
import java.util.*;

public class Largestnum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);

        System.out.println("Enter the size of an array");
         int a[]=new int[r.nextInt()];
         
         for(int i=0;i<a.length;i++){
            System.out.println("Enter the element you want");
            a[i]=r.nextInt();
         }

        int large=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>large){
                large=a[i];
            }
        }
        System.out.println("Largest Element:"+large);
    }
    
}
