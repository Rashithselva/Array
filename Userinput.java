package Array;
import java.util.*;

public class Userinput {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter tye size of an array");
        int []a=new int[r.nextInt()];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the element");
            a[i]=r.nextInt();
        }
        System.out.println("****************************");
        for(int b:a){
            System.out.println(b);
        }

    }
    
}
