 package Array;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int []a={8,9,7,8,6,5,4,3,2,1};
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    
}