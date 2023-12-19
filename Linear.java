package Array;
import java.util.*;

public class Linear {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);

        int []a={1,2,3,4,5};
        String res="not present";

        System.out.println("Enter the number");
        int num=r.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                res="present";
            }
        }
        System.out.println(res);

    }
    
}
