package Array;

public class Largestnum {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5};
        int large=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>large){
                large=a[i];
            }
        }
        System.out.println(large);
    }
    
}
