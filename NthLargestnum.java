package Array;
import java.util.*;

public class NthLargestnum {
    public static void main(String[] args) {
        Scanner r=new Scanner (System.in);

        System.out.println("Enter the largest number you want 1 to 6");

        int a[]={1,2,3,4,5,6};
        int largest=r.nextInt();
        int large=a[0];

        for(int i=1;i<=largest;i++){
            large=a[0];
            for(int j=0;j<a.length;j++){
                if(a[j]>large){
                    large=a[j];
                }
            }
            for(int j=0;j<a.length;j++){
                if(a[j]==large){
                    a[j]=-1;
                }
            }
        }
        System.out.println(large);
    }
    
}
